package com.servlet;

import com.JDBC.CommentDAO;
import com.JDBC.GoodDAO;
import com.POJO.GoodBean;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/addToCart")
public class AddToCart extends HttpServlet{
    //不用这个了
    //不用这个了
    //不用这个了
    //不用这个了
    //不用这个了
    //不用这个了
    //不用这个了
    //不用这个了

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("the serlvet is working!");
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("author");
        String num_id = String.valueOf(request.getSession().getAttribute("good id"));




        /*
        //String author = request.getParameter("author");
        String content = request.getParameter("content");
        String num_id = String.valueOf(request.getSession().getAttribute("article id"));
        CommentDAO cd = new CommentDAO();
        int id = 0;
        if (content.length() <= 500) {
            id = -1;
            try {
                id = Integer.parseInt(num_id);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
//            CommentBean cb = new CommentBean("commentTest", 0, id, content);
//            cd.addComment(cb);

            response.sendRedirect(request.getContextPath()+"/articles-details.jsp?id=" + id);
        } else {
            request.setAttribute("addCommentMsg", "Content should be within 500 characters.");
            request.getRequestDispatcher("articles-details.jsp?id=" + id).forward(request, response);
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}