package com.yzf.myblog.user.dao;

import com.yzf.myblog.user.entity.MUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

/**
 * (MUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-07 14:38:44
 */

public interface MUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param mUser 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MUser> queryAllByLimit(MUser mUser, @Param("pageable") SpringDataWebProperties.Pageable pageable);

    /**
     * 统计总行数
     *
     * @param mUser 查询条件
     * @return 总行数
     */
    long count(MUser mUser);

    /**
     * 新增数据
     *
     * @param mUser 实例对象
     * @return 影响行数
     */
    int insert(MUser mUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MUser> entities);

    /**
     * 修改数据
     *
     * @param mUser 实例对象
     * @return 影响行数
     */
    int update(MUser mUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

