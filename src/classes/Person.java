package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.Locale;

public class Person  {

    private String lastName;
    private String firstName;
    private String birthDay;
    private Country placeOfBirth;
    private Gender gender;

    public Person(String lastName, String firstName, String birthDay, Country placeOfBirth, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
    }
    public Person(){

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Country getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Country placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                lastName+
                 firstName + birthDay +gender
                +placeOfBirth;
    }
}
