
package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Full name: ");
        String name = scanner.nextLine();

        System.out.print("Billing street: ");
        String street = scanner.nextLine();

        System.out.print("Billing city: ");
        String city = scanner.nextLine();

        System.out.print("Billing state: ");
        String state = scanner.nextLine();

        System.out.print("Billing zip: ");
        String zip = scanner.nextLine();

        StringBuilder billing = new StringBuilder();

        billing.append(name + "\n");
        billing.append(street + "\n");
        billing.append(city + ", " + state + " " + zip);

        System.out.println("\nBilling Address:");
        System.out.println(billing);

        System.out.print("\nShipping street: ");
        street = scanner.nextLine();

        System.out.print("Shipping city: ");
        city = scanner.nextLine();

        System.out.print("Shipping state: ");
        state = scanner.nextLine();

        System.out.print("Shipping zip: ");
        zip = scanner.nextLine();

        StringBuilder shipping = new StringBuilder();

        shipping.append(name + "\n");
        shipping.append(street + "\n");
        shipping.append(city + ", " + state + " " + zip);

        System.out.println("\nShipping Address:");
        System.out.println(shipping);

        scanner.close();
    }
}
