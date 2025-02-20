import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int money;
        float withKDV;
        float KDV;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money: ");
        money = input.nextInt();

        if (money <= 1000 && money > 0) {
            KDV = (float) ((float) money * 0.18);
            withKDV = money + KDV;
            System.out.println("The KDV is: " + KDV + " The Total with KDV is " + withKDV);
        }
        else if (money > 1000){
            KDV = (float) ((float) money * 0.08);
            withKDV = money + KDV;
            System.out.println("The KDV is: " + KDV + " The Total with KDV is " + withKDV);
        }

    }
}
