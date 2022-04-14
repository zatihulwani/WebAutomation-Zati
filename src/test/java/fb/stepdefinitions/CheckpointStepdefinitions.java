package fb.stepdefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.TheMenu;
import tasks.TheMessage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.contains;

public class CheckpointStepdefinitions {
    @Then("{actor} can't see my news feed")
    public void validateNewsFeed(Actor actor) {
        actor.should(seeThat(TheMenu.displayed(), not(contains("News Feed"))));
    }

    @But("{actor} see FB has disabled my account")
    public void validateAccountIsDisable(Actor actor) {
        actor.should(
                seeThat(
                        TheMessage.displayed(), contains(
                        "Your account has been disabled"
                        )
                )
        );
        actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().contains("checkpoint")
        );
    }
}
