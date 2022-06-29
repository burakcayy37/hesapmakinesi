import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int i;
        for ( i = 0; i <40 ; i++) {
             int a;
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz 1-çarpma 2-bölme 3-çıkartma 4-toplama");
            a=scanner.nextInt();
            if(a>=1 && a<=4){
                System.out.println("Lütfen birinci değeri giriniz");
                int x=scanner.nextInt();
                System.out.println("Lütfen ikinci değeri giriniz");
                int y=scanner.nextInt();


                if(a==1){
                    int carpim=x*y;
                    System.out.println(carpim);
                } else if (a==2) {
                    int bolme=x/y;
                    System.out.println(bolme);
                } else if (a==3) {
                    int cikarma=x-y;
                    System.out.println(cikarma);
                } else if (a==4) {
                    int toplama=x+y;
                    System.out.println(toplama);

                }

            }
            else {
                System.out.println("lütfen (1-4) arası değer giriniz");
            }

        }

    }
}
