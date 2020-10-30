package com.service;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service//创建对象
//事务操作，全都完成提交事务，中间出错，事务回滚
@Transactional(propagation = Propagation.REQUIRED)//可以加到类上。也可以加到方法上，，表示为这个方法添加了事务，添加到类上，表示为类中所有方法都添加了事务
public class UserService {
    //注入dao
    @Autowired

    private UserDao userDao;

    public void accountMoney(){
            //少100
            userDao.reducemoney();
            int i = 100/0;
            //多100
            userDao.addmoney();




    }




}
