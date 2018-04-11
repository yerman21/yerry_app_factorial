package com.example.alumfial1.app_factorial.interfaces;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public interface Interfaces {
    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void factorial(String n);
    }
    interface Model{
        void factorial(String n);
    }
}
