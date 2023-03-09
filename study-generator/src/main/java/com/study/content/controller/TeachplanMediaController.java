package com.study.content.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.content.service.TeachplanMediaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author paidx0
 */
@Slf4j
@RestController
@RequestMapping("teachplanMedia")
public class TeachplanMediaController {

    @Autowired
    private TeachplanMediaService  teachplanMediaService;
}
