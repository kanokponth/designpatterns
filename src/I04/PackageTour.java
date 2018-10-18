package I04;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int countSeats;
    private String tourName;
    private double total;

    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
        int count=0;
        int min=0;
        for(Tour tour:tours){
            if(count==1){
                min=Math.min(min,tour.getAvailableSeats());
            }
            else{
                min=tour.getAvailableSeats();
                count=1;
            }
        }
        countSeats =min;

    }
    @Override
    public String getName() {
        tourName="";
        for(Tour tour:tours){
            tourName+=tour.getName()+",";
        }
        return "Location :"+tourName+"\n";
    }

    @Override
    public double getPrice() {
        total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }
    @Override
    public int getAvailableSeats() {
        return countSeats;
    }
    public String getPackageName() {
        return "Package Name:"+packageName;
    }
    public void addSeats(int pakageSeats) {
        if(pakageSeats>this.countSeats){
            System.out.println("Don't have Seats");
        }else{
            this.countSeats -= pakageSeats;
        }
    }
    public int getCountSeats() {
        return countSeats;
    }
}
