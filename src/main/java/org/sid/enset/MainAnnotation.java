package org.sid.enset;

import org.sid.enset.dao.IDao;
import org.sid.enset.dao.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainAnnotation {
    public static void main(String[] args) throws Exception {
        ApplicationContext context= new  AnnotationConfigApplicationContext("org.sid.enset.impl");
        IMetier metier= context.getBean(IMetier.class);
        double resutlat= metier.calcul();
        System.out.println(resutlat);

    }
}