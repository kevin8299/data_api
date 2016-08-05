package com.servlet.mine;

/**
 * Created by Administrator on 2016/6/14.
 */
import com.alibaba.druid.filter.stat.StatFilter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class HelloServlet extends HttpServlet//第一步：扩展HttpServlet抽象类
{

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)throws IOException,ServletException{

        StatFilter statFilter = new StatFilter();
        if(null == request.getCookies())
            response.addCookie(new Cookie("zgl", "hahahaha"));
    }

    //第二步：覆盖doGet()方法
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws IOException,ServletException{
        //第三步：获取HTTP请求中的参数信息
        String clientName=request.getParameter("clientName");
        if(clientName!=null)
            clientName=new String(clientName.getBytes("ISO-8859-1"),"GB2312");
        else
            clientName="我的朋友";

        Enumeration<String> headers = request.getHeaderNames();

        while(headers.hasMoreElements())
            System.out.println("zgl: " + headers.nextElement());


        //第四步：生成HTTP响应结果
        PrintWriter out;
        String title="HelloServlet";
        String heading1="HelloServlet的doGet方法的输出：";
        //set content type
        response.setContentType("text/html;charset=GB2312");
        //write html page
        out=response.getWriter();
        out.print("<HTML><HEAD><TITLE>"+title+"</TITLE>");
        out.print("</HEAD><BODY>");
        out.print(heading1);
        out.println("<h1><p>"+clientName+":您好</h1>");
        out.print("</BODY></HTML>");

        out.close();
    }
}
