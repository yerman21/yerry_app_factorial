package com.example.alumfial1.app_factorial.model;

import com.example.alumfial1.app_factorial.interfaces.Interfaces;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class FactorialModel implements Interfaces.Model{
    private Interfaces.Presenter presentador;
    private int resultado;

    public FactorialModel(Interfaces.Presenter presentador){
        this.presentador=presentador;
    }

    @Override
    public void factorial(String n) {
        long factorial = 1;
        int num = Integer.parseInt(n);
        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }
        presentador.mostrarResultado(String.valueOf(factorial));
    }
}
