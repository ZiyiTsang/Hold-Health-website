package com.test;

import com.JDBC.UserDAO;
import com.test.email;

import javax.mail.MessagingException;
import java.io.IOException;
import com.test.email;


public class TestUserDAO {
    public static void main(String[] args) throws IOException, MessagingException {
        //UserDAO ud=new UserDAO();
//        ud.newUser("ziyi","ziyi7777");
//        ud.newUser("xiaotong","xiaotong7777");
//        ud.newUser("aofan","aofan7777");
//        ud.newUser("yanghang","yanghang7777");
//        ud.newUser("xianglong","xianglong7777");
        //System.out.println(ud.validation("ziyi","0000"));
//        ud.updateUser("ziyi","0000");
        email mail=new email();
        mail.sendEmail("swe2009512@xmu.edu.my",1234);//1034337098@qq.com
        //mail.email();

    }
    }

