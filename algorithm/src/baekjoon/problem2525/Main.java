package baekjoon.problem2525;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String times = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(times);
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int needMinute = Integer.parseInt(bufferedReader.readLine());
        minute = minute+needMinute;

        if(minute/60 >0){
            hour = hour+minute/60;
            minute%=60;
        }

        if(hour>=24){
            hour%=24;
        }

        String ret1 = String.format(String.valueOf(hour)).toString();
        String ret2 = String.format(String.valueOf(minute)).toString();
        System.out.println(ret1 + " " + ret2);
        bufferedReader.close();
    }
}