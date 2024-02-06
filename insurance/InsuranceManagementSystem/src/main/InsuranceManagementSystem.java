//Insurance management system 
//Coding challenge
// by Yash Nikam

package main;

import dao.IPolicyService;
import dao.InsuranceServiceImpl;
import entity.Policy;
import exception.PolicyNotFoundException;

import java.util.List;
import java.util.Scanner;

public class InsuranceManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IPolicyService policyService = new InsuranceServiceImpl();

        while (true) {
            System.out.println("\nPolicy Management System");
            System.out.println("1. Add Policy");
            System.out.println("2. Get Policy By ID");
            System.out.println("3. Get All Policies");
            System.out.println("4. Update Policy");
            System.out.println("5. Delete Policy");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Add Policy
                    addPolicy(policyService, scanner);
                    break;
                case 2:
                    // Get Policy By ID
                    getPolicyById(policyService, scanner);
                    break;
                case 3:
                    // Get All Policies
                    getAllPolicies(policyService);
                    break;
                case 4:
                    // Update Policy
                    updatePolicy(policyService, scanner);
                    break;
                case 5:
                    // Delete Policy
                    deletePolicy(policyService, scanner);
                    break;
                case 6:
                    // Exit
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

            // Wait for the user to press Enter to continue
            System.out.print("Press Enter to continue...");
            scanner.nextLine(); // Consume newline
            scanner.nextLine(); // Wait for Enter key press
        }
    }

    // Method to add a new policy
    private static void addPolicy(IPolicyService policyService, Scanner scanner) {
        System.out.println("Enter Policy Name:");
        scanner.nextLine();  // Consume newline
        String name = scanner.nextLine();
        System.out.println("Enter Policy Details:");
        String details = scanner.nextLine();

        Policy policy = new Policy(null, name, details);
        boolean success = policyService.addPolicy(policy);
        System.out.println(success ? "Policy added successfully." : "Failed to add policy.");
    }

    // Method to get a policy by ID
    private static void getPolicyById(IPolicyService policyService, Scanner scanner) {
        System.out.print("Enter Policy ID: ");
        long policyId = scanner.nextLong();
        try {
            Policy policy = policyService.getPolicyById(policyId);
            System.out.println("Policy Found: " + policy);
        } catch (PolicyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to retrieve all policies
    private static void getAllPolicies(IPolicyService policyService) {
        List<Policy> policies = policyService.getAllPolicies();
        if (policies.isEmpty()) {
            System.out.println("No policies found.");
        } else {
            System.out.println("Policies:");
            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
    }

    // Method to update a policy
    private static void updatePolicy(IPolicyService policyService, Scanner scanner) {
        System.out.print("Enter Policy ID to update: ");
        long policyId = scanner.nextLong();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new Policy Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Policy Details: ");
        String details = scanner.nextLine();

        try {
            Policy policy = new Policy(policyId, name, details);
            policyService.updatePolicy(policy);
            System.out.println("Policy updated successfully.");
        } catch (PolicyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to delete a policy
    private static void deletePolicy(IPolicyService policyService, Scanner scanner) {
        System.out.print("Enter Policy ID to delete: ");
        long policyId = scanner.nextLong();
        try {
            policyService.deletePolicy(policyId);
            System.out.println("Policy deleted successfully.");
        } catch (PolicyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
