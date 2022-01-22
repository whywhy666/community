package com.nowcoder.community.dao;


import org.springframework.stereotype.Repository;

@Repository("AlphaHibernate")  //给bean赋予名字
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String Select() {
        return "Hibernate";
    }
}
