package com.nowcoder.community.service;
import com.nowcoder.community.dao.AlphaDao;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("AlphaService 构造器");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("AlphaService 销毁");
    }
    @PostConstruct
    //上述注解的意思表示是在构造器之后调用
    public void init(){
        System.out.println("初始化service");
    }

    public String find(){
        return alphaDao.select();
    }
}
