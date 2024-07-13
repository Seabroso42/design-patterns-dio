package Singleton;

public class LazyTeste {
    public static void main(String[] args) {
        //Lazy - deve retornar o mesmo endereco de memoria mesmo com mais de uma instancia
        LazySingleton laz = LazySingleton.getInstance();
        System.out.println(laz);

        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

    }
}
