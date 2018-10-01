package seedu.address.testutil;

import seedu.address.model.timetable.Appt;

/**
 * A utility class containing a list of {@code Appt} objects to be used in tests.
 */
public class TypicalAppts {

    public static final Appt APPT_EXAMPLE1 = new ApptBuilder().withApptStart("01/01/2018 14:00")
            .withApptEnd("01/01/2018 15:00").withApptVenue("Consultation Room 1").withApptInfo("Diabetes Checkup")
            .withApptDrName("Dr Tan").build();
    public static final Appt APPT_EXAMPLE2 = new ApptBuilder().withApptStart("02/02/2018 15:00")
            .withApptEnd("02/02/2018 16:00").withApptVenue("Consultation Room 2").withApptInfo("Asthma Checkup")
            .withApptDrName("Dr Lim").build();
}
