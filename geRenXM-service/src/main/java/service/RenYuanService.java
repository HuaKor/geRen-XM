package service;

import dao.RenYuanDao;
import entity.PageBean;
import entity.RenYuanEntity;

import java.util.List;

public class RenYuanService {
    //private static RenYuanDao renYuanDao;
    private static RenYuanDao renYuanDao = new RenYuanDao();

    //插询
    public List<RenYuanEntity> getAll(){
        return renYuanDao.getAll();
    }

    //添加
    public void insert(RenYuanEntity renYuanEntity){
         renYuanDao.insert(renYuanEntity);
    }
    //删除
    public void delete(int id){
        renYuanDao.delete(id);
    }

    //修改
    public void update(int id, String name, String sex, String height, int sjhm){
         renYuanDao.update(id,name,sex,height,sjhm);
    }

}
