import java.util.*;
import java.text.DecimalFormat; //decimal format is used to formatting number as per customized and locale 

public class CurrencyConverter
{
    public static void main(String args[])
    {
        double amount,code,rupee,usdollar,euro,pound,australiandollar,yen,chineseyaun,bangaladeshitaka,brazilianreal,canadiandollar;
        DecimalFormat f=new DecimalFormat("##.##");

        Scanner sc=new Scanner(System.in);

        System.out.println("Hi, Welcome To Currency Converter!");
        System.out.println("\nWhich Currency You Want To Convert ?");

        System.out.println("1.Rupee \t2.USDollar \t3.Euro \t4.Pound \t5.AustralianDollar \t6.Yen \t7.ChineseYaun \t8.BangaladeshiTaka \t9.BrazilianReal \t10.CanadianDollar");
        code=sc.nextInt();

        System.out.println("How Much Currency You Want To Convert");
        amount=sc.nextDouble();

        if(code==1)
        {
            usdollar=amount/81;
            System.out.println("Your " + amount + " Rupee is : " + f.format(usdollar) + " Dollar");

            euro=amount/79;
            System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");

            pound=amount/91;
            System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

            australiandollar=amount/52;
            System.out.println("Your " + amount + " Rupee is : " + f.format(australiandollar) + " Australian Dollar");

            yen=amount/0.56;
            System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");

            chineseyaun=amount/11.47;
            System.out.println("Your " + amount + " Rupee is : " + f.format(chineseyaun) + " Chinese Yaun");

            bangaladeshitaka=amount/0.81;
            System.out.println("Your " + amount + " Rupee is : " + f.format(bangaladeshitaka) + " Bangaladeshi Taka");

            brazilianreal=amount/15.06;
            System.out.println("Your " + amount + " Rupee is : " + f.format(brazilianreal) + " Brazilian Real");

            canadiandollar=amount/81;
            System.out.println("Your " + amount + " Rupee is : " + f.format(canadiandollar) + " Canadian Dollar");
        }
        else if(code==2)
        {
            rupee=amount*81;
            System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Rupees");

            euro=amount*1.02;
            System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

            pound=amount*19.54;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

           australiandollar=amount*1.56;
            System.out.println("Your " + amount + " Dollar is : " + f.format(australiandollar) + " Australian Dollar");

            yen=amount*144.74;
            System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

            chineseyaun=amount*7.12;
            System.out.println("Your " + amount + " Dollar is : " + f.format(chineseyaun) + " Chinese Yaun");

             bangaladeshitaka=amount*101.35;
            System.out.println("Your " + amount + " Dollar is : " + f.format( bangaladeshitaka) + "  Bangaladeshi Taka");

            brazilianreal=amount*5.41;
            System.out.println("Your " + amount + " Dollar is : " + f.format(brazilianreal) + " Brazilian Real");

            canadiandollar=amount*1.38;
            System.out.println("Your " + amount + " Dollar is : " + f.format(canadiandollar) + " Canadian Dollar");
        }
        else if(code==3)
        {
             rupee=amount*80.02;
            System.out.println("Your " + amount + " Euro is : " + f.format(rupee) + " Rupees");

             usdollar=amount*0.98;
            System.out.println("Your " + amount + " Euro is : " + f.format(usdollar) + " US Dollar");

             pound=amount*19.15;
            System.out.println("Your " + amount + " Euro is : " + f.format(pound) + " Pound");

             australiandollar=amount*1.53;
            System.out.println("Your " + amount + " Euro is : " + f.format(australiandollar) + " Australian Dollar");

             yen=amount*141.09;
            System.out.println("Your " + amount + " Euro is : " + f.format(yen) + " Yen");

             chineseyaun=amount*6.98;
            System.out.println("Your " + amount + " Euro is : " + f.format(chineseyaun) + " Chinese Yaun");

             bangaladeshitaka=amount*99.34;
            System.out.println("Your " + amount + " Euro is : " + f.format(bangaladeshitaka) + " Bangladeshi Taka");

             brazilianreal=amount*5.31;
            System.out.println("Your " + amount + " Euro is : " + f.format(brazilianreal) + " Brazalian Real");

             canadiandollar=amount*1.36;
            System.out.println("Your " + amount + " Euro is : " + f.format(canadiandollar) + " Canadian Dollar");
        }
        else if(code==4)
        {
            rupee=amount*4.18;
            System.out.println("Your " + amount + " Pound is : " + f.format(rupee) + " Rupees");

           usdollar=amount*0.051;
            System.out.println("Your " + amount + " Pound is : " + f.format(usdollar) + " US Dollar");

            euro=amount*0.052;
            System.out.println("Your " + amount + " Pound is : " + f.format(euro) + " Euro");

           australiandollar=amount*0.080;
            System.out.println("Your " + amount + " Pound is : " + f.format(australiandollar) + " Australian Dollar");

            yen=amount*7.41;
            System.out.println("Your " + amount + " Pound is : " + f.format(yen) + " Yen");

            chineseyaun=amount*0.36;
            System.out.println("Your " + amount + " Pound is : " + f.format(chineseyaun) + " Chinese Yaun");

            bangaladeshitaka=amount*5.19;
            System.out.println("Your " + amount + " Pound is : " + f.format(bangaladeshitaka) + " Bangladeshi Taka");

            brazilianreal=amount*0.28;
            System.out.println("Your " + amount + " Pound is : " + f.format(brazilianreal) + " Brazalian Real");

            canadiandollar=amount*0.071;
            System.out.println("Your " + amount + " Pound is : " + f.format(canadiandollar) + " Canadian Dollar");
        }
    }
}