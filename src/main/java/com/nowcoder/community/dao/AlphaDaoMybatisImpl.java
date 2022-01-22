package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary  //体现面向接口编程的思想 实现类发生改变 不会受影响  定义一个primary优先级
public class AlphaDaoMybatisImpl implements AlphaDao{

    @Override
    public String Select() {
        return "MyBatis";
    }
}
