package baekjoon.problem2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String threeDice = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(threeDice);
        int dice1 = Integer.parseInt(stringTokenizer.nextToken());
        int dice2 = Integer.parseInt(stringTokenizer.nextToken());
        int dice3 = Integer.parseInt(stringTokenizer.nextToken());

        int price = 0;



        if(dice1 == dice2 && dice1 == dice3){
            price=  10000 + (dice1*1000);
        }else if(dice1 == dice2 || dice1 == dice3 || dice2 == dice3){
            if(dice1-dice2 == 0){
                price = (dice1 * 100) + 1000;
            }else
                price = (dice3 * 100) + 1000;
        }else
        if(dice1 > dice2 && dice1 > dice3){
            price = 100 * dice1;
        }else if(dice2 > dice3) {
            price = 100 * dice2;
        }else
            price = 100 * dice3;
        System.out.println(price);
    }
}


