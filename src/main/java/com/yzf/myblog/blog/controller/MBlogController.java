package com.yzf.myblog.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzf.myblog.blog.entity.MBlog;
import com.yzf.myblog.blog.service.MBlogService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MBlog)表控制层
 *
 * @author makejava
 * @since 2021-11-07 14:36:46
 */
@RestController
@RequestMapping("mBlog")
public class MBlogController {
    /**
     * 服务对象
     */
    @Resource
    private MBlogService mBlogService;

    /**
     * 分页查询
     *
     * @param mBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<MBlog>> queryByPage(MBlog mBlog, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.mBlogService.queryByPage(mBlog, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MBlog> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.mBlogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mBlog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MBlog> add(MBlog mBlog) {
        return ResponseEntity.ok(this.mBlogService.insert(mBlog));
    }

    /**
     * 编辑数据
     *
     * @param mBlog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MBlog> edit(MBlog mBlog) {
        return ResponseEntity.ok(this.mBlogService.update(mBlog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.mBlogService.deleteById(id));
    }

}

