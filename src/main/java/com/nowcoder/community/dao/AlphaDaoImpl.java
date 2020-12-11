package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;
//自定义容器名字
@Repository("alphaDaoImpl")
public class AlphaDaoImpl implements AlphaDao{
    @Override
    public String select() {
        return "AlphaDaoImpl";
    }
}
