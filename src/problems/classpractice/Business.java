package problems.classpractice;

class Product{
   private int itemNumber;
   private String name;
   private double price;
   private int quantity;

   public Product(int itemNumber, String name, double price, int quantity){
       this.itemNumber = itemNumber;
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }

   public double getPrice(){
       return price;
   }
   public void setPrice(double price){
       this.price = price;
   }

   public int getQuantity(){
       return quantity;
   }
   public void setQuantity(int quantity){
       this.quantity = quantity;
   }

   public String getName(){
       return name;
   }

   public int getItemNumber(){
       return itemNumber;
   }

}

class Customer{
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(int customerId, String name, String address, String phoneNumber){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}


public class Business {
    public static void main(String[] args) {
        Customer c = new Customer(100, "Marissa", "123 Main St", "123-456-7890");
        Product p = new Product(1001, "Laptop", 1000.00, 2);
        System.out.println("Customer ID: " + c.getCustomerId());
        System.out.println("Customer Name: " + c.getName());
        System.out.println("Customer Address: " + c.getAddress());
        System.out.println("Customer Phone Number: " + c.getPhoneNumber());
        System.out.println("Item Number: " + p.getItemNumber());
        System.out.println("Item Name: " + p.getName());
        System.out.println("Item Price: " + p.getPrice());
        System.out.println("Item Quantity: " + p.getQuantity());
    }
}
