package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Arrays;

@MultipartConfig  //必须的
@WebServlet("/upload1.do")
public class ShangchuangServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {

        //获取表单中的数据
        //1.非文件域控件
        String username = request.getParameter("username");
        String[] hobbys = request.getParameterValues("hobby");


        System.out.println("姓名：" + username);
        System.out.println("兴趣：" + Arrays.toString(hobbys));


        //2.文件域控件
        Part part = request.getPart("touXiang");

        //文件的上传
        part.write("F:\\img\\4.jpg");

        request.getRequestDispatcher("/shangChuanSeccess.jsp").forward(request,response);



    }

    }
