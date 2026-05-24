package entities;


import java.util.Scanner;

public class Client {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String Number = "";

    public Client(String name, String Number) {
        this.name = name;
        this.Number = Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public boolean checkPhone() {
        return Number.matches("91-9\\d{8}");
    }

    public String printcheckPhone() {
        System.out.println(checkPhone());
        if (checkPhone()) {
            return "Phone valid";
        }
        return "Phone invalid";
    }

    @Override
    public String toString() {
        return
                "NAME: " + name +
                        " NUMBER: " + Number;
    }
}
