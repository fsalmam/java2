package Tutorial_ch6;

public class Flower {
    //Create a class named Flower. The class has two private attributes:
    // name and price.
    private String name;
    private double price ;
    //static
    // The class should include a static attribute
    // NumberOfFlowers initialized to zero.
    private static int NumberOfFlowers=0;


    // The default value for name is “Rose”.
    // Price is a non-negative floating point and the default value is 0.0.
    //
    //Additionally, the class should also include the following methods:
    //1.	A default constructor that initializes data members
    // to default values and increment NumberOfFlowers
    public Flower(){
        name="Rose";
        price=0.0;
        NumberOfFlowers++;
    }
    //2.	A constructor with parameters for name
    // and price and increment NumberOfFlowers
    public Flower(String name,double price){
        this.name=name;
        if(price >0)
        this.price=price;//non-negative floating point
        NumberOfFlowers++;
    }
    //3.	A set method to set private members (name and price)
    // if the given values are valid.
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        if(price >0)
            this.price=price;//non-negative floating point
    }
    public void setFlower(String name,double price){
        this.name=name;
        if(price >0)
            this.price=price;//non-negative floating point
    }
    //4.	Two get methods to return name and price values.
    public String getName(){return name;}
    public double getPrice(){return price;}
    //5.	A method named print to display on screen the name,
    // price, NumberOfFlowers values
    public void print(){
        System.out.println("flower name ="+name);
        System.out.println("flower price ="+price);
    }
    //6.	A static method to set the NumberOfFlowers value.
    public static void setNumberOfFlowers(int NumberOfFlowers){
        Flower.NumberOfFlowers=NumberOfFlowers;

    }
    //7.	A static method to return the NumberOfFlowers value.
    public static int getNumberOfFlowers(){return  NumberOfFlowers;}
    //overloading
    public void total(){
        System.out.println("this");
    }
    public void total(int x){
        System.out.println(x);
    }
    public int total(int x,int y){
        return x+y;
    }
}
