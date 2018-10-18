package I05;


public class TicketingMachine {
    private String destStation="";
    private String currentStation;
    private boolean ready;
    private boolean coinPay;
    private boolean finish;
    private int price;
    private int currentAmount;

    public TicketingMachine(String currentStation) {
        this.currentStation = currentStation;
    }

    public String station(String station){

        if(ready&&(!station.equals(this.destStation))){

            this.destStation=station;price=100;
            ready=false;
            coinPay =true;
            return station;
        }
        else{
            return "Try again!";
        }

    }
    public String  retrieveTicket(){
        if(finish){
            finish=false;
            ready=true;
            return "Your ticket is here "+"Current Station +is "+this.currentStation+ "Destination is "+ this.destStation ;
        }
        else {
            return "";
        }
    }
    public String insertCoins(int amount){
        if(coinPay){
            this.currentAmount+=amount;
            if(this.currentAmount<price){
                return String.valueOf(price-this.currentAmount);

            }else if(this.currentAmount>price){
                int change=0;
                change=this.currentAmount-price;

                coinPay =false;
                finish=true;

                return "Complete Change money :"+change;

            }else{
                coinPay =false;
                finish=true;
                return "Complete";
            }
        }
        else {
            return "";

        }

    }


}
