package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.RenYuanEntity;
import org.apache.struts2.ServletActionContext;
import service.RenYuanService;

import javax.servlet.http.HttpServletRequest;


public class InsertAction extends ActionSupport {

    public String RenYUanInsert(){
        RenYuanEntity renYuanEntity = new RenYuanEntity();
        //这个s是重点
        HttpServletRequest request = ServletActionContext.getRequest();

        //把表单中的内容设置
        renYuanEntity.setId(Integer.parseInt(request.getParameter("id")));
        renYuanEntity.setName(request.getParameter("name"));
        renYuanEntity.setSex(request.getParameter("sex"));
       // renYuanEntity.setHeight(request.getParameter("height"));
       renYuanEntity.setHeight(Float.parseFloat(request.getParameter("height")));

        //吧手机号码(float)转为字符串
        renYuanEntity.setSjhm(Integer.parseInt(request.getParameter("sjhm")));

        //创建service
        RenYuanService service = new RenYuanService();
        service.insert(renYuanEntity);
        System.out.println("添加成功");
        System.out.println("添加成功");
        return "success";
    }
}
