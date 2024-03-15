package javaexercises;

import java.util.HashMap;

/*
At the beginning of the day the restaurant is empty
A guest arrives, finds a seat, eat, pays and then leaves.
There are only nbSeats seats available. Guests can only eat and pay when they can be seated
A guest which enters the restaurant and cannot find a seat waits in line
until a seat is made available or until he/she gets bored and leaves.
A guest may come several times during the day, in that case, he/she will pay at most once.

Implement method "computeDayGains(nbSeats, payingGuest, guestMovements)
which returns the gains for the day:
- the array payingGuests gives what guests are ready to pay
( for example if payingGuests[5] value is 25, it means
that guest with id-5 is ready to pay $25 for the buffet)
-the array guestMovements gives in order the arrivals and departures of guests.
the first time you see an id, it indicates an arrival.
The second time you see the same if, it indicates a departure.
An arrival is always followed later in the day by a departure.
*/
public class Restaurant {

    public static void main(String[] args){

    }

    public static double computeDayGains(int nbSeats, int[] payingGuest, String[] guestMovements){

        double gains = 0;
        HashMap<Integer,Integer> payguest = new HashMap<>();
        for(int id : payingGuest){
            payguest.put(id,payguest.get(id));
        }

        HashMap<String,String> guestInfo = new HashMap<>();
        for(String id:guestMovements){
            guestInfo.put(id,guestInfo.get(id));
        }

        if(nbSeats !=0){
            for (int guest:payguest.keySet()) { //id
                if(guestInfo.containsKey(payguest.get(guest))){
                    continue;
                }else{
                    gains += payguest.get(guest);
                }
            }
        }else{
            //wail until nbSeats availalbe
        }
            return  gains;
    }
}
