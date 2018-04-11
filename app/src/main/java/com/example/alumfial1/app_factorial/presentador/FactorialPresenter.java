package com.example.alumfial1.app_factorial.presentador;

import com.example.alumfial1.app_factorial.interfaces.Interfaces;
import com.example.alumfial1.app_factorial.model.FactorialModel;
import com.example.alumfial1.app_factorial.view.MainActivity;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class FactorialPresenter implements Interfaces.Presenter {
    private Interfaces.Model model;
    private Interfaces.View view;

    public FactorialPresenter(MainActivity view){
            this.view=view;
            model=new FactorialModel(this);
    }

    @Override
    public void mostrarResultado(String r) {
        if(view!=null){
            view.mostrarResultado(r);
        }
    }

    @Override
    public void factorial(String n) {
        if(view!=null){
            model.factorial(n);
        }
    }
}
