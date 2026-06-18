package structural.composite;

public class CompositeApp {

    public static void main(String[] args) {

        CartComponent mouse = new ProductItem("Mouse Gamer", 150.00);
        CartComponent keyboard = new ProductItem("Keyboard Mechanical", 350.00);
        CartComponent monitor = new ProductItem("Monitor 27''", 1200.00);

        ProductBundle gamingSetup = new ProductBundle("Gaming Setup");
        gamingSetup.add(mouse);
        gamingSetup.add(keyboard);
        gamingSetup.add(monitor);

        CartComponent headset = new ProductItem("Headset", 200.00);

        ProductBundle fullCart = new ProductBundle("Full Cart");
        fullCart.add(gamingSetup);
        fullCart.add(headset);

        fullCart.print();
    }

}
