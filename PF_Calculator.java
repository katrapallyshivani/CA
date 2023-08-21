import java.util.Scanner;

public class PF_Calculator {
    private double monthlyIncome;
    private int ageOfEmp;
    private double totalPF;

    public void calculateContribution() {
        double employeeContribution;
        double employerContribution;

        if (ageOfEmp <= 50) {
            employeeContribution = monthlyIncome * 0.15;
            employerContribution = monthlyIncome * 0.125;
        } else if (ageOfEmp <= 60) {
            employeeContribution = monthlyIncome * 0.125;
            employerContribution = monthlyIncome * 0.10;
        } else {
            employeeContribution = monthlyIncome * 0.10;
            employerContribution = monthlyIncome * 0.075;
        }

        totalPF = employeeContribution + employerContribution;
    }

    public double getTotalPF() {
        return totalPF;
    }

    public static void main(String[] args) {
        PF_Calculator pfCalculator = new PF_Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Monthly Income: ");
        pfCalculator.monthlyIncome = scanner.nextDouble();

        System.out.print("Enter Age of the Employee: ");
        pfCalculator.ageOfEmp = scanner.nextInt();

        scanner.close();

        pfCalculator.calculateContribution();
        System.out.println("Total PF: " + pfCalculator.getTotalPF());
    }
}
