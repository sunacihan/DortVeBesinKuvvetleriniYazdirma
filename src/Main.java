import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi=input.nextInt();

        for (int i=1,j=1; i<=sayi || j<=sayi;i*=4,j*=5){
            System.out.println("4 ün katı:"+i);
            System.out.println("5 ün katı:"+j);
        }
    }
}