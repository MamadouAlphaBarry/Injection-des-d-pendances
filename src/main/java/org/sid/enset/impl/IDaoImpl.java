package org.sid.enset.impl;

import org.sid.enset.dao.IDao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Je recupere les data dans la source de donnèe  approprièe");
        double data=85.52;
        return data;
    }
}
