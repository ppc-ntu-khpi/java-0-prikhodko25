public class Shirt {
  public int shirtID = 56; 
  public String description = "My Shirt"; 
  public char colorCode = 'R';
  public double price = 100; 
  public int quantityInStock = 34; 
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } 
}    
