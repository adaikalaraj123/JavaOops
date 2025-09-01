package com.voterapp.client;

import com.voterapp.service.*;
import com.voterapp.exception.*;
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IElectionBoothService service = new ElectionBoothServiceImpl();

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter your locality: ");
            String locality = sc.nextLine();

            System.out.print("Enter your voter ID: ");
            int voterId = sc.nextInt();

            if (service.checkEligibility(age, locality, voterId)) {
                System.out.println("You are eligible to vote.");
            }

        } catch (UnderAgeException e) {
            System.out.println("Age check failed: " + e.getMessage());
        } catch (LocalityNotFoundException e) {
            System.out.println("Locality check failed: " + e.getMessage());
        } catch (InvalidVoterIDException e) {
            System.out.println("Voter ID check failed: " + e.getMessage());
        } catch (NotEligibleException e) {
            System.out.println("Eligibility check failed: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
