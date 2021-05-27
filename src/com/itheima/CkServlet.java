package com.itheima;

import com.domin.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CkServlet", value = "/CkServlet")
public class CkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String realPath = getServletContext().getRealPath("/stu.txt");
        List<Student> list=new ArrayList<>();
        if (new File(realPath).exists()){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(realPath));
            String str;
            while ((str=bufferedReader.readLine())!=null){
                Student student = new Student();
                String[] split = str.split(",");
                student.setName(split[0]);
                student.setBang(Integer.valueOf(split[2]));
                student.setSource(Integer.valueOf(split[1]));
                list.add(student);
            }
            bufferedReader.close();
        }
        request.getSession().setAttribute("list",list);
        response.sendRedirect(request.getContextPath()+"/show.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
