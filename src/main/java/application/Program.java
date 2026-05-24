package application;


import entities.Barbearia;
import entities.Client;
import libs.ConexaoJ;
import libs.InsertClient;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.next();
        sc.next();
        System.out.println("Enter number phone (91-900000000): ");
        String Number = sc.next();
        Client client = new Client(Name, Number);

        Barbearia barbearia = new Barbearia(LocalDateTime.now(), client);
        System.out.println(barbearia);
        System.out.println(barbearia.getClient().printcheckPhone());


        ConexaoJ conexaoJ = new ConexaoJ();
        InsertClient insertClient = new InsertClient();
    }
}

