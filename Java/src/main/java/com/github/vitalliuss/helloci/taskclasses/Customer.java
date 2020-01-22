package com.github.vitalliuss.helloci.taskclasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String dadName;
    private String address;
    private long creditCard;
    private int bankCard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDadName() {
        return dadName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankCard() {
        return bankCard;
    }

    public void setBankCard(int bankCard) {
        this.bankCard = bankCard;
    }

    public Customer(int id, String lastName, String firstName, String dadName, String address, long creditCard, int bankCard) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dadName = dadName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankCard = bankCard;
    }

    public Customer(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dadName='" + dadName + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", bankCard=" + bankCard +
                '}';
    }

    public static void printArrayOfCustomer(Customer[] arrayOfCustomer) {
        for (Customer customer : arrayOfCustomer
        ) {
            System.out.println(customer);
        }
    }

    public static void printArrayOfCustomer(List<Customer> arrayOfCustomer) {
        for (Customer customer : arrayOfCustomer
        ) {
            System.out.println(customer);
        }
    }

    public static List<Customer> sortByLastName(Customer[] arrayOfCustomer) {
        List<Customer> sortedListOfCustomer = new ArrayList<>();

        for (Customer customer : arrayOfCustomer) {
            sortedListOfCustomer.add(customer);
        }

        sortedListOfCustomer.sort((x, y) -> x.lastName.compareTo(y.getLastName()));
        return sortedListOfCustomer;
    }

    public static List<Customer> findByCard(long startInterval, long endInterval, Customer[] arrayOfCustomer) {
        List<Customer> listByCard = new ArrayList<>();
        for (Customer customer : arrayOfCustomer) {
            if (customer.creditCard > startInterval && customer.creditCard < endInterval) {
                listByCard.add(customer);
            }
        }
        return listByCard;
    }

}
