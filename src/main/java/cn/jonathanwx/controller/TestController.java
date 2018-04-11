package cn.jonathanwx.controller;

import cn.jonathanwx.model.ReferenceDetail;
import cn.jonathanwx.service.TestService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by lichangjiang
 * 2018.03.15 20:12
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/list")
    public Page<ReferenceDetail> list() {
        return testService.pageQuery();
    }

}
