package CourseUdemy.HerançaPolimorfismo.ProjetoTaxa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();
        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();
        for (int i=1; i <= n; i++){
            System.out.println("TaxPayer " + i + "data: ");
            System.out.print("Individual or Company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer tp : list){
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
        for(TaxPayer tp : list){
            sum+=tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
