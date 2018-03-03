package servlet;

import com.google.gson.Gson;
import entity.RenYuanEntity;
import service.RenYuanService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/queryRenYuan.do")
public class RenYuanServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // System.out.println("hhhhhhhhhhhhhhhhhh");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        RenYuanService renYuanService = new RenYuanService();
        List<RenYuanEntity> list = renYuanService.getAll();

        String  string = new Gson().toJson(list);

    //转发
      // req.getRequestDispatcher("/table.jsp").forward(req,resp);


        PrintWriter out = resp.getWriter();

        out.println(string);
            System.out.println(string+"\n");

        out.flush();
        out.close();

    }

}
