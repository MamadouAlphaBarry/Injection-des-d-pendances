package org.sid.enset;

import org.sid.enset.impl.IDaoImpl;
import org.sid.enset.impl.IMetierImpl;

public class MainInstanciationStatique {
    public static void main(String[] args) {
        IMetierImpl metier= new IMetierImpl();
        //je definis l'implementation de dao utilisè
        metier.setDao(new IDaoImpl());
        System.out.println(metier.calcul());
    }
}