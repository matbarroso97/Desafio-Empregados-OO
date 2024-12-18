package Application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.next();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String phone = sc.next();

        Department dpt = new Department(name, payDay, new Address(email, phone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(employeeName, salary);

            dpt.addEmployee(emp);
        }
        System.out.println();
        showReport(dpt);

        sc.close();


    }

    public static void showReport(Department dpt) {
        System.out.println("FOLHA DE PAGAMENTO: ");
        System.out.printf("Departamento Vendas = R$ %.2f\n", dpt.payroll());
        System.out.printf("Pagamento realizado no dia %d\n", dpt.getPayDay());
        System.out.println("Funcionários: ");
        dpt.employeeNames();
        System.out.println("Para dúvidas favor entrar em contato: vendas@lojatop.com");

    }

}