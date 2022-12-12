import classes.Person;
import enums.Country;
import enums.Gender;
import impl.ServicePerson;
import impl.W.A.ServiceWhatsapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ServicePerson>service = new ArrayList<>();
        ServiceWhatsapp serviceWhatsapp = new ServiceWhatsapp();
        ServicePerson servicePerson = new ServicePerson();


        while (true) {
            servicePerson.commands();
            System.out.print("Tanda: ");
            switch (scanner.nextLine()) {
                case "1":
                    servicePerson.getAllPassport();
                    break;
                case "2":
                    System.out.print("Atyn ber: " );
                    servicePerson.findByFirstName(service,scanner.nextLine());
                    break;
                case "5":
                    servicePerson.allCity();
                    break;
                case "6":
                    serviceWhatsapp.allStatus();
                    break;
                case "7":
                    System.out.print("Last name: ");
                   // servicePerson.greatPassport(scanner.nextLine());

                    break;
            }
        }
    }
    public static void all(){
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();
        List<Person>service = new ArrayList<>();




    }
}