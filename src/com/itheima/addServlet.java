package com.itheima;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "addServlet", value = "/addServlet")
public class addServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String soure = request.getParameter("soure");
        if (name.equals("") || password.equals("") || soure.equals("")) {
            request.getRequestDispatcher("/add.jsp").forward(request,response);
            return;
        }
        String realPath = getServletContext().getRealPath("/stu.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(realPath,true));
        bufferedWriter.write(name + "," + password + "," + soure);
        bufferedWriter.newLine();
        bufferedWriter.close();
        response.getWriter().write("添加成功,1秒后返回");
        response.setHeader("Refresh", "2;URL=/F/index.jsp");

       // response.sendRedirect("/F/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }
}
