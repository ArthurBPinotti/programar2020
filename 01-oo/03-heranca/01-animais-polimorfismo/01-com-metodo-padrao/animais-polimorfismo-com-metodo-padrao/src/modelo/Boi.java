package modelo;

import java.util.Date;

public class Boi extends Animal {
    
    @Override
    public void comer(){
        System.out.print("ruminando");
    }
    public int idadeEmMeses() {
        return dtNasc.monthsBetween(new Date());
    }    
}