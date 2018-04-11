package cn.jonathanwx.service.impl;


import cn.jonathanwx.model.ReferenceDetail;
import cn.jonathanwx.repository.TestRepository;
import cn.jonathanwx.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by lichangjiang
 * 2018.03.15 20:52
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestRepository testRepository;

    @Override
    public List<ReferenceDetail> list() {

        return testRepository.findAll();
    }
}
