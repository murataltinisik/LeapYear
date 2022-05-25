import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int year;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Yıl Giriniz: ");
        year = sc.nextInt();

        // CONTROL & RESULT
        if(year > 0){
            if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
                System.out.println(year + " Bir Artık Yıldır!");
            }else{
                System.out.println(year + " Bir Artık Değildir!");
            }
        }else{
            System.out.println("Veriler Hatalı!!!");
        }

    }
}
