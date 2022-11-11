package Ejemplo02;

import java.util.ArrayList;

public class MainCelular {

    public static void main(String args[])
    {
        Celular c1= new Celular("Lenovo",2012);
        Celular c2= new Celular("Xiaomi",2020);
        Celular c3= new Celular("Samsung",2014);

        ArrayList<Celular> primeraCELULAR =new ArrayList<>();

        System.out.println(primeraCELULAR.size());
        System.out.println(primeraCELULAR);

        System.out.println("---------------------------");

        primeraCELULAR.add(c1);
        primeraCELULAR.add(c2);
        primeraCELULAR.add(c3);

        System.out.println(primeraCELULAR.size());
        System.out.println(primeraCELULAR);

    }

}
