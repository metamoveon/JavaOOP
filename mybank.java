import java.util.Scanner;
class mybank{
    public static void main(String[]args){
        System.out.print("ระบุจำนวนถอนเงิน :");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        System.out.println("จำนวนที่ถอนเงินคือ : "+withdraw);

        //หาจำนวนแบงก์และจำนวนคงเหลือ
        int money1000 = (int)withdraw/1000;
        int remain = withdraw%1000;

        int money500 = (int)(remain/500);
        remain = withdraw%500;

        int money100 = (int)(remain/100);
        remain = withdraw%100;

        System.out.println("Type of Bank Baht");
        System.out.println("Type 1000 :"+money1000);
        System.out.println("Type 500 : "+money500);
        System.out.println("Type 100 :"+money100);
    }
}