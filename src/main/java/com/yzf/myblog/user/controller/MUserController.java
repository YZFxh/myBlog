package com.yzf.myblog.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzf.myblog.user.entity.MUser;
import com.yzf.myblog.user.service.MUserService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MUser)表控制层
 *
 * @author makejava
 * @since 2021-11-07 14:38:42
 */
@RestController
@RequestMapping("mUser")
public class MUserController {
    /**
     * 服务对象
     */
    @Resource
    private MUserService mUserService;

    /**
     * 分页查询
     *
     * @param mUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<MUser>> queryByPage(MUser mUser, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.mUserService.queryByPage(mUser, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MUser> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.mUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MUser> add(MUser mUser) {
        return ResponseEntity.ok(this.mUserService.insert(mUser));
    }

    /**
     * 编辑数据
     *
     * @param mUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MUser> edit(MUser mUser) {
        return ResponseEntity.ok(this.mUserService.update(mUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.mUserService.deleteById(id));
    }

}

