package impl;

import classes.Person;
import enums.Country;
import enums.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ServicePerson extends Person implements PersonService {

    public ServicePerson(String lastName, String firstName, String birthDay, Country placeOfBirth, Gender gender) {
        super(lastName, firstName, birthDay, placeOfBirth, gender);
    }
    public ServicePerson(){
        super();

    }

    public void commands(){
        System.out.println("1 Get all Passport");
        System.out.println("2 Get passport by first name");
        System.out.println("3 Get all what's app");
        System.out.println("4 Go to your profile");
        System.out.println("5 Get all city");
        System.out.println("6 Get what's app status");
        System.out.println("7 Create a passport");
        System.out.println("8 Install what's app");
        System.out.println("9 Change status");
        System.out.println("10 Add contact");
        System.out.println("11 Send a message");
        System.out.println("12 See status");


    }
    public void allCity() {
        Country [] countries = Country.values();
        for (Country co:countries) {
            System.out.println(co);
        }



    }
    @Override
    public void findByFirstName(List<ServicePerson>service, String name) {
        if(getFirstName().contains(name)){
            System.out.println(service);
        }else {
            System.out.println("No name");
        }

    }

    @Override
    public void greatPassport(String n) {
        Scanner scanner = new Scanner(System.in);
        List<Person>ser = new ArrayList<>();
        ser.add(new Person());
       // System.out.println("ID: "+n);
        setLastName(n);
        System.out.println("Last name: "+getLastName());
       // System.out.println("First name: "+l);
        //System.out.println("Birthday (dd.mm.yyyy): "+k);
       // System.out.println("Place of birth: "+j);
        //System.out.println("Gender: "+g);

    }

    @Override
    public void getAllPassport() {

    }
}
