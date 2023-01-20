import java.util.*;
import java.util.stream.Collectors;

public class BankReport {
    /* Customer = Employee of the Business.
       Business = a client of the Bank
       Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank */

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        // A customer is an Employee that works for a Business (client of the bank)

        return bank.getClients().stream()
                .mapToInt(x -> x.getEmployees().size()).sum();
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank

        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .mapToInt(x -> x.getAccounts().size()).sum();
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Return the set of customers in alphabetical order
        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getName))));
    }

    public static double getTotalSumInAccounts(Bank bank) {
        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .flatMap(x -> x.getAccounts().stream())
                .mapToDouble(Account::getBalance).sum();
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .flatMap(x -> x.getAccounts().stream())
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Account::getBalance).thenComparing(Account::getId))));
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .collect(Collectors.toMap(x -> x, Employee::getAccounts));
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        return bank.getClients().stream()
                .flatMap(x -> x.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getCity));
    }
}
