package com.hy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisessio {
    private static SqlSession session=null;
    private static  SqlSessionFactory sqlSessionFactory;
    static{
        try {
            InputStream stream= Resources.getResourceAsStream("sqlMapConfig.xml");
              sqlSessionFactory=new SqlSessionFactoryBuilder().build(stream);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static SqlSession sessio(){
        if(session==null){
            session=sqlSessionFactory.openSession(true);//拿到session
        }
        return session;
    }
}
