import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t[] = new int[3];
        t[0] = 0;
        double mI;
        double mF = 0;
        t[1]=0;
        t[2]=0;
        int cont = 0;
        do{
            System.out.println("Digite a massa: ");
            mI = sc.nextDouble();
        } while (mI <= 0.5);
        mF = mI;
        do{
            mF = mF/2;
            t[0] = t[0] + 50;
            cont++;
        } while (mF > 0.5);
        if (t[0] >= 3600){
            t[1] = t[0]/60;
            t[2] = t[1]/60;
            t[1] = t[1] % 60;
            t[0] = t[0] % 60;
        } else if (t[0] <= 3599 && t[0] > 60){
            t[1] = t[0]/60;
            t[0] = t[0] % 60;
        }
        System.out.println("Massa inicial: "+mI);
        System.out.println("Massa final: "+mF);
        System.out.println("Tempo: "+t[2]+" horas, "+t[1]+" minutos e "+t[0]+" segundos");
        System.out.println(cont);
    }
}