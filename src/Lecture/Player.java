package Blackjack;

import java.util.Random;

public class Player {
    private String name;
    private int sum=0;

    public Player(String name) {
        this.name = name;
    }

    public void  pickCard (){
        Random random= new Random();
        int randomChoice= random.nextInt(13)+1;
        sum+= randomChoice;
        return;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }
}
