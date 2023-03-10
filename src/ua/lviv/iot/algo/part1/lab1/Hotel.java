package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private double rating;

    public void backRoom(){
        if(availableRooms > 0){
            availableRooms--;
        }
    }
    public void releaseRoom(){
        if(availableRooms > 0){
            availableRooms++;
        }
    }
    public int getAvailableRooms(){
        return availableRooms;
    }
    public int getBookedRoomsCount(){
        return totalRooms - availableRooms;
    }

    private static Hotel instance;

    public static Hotel getInstance(){
        if (instance == null){
            instance = new Hotel();
        }
        return instance;
    }

    public static void main(String[] args) {
        Hotel[] hotels = {new Hotel(),
                new Hotel("Lviv", 370, 165, 4.1),
                getInstance(),
                getInstance()
        };

        int i = 0;
        while(i< hotels.length){
            System.out.println(hotels[i]);
            i++;
        }

    }
}
