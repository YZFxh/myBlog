package com.yzf.myblog.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzf.myblog.user.entity.MUser;
import com.yzf.myblog.user.dao.MUserDao;
import com.yzf.myblog.user.service.MUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (MUser)表服务实现类
 *
 * @author makejava
 * @since 2021-11-07 14:38:45
 */
@Service("mUserService")
public class MUserServiceImpl implements MUserService {
    @Resource
    private MUserDao mUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MUser queryById(Long id) {
        return this.mUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<MUser> queryByPage(MUser mUser, PageRequest pageRequest) {
//        long total = this.mUserDao.count(mUser);
//        return new PageImpl<>(this.mUserDao.queryAllByLimit(mUser, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param mUser 实例对象
     * @return 实例对象
     */
    @Override
    public MUser insert(MUser mUser) {
        this.mUserDao.insert(mUser);
        return mUser;
    }

    /**
     * 修改数据
     *
     * @param mUser 实例对象
     * @return 实例对象
     */
    @Override
    public MUser update(MUser mUser) {
        this.mUserDao.update(mUser);
        return this.queryById(mUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mUserDao.deleteById(id) > 0;
    }
}
