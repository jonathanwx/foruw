package cn.jonathanwx.dao.impl;

import cn.jonathanwx.dao.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by lichangjiang
 * 2018.03.15 20:25
 */
@Service
public class DaoImpl<T> implements Dao<T> {


    @Resource
    private SessionFactory sessionFactory;


    private Session getSession() {
        if (this.sessionFactory.getCurrentSession() == null)
            this.sessionFactory.openSession();
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public List<T> list(String hql) {
        return getSession().createQuery(hql).list();
    }
}
