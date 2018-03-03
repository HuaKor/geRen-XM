package service;

import dao.ShopCartDao;
import entity.ShopCartEntity;

import java.util.List;

public class ShopCartService  {
    ShopCartDao dao = new ShopCartDao();

    public List<ShopCartEntity> getAll(){
        return dao.getAll();
    }
}
