public class Shirt {

  public int shirtID = 15;
  public String description = "Really cool crimson T-shirt!";
  public String colorCode = "Crimson";
  public double price = 50.7;
  public int quantityInStock = 0;
 
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}
