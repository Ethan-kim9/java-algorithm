package baekjoon.problem18108;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int buddaYear = Integer.parseInt(bufferedReader.readLine());
        System.out.println(buddaYear-543);
        bufferedReader.close();
    }
}
