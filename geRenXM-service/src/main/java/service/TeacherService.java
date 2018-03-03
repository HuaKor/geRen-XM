package service;

import dao.TeacherDao;
import entity.PageBean;
import entity.TeacherEntity;

import java.util.List;

public class TeacherService {

    static TeacherDao teacherDao = new TeacherDao();
    public static PageBean getPageBean(int pageSize, int page) {
        PageBean pageBean = new PageBean() ;
        String hql = "from TeacherEntity" ;
        int allRows = teacherDao.getAllRowCount(hql) ;//获取总记录数
        System.out.println(allRows + "出来了");
        int totalPage = pageBean.getTotalPages(pageSize, allRows) ;//获取总页数
        int currentPage = pageBean.getCurPage(page) ;//获取当前页数
        int offset = pageBean.getCurrentPageOffset(pageSize,currentPage) ;

        List<TeacherEntity> list = teacherDao.queryByPage(hql,offset,pageSize) ;

        pageBean.setList(list);
        pageBean.setAllRows(allRows);//设置总记录数
        pageBean.setCurrentPage(currentPage);//设置当前页
        pageBean.setTotalPage(totalPage);//设置总页数
        return pageBean;
    }
}
