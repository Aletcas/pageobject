package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ChoicePage {

    private SelenideElement
            radio = $("#genterWrapper").$(byText("Other")),
            hobbies = $("#hobbiesWrapper").$(byText("Sports")),
            stateStateCity = $("#state"),
            stateCityWrapperNCR = $("#stateCity-wrapper").$(byText("NCR")),
            stateCity = $("#city"),
            stateCityWrapperDelhi = $("#stateCity-wrapper").$(byText("Delhi")),
            buttonForm = $("#submit");

    public void radioButtonSelection() {
        radio.click();
    }

    public void choiceHobbiesWrapper() {
        hobbies.click();
    }

    public void choiceStateCityWrapperNCR() {
        stateCityWrapperNCR.click();
    }

    public void choiceStateStateCity() {
        stateStateCity.click();
    }

    public void choiceStateCity() {
        stateCity.click();
    }

    public void choiceStateCityWrapperNoida() {
        stateCityWrapperDelhi.click();
    }

    public void buttonFormEnd() {
        buttonForm.click();
    }

}
