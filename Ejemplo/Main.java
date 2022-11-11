package Ejemplo;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args[])
    {
        Cliente cl1=new Cliente("Antony","00001",20000);
        Cliente cl2=new Cliente("Paolo","00002",25000);
        Cliente cl3=new Cliente("Jhony","00003",6050);
        Cliente cl4=new Cliente("Danny","00004",2022);

        Set<Cliente> clientesBanco = new HashSet<Cliente>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        for (Cliente cliente : clientesBanco){
            System.out.println(cliente.getNombre() + " " + cliente.getNumCuenta()+ " " + cliente.getSaldo());
        }
    }
}
