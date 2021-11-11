package com.yzf.myblog.blog.service.impl;

import com.yzf.myblog.blog.entity.MBlog;
import com.yzf.myblog.blog.dao.MBlogDao;
import com.yzf.myblog.blog.service.MBlogService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (MBlog)表服务实现类
 *
 * @author makejava
 * @since 2021-11-07 14:37:17
 */
@Service("mBlogService")
public class MBlogServiceImpl implements MBlogService {
    @Resource
    private MBlogDao mBlogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MBlog queryById(Long id) {
        return this.mBlogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<MBlog> queryByPage(MBlog mBlog, PageRequest pageRequest) {
//        long total = this.mBlogDao.count(mBlog);
//        return new PageImpl<>(this.mBlogDao.queryAllByLimit(mBlog, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param mBlog 实例对象
     * @return 实例对象
     */
    @Override
    public MBlog insert(MBlog mBlog) {
        this.mBlogDao.insert(mBlog);
        return mBlog;
    }

    /**
     * 修改数据
     *
     * @param mBlog 实例对象
     * @return 实例对象
     */
    @Override
    public MBlog update(MBlog mBlog) {
        this.mBlogDao.update(mBlog);
        return this.queryById(mBlog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mBlogDao.deleteById(id) > 0;
    }
}
