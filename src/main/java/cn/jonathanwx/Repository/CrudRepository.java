package cn.jonathanwx.Repository;

import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Optional;

/**
 * Created by lichangjiang on 2018.04.10.
 */
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {

    <S extends T> S save(S entity);

    Optional<T> findById(ID primaryKey);

    Iterable<T> findAll();

    long count();

    void delete(T entity);

    boolean existsById(ID primaryKey);
}
