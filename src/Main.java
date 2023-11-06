//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        fruits();
    }

    public static void fruits() {
        HashSet<String> fruit = new HashSet<String>();
        fruit.add("Mele");
        fruit.add("Kiwi");
        fruit.add("Pesche");
        fruit.add("Ananas");
        fruit.add("Pere");
        System.out.println("Elementi nell'HashSet:" + fruit);
        System.out.println("Dimensione dell'HashSet: " + fruit.size());

    }

}
