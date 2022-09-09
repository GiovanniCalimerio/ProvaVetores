import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double s[] = new double[2];
        s[0] = 1000;
        s[1] = s[0] + (0.015*s[0]);
        int ano = 1997;
        double taxa=0.015;
        do{
            taxa = taxa*2;
            s[1] = s[1] + (taxa*s[1]);
            ano = ano+1;
        } while(ano != 2023);
        System.out.println("O salario em "+(ano-1)+" foi de R$"+df.format(s[1]));
    }
}