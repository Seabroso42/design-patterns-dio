package Facade;

import subsystem.RandomApi;
import subvariant.RandomService;

//utilizado pra consumir dados e disponibiliza-los de maneira mais simples.
public class Facade {

    public static void main(String[] args) {
        Facade.getInstance().moverIdiota("dudu");
    }


    private static Facade instance = new Facade();
    private Facade(){super();}
    public static Facade getInstance(){
        return instance;
    }

    public void moverIdiota(String nome){
      String hab=  RandomApi.getInstancia().descobrirHabilidade();
      String hob=  RandomApi.getInstancia().descobrirHobbie();
      String name=  RandomApi.getInstancia().descobrirNome();



        RandomService.gravarRandom(name, hab, hob);
    }
}
