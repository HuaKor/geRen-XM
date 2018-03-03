package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.RenYuanEntity;
import org.apache.struts2.ServletActionContext;
import service.RenYuanService;

import javax.servlet.http.HttpServletRequest;

public class updateAction extends ActionSupport {

     public  String update(){
        RenYuanService renYuanService = new RenYuanService();
        RenYuanEntity renYuanEntity = new RenYuanEntity();

        HttpServletRequest request = ServletActionContext.getRequest();

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String height = request.getParameter("height");
        int sjhm = Integer.parseInt(request.getParameter("sjhm"));

        renYuanService.update(id,name,sex,height,sjhm);
        return "update";
    }
}
