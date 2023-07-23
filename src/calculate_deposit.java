import java.net.URI;
import java.util.Scanner;
import java.io.IOException;

public class calculate_deposit {
    double Calculate_Complex_Percent_Function(double amount, double yearRate,int depositPeriod) {
       double pay = amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod);
       return rnd(pay, 2);
    }

    double Calculate_Simple_Percent_Function(double amount, double yearRate, int depositPeriod) {
    return rnd(amount + amount * yearRate * depositPeriod, 2);
    }

    double rnd(double value, int places) {
       double ScaLe = Math.pow(10, places);
       return Math.round(value * ScaLe) / ScaLe;
    }

    void do_important_job() {
    Scanner userInput = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:") ;
    int amount = userInput.nextInt();

        System.out.println("Введите срок вклада в годах:") ;
    int depositPeriod = userInput.nextInt( );

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
    int action = userInput.nextInt();

        double outDoubleVar = 0;
        if (action ==1) {
            outDoubleVar = Calculate_Simple_Percent_Function(amount, 0.06, depositPeriod);
        } else if (action == 2) {
            outDoubleVar = Calculate_Complex_Percent_Function(amount, 0.06, depositPeriod);
        }
        System.out.println("Результат вклада: " + amount + " за " + depositPeriod + " лет превратятся в " + outDoubleVar);
    }
        public static void main(String[] args) {
        new calculate_deposit().do_important_job();
    }
}
