package com.yzf.myblog.blog.service;

import com.yzf.myblog.blog.entity.MBlog;


/**
 * (MBlog)表服务接口
 *
 * @author makejava
 * @since 2021-11-07 14:37:15
 */
public interface MBlogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MBlog queryById(Long id);

    /**
     * 分页查询
     *
     * @param mBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    //Page<MBlog> queryByPage(MBlog mBlog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mBlog 实例对象
     * @return 实例对象
     */
    MBlog insert(MBlog mBlog);

    /**
     * 修改数据
     *
     * @param mBlog 实例对象
     * @return 实例对象
     */
    MBlog update(MBlog mBlog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
