package I04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour=new SingleTour("ChengMai",500.0,10);
        System.out.println(singleTour.getName());
        System.out.println("Price :"+singleTour.getPrice());
        System.out.println(singleTour.getCountSeats());
        singleTour.addReservedSeats(5);
        System.out.println(singleTour.getAvailableSeats());
        singleTour.addReservedSeats(3);
        System.out.println(singleTour.getAvailableSeats());
        System.out.println("---------------");

        List<Tour> tours=new ArrayList<>();
        tours.add(new SingleTour("BangNa",500.0,10));
        tours.add(new SingleTour("Bangkapi",300.0,10));
        tours.add(new SingleTour("BangWa",900.0,20));
        tours.add(new SingleTour("Bangruk",400.0,10));



        PackageTour packageTour=new PackageTour("AroundBangkok",tours);

        System.out.println(packageTour.getAvailableSeats());
        System.out.print(packageTour.getName());
        System.out.println(packageTour.getPackageName());
        System.out.println("Price :"+packageTour.getPrice());
        System.out.println(packageTour.getCountSeats());
        packageTour.addSeats(5);
        System.out.println(packageTour.getAvailableSeats());
        System.out.println(packageTour.getCountSeats());
        packageTour.addSeats(10);





    }
}
