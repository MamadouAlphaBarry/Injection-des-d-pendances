package org.sid.enset.impl;

import org.sid.enset.dao.IDao;
import org.sid.enset.dao.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    @Autowired
    private IDao dao;//couplage faible dependre de l'interface;
    @Override
    public double calcul() {
        double data= dao.getData();// j'appelle getData de l'interface; au momment de l'execution je definis l'implementation;
        double resultat= data*50.2;

        return resultat;
    }
    //Inject la variable dao de type IDao;
    public void setDao(IDao dao){
        this.dao= dao;
    }
}
