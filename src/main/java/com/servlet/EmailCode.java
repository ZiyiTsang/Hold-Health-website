package com.servlet;

import com.JDBC.CommentDAO;
import com.POJO.CommentBean;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.test.email;

import javax.mail.MessagingException;
import java.io.IOException;

@WebServlet("/emailCode")
public class EmailCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("the serlvet is working!");
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        int code = 0;
        email mail = new email();
        HttpSession session= request.getSession();


        code = (int) ((Math.random()*9+1)*1000+(Math.random()*9+1)*100+(Math.random()*9+1)*10+(Math.random()*9+1));
        System.out.println(code);
        try {
            mail.sendEmail(email, code, true);//1034337098@qq.com

            session.setAttribute("code",String.valueOf(code));
            session.setAttribute("email",email);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        String id = "1";
        session.setAttribute("id",id);
        request.getRequestDispatcher("register-email.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);

    }
}
