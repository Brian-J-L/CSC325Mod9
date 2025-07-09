//Uses the Abstract Factory to create and display outfits
public class A_Garment_Simulator {
    // Each outfit has a Top, Pants, and Shoes
    private Top top;
    private Pants pants;
    private Shoes shoes;
    // Constructor takes a garment factory (example CasualFactory) and uses it to create a coordinated outfit
    public A_Garment_Simulator(GarmentFactory factory) {
        top = factory.createTop();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }
    // Displays the full outfit by calling display() on each garment
    public void displayOutfit() {
        top.display();
        pants.display();
        shoes.display();
    }

    public static void main(String[] args) {
/**
 * For updating the catalog with new garments using example of a sporty set:
 * 1. Create 3 new classes for the new style:
 *       SportyTop.java      > implements Top
 *       SportyPants.java    > implements Pants
 *       SportyShoes.java    > implements Shoes
 *
 * 2. Create a new factory class:
 *       SportyFactory.java  > implements GarmentFactory
 *        Implement methods:
 *            createTop() > return new SportyTop();
 *            createPants() > return new SportyPants();
 *            createShoes() > return new SportyShoes();
 *
 * 3. In this file, update the factory you want to display:
 *      ex. GarmentFactory factory = new SportyFactory();
 */
//Testing all current factories:
        System.out.println("Professional Outfit:");
        GarmentFactory factory1 = new ProfessionalFactory();
        A_Garment_Simulator simulator1 = new A_Garment_Simulator(factory1);
        simulator1.displayOutfit();

        System.out.println("Casual Outfit:");
        GarmentFactory factory2 = new CasualFactory();
        A_Garment_Simulator simulator2 = new A_Garment_Simulator(factory2);
        simulator2.displayOutfit();

        System.out.println("Party Outfit:");
        GarmentFactory factory3 = new PartyFactory();
        A_Garment_Simulator simulator3 = new A_Garment_Simulator(factory3);
        simulator3.displayOutfit();
    }
}