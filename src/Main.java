import builders.SanduicheBuilder;
import entidades.Sanduiche;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        comBuilder();
    }

    public static void comBuilder(){
        Sanduiche xBurger = new SanduicheBuilder()
                .setPao("Hamburguer")
                .setCarne("Boi")
                .build();

        Sanduiche xSalada = new SanduicheBuilder()
                .setPao("Hamburger")
                .setCarne("Boi")
                .setSalada("Alface")
                .build();

        System.out.println(xBurger.toString());
        System.out.println(xSalada.toString());
    }

    public static void semBuilder(){
        Sanduiche xBurguer = new Sanduiche("Hamburger", "Boi");
        Sanduiche xSalada = new Sanduiche("Hambuguer", "boi", "Alface");
        Sanduiche xFrango = new Sanduiche("Hambuguer", "frango",
                "Alface", true);

        System.out.println(xBurguer.toString());
        System.out.println(xSalada.toString());
        System.out.println(xFrango.toString());
    }
}