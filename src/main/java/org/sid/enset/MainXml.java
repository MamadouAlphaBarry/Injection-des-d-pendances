package org.sid.enset;

import org.sid.enset.dao.IDao;
import org.sid.enset.dao.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainXml {
    public static void main(String[] args) throws Exception {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= context.getBean(IMetier.class);

        double resultat= metier.calcul();
        System.out.println(resultat);

    }
}