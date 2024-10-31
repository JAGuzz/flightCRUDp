package collectionsPractice;

import java.util.HashSet;
import java.util.Set;

public class HerosPartyApp {

    public static void main(String[] args) {

        System.out.println("Welcome to heros party");

        Set<String> superHeros = new HashSet<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Mujer Maravilla".toUpperCase());
        superHeros.add("Gatubela");
        superHeros.add("Satanna");
        superHeros.add("Flecha verde".toUpperCase());

        if(superHeros.contains("Flecha verde".toUpperCase())){
            System.out.println("El flecha verde anda de peda");
        }

        //lego flash tarde como siempre
        superHeros.add("Flash");

        if(!superHeros.contains("Acuaman")){
            System.out.println("El veracruzano no llego");
        }

        //llego un imitador de superman, pero cuenta como otro heroe??
        superHeros.add("Superman");

        if (superHeros.isEmpty()){
            System.out.println("La fiesta se acabo");
        } else {
            System.out.println("La fiesta sigue, aun quedan " + superHeros.size() + " heroes en la fiesta.");
        }

    }
}
