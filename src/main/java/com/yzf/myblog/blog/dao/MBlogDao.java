package com.yzf.myblog.blog.dao;

import com.yzf.myblog.blog.entity.MBlog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (MBlog)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-07 14:36:48
 */

public interface MBlogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MBlog queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param mBlog 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    //List<MBlog> queryAllByLimit(MBlog mBlog, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param mBlog 查询条件
     * @return 总行数
     */
    long count(MBlog mBlog);

    /**
     * 新增数据
     *
     * @param mBlog 实例对象
     * @return 影响行数
     */
    int insert(MBlog mBlog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MBlog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MBlog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MBlog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MBlog> entities);

    /**
     * 修改数据
     *
     * @param mBlog 实例对象
     * @return 影响行数
     */
    int update(MBlog mBlog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

