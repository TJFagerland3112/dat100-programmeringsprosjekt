package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();


        Customer Customer1 = new Customer("Hans Hansen", "hansehans@gmail.com", 112, PowerAgreementType.SPOTPRICE);

        //tester for get metoder
        String name1 = Customer1.getName();
        System.out.println("Name: " + name1);
        String email1 = Customer1.getEmail();
        System.out.println("Email: " + email1);
        int c_id1 = Customer1.getCustomer_id();
        System.out.println("Costumer ID: " + c_id1);
        PowerAgreementType agreement1 = Customer1.getAgreement();
        System.out.println("Agreement: " + agreement1);

        System.out.println();
        System.out.println("==============");
        System.out.println();

        //tester for set metoder
        Customer1.setName("Hansmann");
        System.out.println("Name: " + Customer1.getName());
        Customer1.setEmail("haaaans@yahoomail.com");
        System.out.println("Email: " + Customer1.getEmail());
        Customer1.setCustomer_id(123);
        System.out.println("Costumer ID: " + Customer1.getCustomer_id());
        Customer1.setAgreement(PowerAgreementType.NORGESPRICE);
        System.out.println("Agreement: " + Customer1.getAgreement());

        System.out.println();
        System.out.println("==============");
        System.out.println();

        String CustomerOutput = Customer1.toString();
        System.out.println(CustomerOutput);

        /*
         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
