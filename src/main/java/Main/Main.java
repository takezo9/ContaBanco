package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome: ");
        String nome_cliente = rd.nextLine();
        System.out.println("Por favor, digite a Agência");
        String agencia = rd.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        int num_agencia = Integer.parseInt(rd.nextLine());
        System.out.println("Por favor, digite o saldo");
        double saldo = Double.parseDouble(rd.nextLine());

        System.out.println(STR."Olá \{nome_cliente}, " +
                STR."obrigado por criar uma conta em nosso banco, sua agência é \{agencia},"
        + " conta " + num_agencia + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }
}
