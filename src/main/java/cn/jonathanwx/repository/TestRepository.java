package cn.jonathanwx.repository;

import cn.jonathanwx.model.ReferenceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * create by lichangjiang
 * 2018.04.11 09:13
 */
public interface TestRepository extends JpaRepository<ReferenceDetail, Integer> {
}
