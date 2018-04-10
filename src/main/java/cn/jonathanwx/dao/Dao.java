package cn.jonathanwx.dao;

import java.util.List;

/**
 * create by lichangjiang
 * 2018.03.15 20:25
 */
public interface Dao<T> {

    public List<T> list(String hql);
}
