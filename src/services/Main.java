package services;

import Dao.EmployceDao;

public class Main {

    public static void main(String[] args){

        EmployceDao employceDao = new EmployceDao();
        //employceDao.showAll();
        System.out.println(employceDao.getAllEmployce());

    }

}
