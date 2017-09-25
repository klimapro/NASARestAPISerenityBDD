package com.klymenko.vadym.steps;

import com.klymenko.vadym.data.bodyobjects.Curiosity.Photos;
import com.klymenko.vadym.steps.serenity.CuriosityController;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import org.junit.Assert;
import org.yecht.Data;

import java.util.List;

import static org.hamcrest.Matchers.is;

public class DefinitionSteps {

    @Steps
    private CuriosityController curiosityController;

    @Given("Set token $token")
    public void setToken(final String token) {
        curiosityController.setApiToken(token);
    }

    @Then("Downloaded first $number images and metadata from API are identical")
    public void isMetaDataTheSameForEarthDateAndSol(final int number) {
        List<Photos> listOfPhotosByEarthDate = curiosityController.getListOfPhotosByEarthDate(number);
        List<Photos> listOfPhotosBySolDate = curiosityController.getListOfPhotosBySolDate(number);
        Assert.assertThat("List differ", listOfPhotosByEarthDate, is(listOfPhotosBySolDate));
    }

    @Then("Each separate camera made $number times less images than any other camera")
    public void verifyIfAnyCameraMadeMoreImages(final int number) {
        int max = curiosityController.getMaxQuantityOfPhotosMadeByCamera();
        int min = curiosityController.getMinQuantityOfPhotosMadeByCamera();
        Assert.assertTrue("Camera made 10 times more images than other", max / min < number);
    }

}
