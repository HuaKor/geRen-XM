package servlet;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.service(req, resp);
        //获取表单中的值
        String name = req.getParameter("user");
        String pass = req.getParameter("pass");



        if(name!=null && name.equals("huakor") && pass.equals("123")){
            //吧用户名设置在request
            req.setAttribute("username",name);
            req.getRequestDispatcher("/index1.html").forward(req,resp);
            System.out.println("登录成功！");

        }else {
           // alert("");
            System.out.println("出错了！");
        }




    }
}

