package homework;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner num=new Scanner(System.in);
	    int a=num.nextInt();
	    int b=num.nextInt();
	    int odd=0;
	    int even=0;
	    int oddSum=0;
	    int evenSum=0;
        if (a<b){
            for (int i=0; i<40;i++){
                Random randint=new Random();
                int k=randint.nextInt(b-a)+a;
                System.out.println(k);
                if (k%2==0){
                    even=even+1;
                    evenSum=evenSum+k;
                }
                else {
                    odd=odd+1;
                    oddSum=oddSum+k;
                }
            }
            System.out.println("Odd:"+odd+" Even:"+even);
            System.out.println("oddSum:"+oddSum+" evenSum"+evenSum);
        }
        else {
            for (int i=0; i<40;i++){
                Random randint=new Random();
                int k=randint.nextInt(a-b)+b;
                System.out.println(k);
                if (k%2==0){
                    even=even+1;
                    evenSum=evenSum+k;
                }
                else {
                    odd=odd+1;
                    oddSum=oddSum+k;
                }
            }
            System.out.println("Odd:"+odd+" Even:"+even);
            System.out.println("oddSum:"+oddSum+" evenSum"+evenSum);
        }
        if (oddSum<evenSum){
            for (int i=0; i<5; i++) {
                Random randint=new Random();
                int t=randint.nextInt(evenSum-oddSum)+oddSum;
                System.out.println(t);
            }
        }
        else {
            for (int i=0; i<5; i++) {
                Random randint = new Random();
                int t = randint.nextInt(oddSum-evenSum)+evenSum;
                System.out.println(t);
            }
        }
    }
}
