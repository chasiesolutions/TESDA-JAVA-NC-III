public class Toy {
    public String name = "Barbie";
    public String brand;
    public double price;
    public int quantity;
// set the amount of toy to the argument e.g. setPrice(1000)
    void setPrice(double price){
        this.price = price;
    }
//psvm
    public static void main(String[] args) {
        System.out.println("hello Java trainees");
        Toy toy1 = new Toy();
        System.out.println(toy1.name);
    }
}
