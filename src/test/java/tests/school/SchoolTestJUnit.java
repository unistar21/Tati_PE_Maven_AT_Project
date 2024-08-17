package tests.school;

import org.junit.Assert;
import org.junit.Test;
import pages.GooglePage;
import pages.SchoolPage;
import tests.BaseSteps;

public class SchoolTestJUnit extends BaseSteps {

    private SchoolPage w3school = new SchoolPage();
    private GooglePage google = new GooglePage();

    @Test
    public void testSchool() {

        w3school.getPage();
        w3school.copyText();
        google.getPage();
        google.acceptCookiesButton();
        google.pasteText();

        Assert.assertTrue(google.checkTutorialResults());

    }

}
