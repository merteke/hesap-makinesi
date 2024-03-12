import java.util.*;

public class hesapMakinesi {

    public static void main(String[] args){

        int a,b;
        int islem;
        int sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Islem yapilacak sayilari giriniz(a,b)");
        a=input.nextInt();
        b=input.nextInt();

        System.out.println("Yapilacak islemi seciniz\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        islem=input.nextInt();

        switch (islem){
            case 1:
            sonuc=a+b;
            System.out.println("Toplama isleminin sonucu="+sonuc);
            break;
            case 2:
            sonuc=a-b;
            System.out.println("Cikarma isleminin sonucu="+sonuc);
            break;
            case 3:
            sonuc=a*b;
            System.out.println("Carpma isleminin sonucu="+sonuc);
            break;
            case 4:
            sonuc=a/b;
            System.out.println("Bolme isleminin sonucu="+sonuc);
            break;
            default:
            System.out.println("Yanlis giris yaptiniz!");
            break;

        }

        


    }

}
