package cn.jonathanwx.service;

import cn.jonathanwx.model.ReferenceDetail;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * create by lichangjiang
 * 2018.03.15 20:51
 */
public interface TestService {
    List<ReferenceDetail> list();
    Page<ReferenceDetail> pageQuery();
}
