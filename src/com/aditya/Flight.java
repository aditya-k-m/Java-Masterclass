package com.aditya;

import java.io.Serializable;
import java.util.*;

public class Flight implements Serializable {
    private String model;
    private String PNR;
    private short rows;
    private short seatsInARow;
    private List<Seat> seatList;

    private long serialVersionUID = 1L;

    static final Comparator<Seat> ORDER_BY_PRICE;

    static {
        ORDER_BY_PRICE = new Comparator<>() {
            @Override
            public int compare(Seat o1, Seat o2) {
                if (o1.getPrice() > o2.getPrice())
                    return 1;
                else if (o1.getPrice() < o2.getPrice())
                    return -1;
                else
                    return 0;
            }
        };
    }

    public Flight(String model, String PNR, short rows, short seatsInARow) {
        this.model = model;
        this.PNR = PNR;
        this.rows = rows;
        this.seatsInARow = seatsInARow;
        this.seatList = new ArrayList<>();

        for(short i = 1; i <= rows; i++){
            for(char j = 'A'; j < 'A' + seatsInARow; j++){
                String seatNo = Short.toString(i) + Character.toString(j);
                seatList.add(new Seat(seatNo));
            }
        }
    }

    public String getModel() {
        return model;
    }

    public String getPNR() {
        return PNR;
    }

    public int getNumberOfSeats(){ return seatList.size(); }

    public void printAllSeats(){
        Iterator<Seat> ite = seatList.iterator();
        while (ite.hasNext()){
            Seat temp = ite.next();
            System.out.println(temp.getSeatNumber() +" ; Price : INR "+temp.getPrice()+"/-");
        }
    }

    public List<String> getAllSeats(){
        List<String> seatsWithPrices = new LinkedList<>();
        Iterator<Seat> ite = seatList.iterator();
        while (ite.hasNext()){
            Seat temp = ite.next();
            seatsWithPrices.add(temp.getSeatNumber() +" ; Price : INR "+temp.getPrice()+"/-");
        }
        return seatsWithPrices;
    }

    public boolean reserveASeat(Seat seat){
        if(Collections.binarySearch(this.seatList, seat, null) >= 0 && !seat.isReserved()){
            seat.reserveSeat();
            System.out.println("Seat number "+seat.getSeatNumber()+" has been reserved at a cost of INR "+seat.getPrice()+"/- .");
            return true;
        }
        else{
            if(Collections.binarySearch(this.seatList, seat, null) >= 0)
                System.out.println("This seat is already reserved.");
            else
                System.out.println("Invalid Seat.");
            return false;
        }
    }

    public Seat findASeat(String seatNo){
        ListIterator<Seat> ite = seatList.listIterator();
        while(ite.hasNext()){
            if(ite.next().getSeatNumber().compareToIgnoreCase(seatNo) == 0){
                return ite.previous();
            }
        }
        return new Seat("00");
    }

    public List<Seat> getSeatList(){
        return this.seatList;
    }

    public void sortByPrice(){
        Collections.sort(seatList, ORDER_BY_PRICE);
    }

    @Override
    public boolean equals(Object o) {
        //1st check
        if (this == o) return true;
        //2nd check
        if (o == null || getClass() != o.getClass()) return false;
        //Finally, checking
        Flight flight = (Flight) o;
        return PNR.equals(flight.PNR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PNR);
    }

    //Inner Class
    private class Seat implements Comparable<Seat>, Serializable {
        private String seatNumber;
        private boolean reserved = false;
        private double price;

        private long serialVersionUID = 2L;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;

            if((seatNumber.charAt(0) == '1' || seatNumber.charAt(0) == '2') && seatNumber.length() == 2)
                this.price = 500;

            else if(seatNumber.charAt(seatNumber.length()-1) == 'A' || seatNumber.charAt(seatNumber.length()-1) == 'F')
                this.price = 300;

            else if(seatNumber.charAt(seatNumber.length()-1) == 'C' || seatNumber.charAt(seatNumber.length()-1) == 'D')
                this.price = 200;

            else
                this.price = 0;
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatNumber.compareToIgnoreCase(o.seatNumber);
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        boolean reserveSeat(){
            this.reserved = true;
            return true;
        }

        boolean isReserved(){
            return this.reserved;
        }
    }
    //Inner Class

}
