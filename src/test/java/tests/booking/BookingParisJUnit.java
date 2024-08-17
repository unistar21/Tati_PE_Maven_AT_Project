package tests.booking;

import org.junit.Test;
import pages.BookingPage;
import tests.BaseSteps;

import static org.junit.Assert.assertEquals;

public class BookingParisJUnit extends BaseSteps {

    private BookingPage booking = new BookingPage();

    @Test
    public void testBookingParis() {

        booking.getPage();
        booking.typeSearchParis();
        booking.openAdultsDropdown();
        booking.plusAdult();
        booking.plusAdult();
        booking.plusRoom();
        booking.clickSubmitButton();
        booking.selectTypeCheckbox("Hotels");
        booking.selecRatingCheckbox("5 stars");
        booking.explicitWaitOfDisplayedLabelOfRate(5);
        booking.clickToDropdownSortingList();
        booking.clickToPropertyRatingLowToHighOptionOfDropdownSortingList();

        assertEquals("5 out of 5", booking.getRate(1));


    }
}
