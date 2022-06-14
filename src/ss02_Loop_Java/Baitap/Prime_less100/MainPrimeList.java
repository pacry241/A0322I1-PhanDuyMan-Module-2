package ss02_Loop_Java.Baitap.Prime_less100;

import ss02_Loop_Java.Baitap.Twenty_Prime.MainPrime;

public class MainPrimeList {
    public static void main(String[] args) {
        for(int i = 2; i <=100;i++){
            if (MainPrime.isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
