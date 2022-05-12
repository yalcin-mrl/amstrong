import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,res = 0,top= 0;
        System.out.print("Sayı giriniz: ");
        num = sc.nextInt();
        int temp = num,count= 0;

        while(temp !=0){
            temp /= 10;
            count++;
        }
        temp = num;
        while (temp != 0){
            int bs = temp%10;
            top += bs;
            temp /= 10;
        }
            System.out.println(top);

    }
}
