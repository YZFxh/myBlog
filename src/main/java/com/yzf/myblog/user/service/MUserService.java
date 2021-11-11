package com.yzf.myblog.user.service;

import com.yzf.myblog.user.entity.MUser;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (MUser)表服务接口
 *
 * @author makejava
 * @since 2021-11-07 14:38:45
 */
public interface MUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MUser queryById(Long id);

    /**
     * 分页查询
     *
     * @param mUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    //Page<MUser> queryByPage(MUser mUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mUser 实例对象
     * @return 实例对象
     */
    MUser insert(MUser mUser);

    /**
     * 修改数据
     *
     * @param mUser 实例对象
     * @return 实例对象
     */
    MUser update(MUser mUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
