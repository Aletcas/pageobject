package tests;

import org.junit.jupiter.api.Test;
import pages.TestBase;
import pages.ChoicePage;
import pages.RegistrationPage;

public class RegistrationFormWithPageObjectTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    ChoicePage choicePage = new ChoicePage();

    String firstName = "Alex";
    String lastName = "Egorov";
    String userEmail = "alex@egorov.com";
    String userNumber = "1231231230";
    String userAddres = "Some address 1";
    String userSubjects = "Math";

    @Test
    void successFillTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setUserAddress(userAddres)
                .setUserSubjects(userSubjects)
                .imgPicture()
                .setBirthDate("30", "July", "2008");

        choicePage.typeGender();
        choicePage.choiceHobbiesWrapper();
        choicePage.choiceStateStateCity();
        choicePage.choiceStateCityWrapperNCR();
        choicePage.choiceStateCity();
        choicePage.choiceStateCityWrapperNoida();
        choicePage.buttonFormEnd();

        registrationPage.validateTextMatchesEnteredValues();
        registrationPage
                .checkForm("Student Name", firstName + " " + lastName)
                .checkForm("Student Email", userEmail)
                .checkForm("Gender", "Other")
                .checkForm("Mobile", userNumber)
                .checkForm("Date of Birth", "30 July,2008")
                .checkForm("Subjects", userSubjects)
                .checkForm("Hobbies", "Sports")
                .checkForm("Address", userAddres)
                .checkForm("State and City", "NCR Delhi");
    }
}
