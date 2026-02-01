package application;
import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Department;
import modelEntities.Seller;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}