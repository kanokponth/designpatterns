package I04;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int countSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.countSeats = allSeats;

    }
    @Override
    public String getName() {
        return "Location :"+name;
    }
    @Override
    public double getPrice() {

        return this.price;
    }
    @Override
    public int getAvailableSeats() {
        return countSeats -reservedSeats;
    }
    public int getCountSeats() {
        return countSeats;
    }
    public void addReservedSeats(int reservedSeats) {
        if(reservedSeats>getAvailableSeats()){
            System.out.println("Don't have Seats");
        }else{
            this.reservedSeats+= reservedSeats;
        }

    }
}
