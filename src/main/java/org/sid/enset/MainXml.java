package org.sid.enset;

import org.sid.enset.dao.IDao;
import org.sid.enset.dao.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainXml {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDao= Class.forName(daoClassName);
        IDao daoImpl = (IDao) cDao.getConstructor().newInstance();
       // System.out.println(daoImpl.getData());
        String metierClassName= scanner.nextLine();
        Class metierClassNameImpl= Class.forName(metierClassName);
        IMetier metierImpl = (IMetier) metierClassNameImpl.getConstructor().newInstance();
        Method setDao= metierClassNameImpl.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metierImpl,daoImpl);
        double resultat= metierImpl.calcul();
        System.out.println(resultat);

    }
}