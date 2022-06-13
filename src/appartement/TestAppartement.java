package appartement;

import java.util.ArrayList;

public class TestAppartement {
    public static void main(String[] args) {
        Appartement[] tableau;
        tableau = new Appartement[3];

        tableau[0] = new Appartement("25 rue de la bonne foi", 89.56, 2, 1);
        tableau[1] = new Appartement("12 rue de la mauvaise foi", 100.50, 3, 2);
        tableau[2] = new Appartement("5 rue de la foi", 150.00, 4, 3);

    }
}
