package com.Filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "StuFilter",value = {"/add.jsp","/show.jsp"})
public class StuFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        HttpServletResponse httpServletResponse= (HttpServletResponse) response;

        Object name = httpServletRequest.getSession().getAttribute("name");
        System.out.println(name);
        if (name==null ||name.equals("")){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/index.jsp");
            return;
        }
        chain.doFilter(request, response);
    }
}
