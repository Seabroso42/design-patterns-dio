package subsystem;

public class RandomApi {
    private static RandomApi instancia = new RandomApi();

    private RandomApi(){
        super();
    }

    public static RandomApi getInstancia(){
        return instancia;
    }

    public String descobrirNome(){
        return "Eduarduck";
    }
    public String descobrirHabilidade(){
        return "Mestre do Crime";
    }
    public String descobrirHobbie(){
        return "passear de lancha na lagoa com Roger o Castor";
    }
}
