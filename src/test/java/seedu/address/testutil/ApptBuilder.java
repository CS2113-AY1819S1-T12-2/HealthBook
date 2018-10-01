package seedu.address.testutil;

import seedu.address.model.timetable.Appt;
import seedu.address.model.timetable.ApptDateTime;
import seedu.address.model.timetable.ApptDrName;
import seedu.address.model.timetable.ApptInfo;
import seedu.address.model.timetable.ApptVenue;

/**
 * A utility class to help with building Appt objects.
 */
public class ApptBuilder {

    public static final String DEFAULT_APPT_START = "01/01/2018 14:00";
    public static final String DEFAULT_APPT_END = "01/01/2018 15:00";
    public static final String DEFAULT_APPT_VENUE = "Consultation Room 1";
    public static final String DEFAULT_APPT_INFO = "Diabetes Appt";
    public static final String DEFAULT_APPT_DR_NAME = "Dr Tan";

    private ApptDateTime apptStart;
    private ApptDateTime apptEnd;
    private ApptVenue apptVenue;
    private ApptInfo apptInfo;
    private ApptDrName apptDrName;

    public ApptBuilder() {
        apptStart = new ApptDateTime(DEFAULT_APPT_START);
        apptEnd = new ApptDateTime(DEFAULT_APPT_END);
        apptVenue = new ApptVenue(DEFAULT_APPT_VENUE);
        apptInfo = new ApptInfo(DEFAULT_APPT_INFO);
        apptDrName = new ApptDrName(DEFAULT_APPT_DR_NAME);
    }

    /**
     * Initializes the ApptBuilder with the data of {@code apptToCopy}.
     */
    public ApptBuilder(Appt apptToCopy) {
        apptStart = apptToCopy.getStart();
        apptEnd = apptToCopy.getEnd();
        apptVenue = apptToCopy.getVenue();
        apptInfo = apptToCopy.getInfo();
        apptDrName = apptToCopy.getDrName();
    }

    /**
     * Sets the {@code ApptStart} of the {@code Appt} that we are building.
     */
    public ApptBuilder withApptStart(String apptStart) {
        this.apptStart = new ApptDateTime(apptStart);
        return this;
    }

    /**
     * Sets the {@code ApptEnd} of the {@code Appt} that we are building.
     */
    public ApptBuilder withApptEnd(String apptEnd) {
        this.apptEnd = new ApptDateTime(apptEnd);
        return this;
    }

    /**
     * Sets the {@code ApptVenue} of the {@code Appt} that we are building.
     */
    public ApptBuilder withApptVenue(String apptVenue) {
        this.apptVenue = new ApptVenue(apptVenue);
        return this;
    }

    /**
     * Sets the {@code ApptInfo} of the {@code Appt} that we are building.
     */
    public ApptBuilder withApptInfo(String apptInfo) {
        this.apptInfo = new ApptInfo(apptInfo);
        return this;
    }

    /**
     * Sets the {@code ApptDrName} of the {@code Appt} that we are building.
     */
    public ApptBuilder withApptDrName(String apptDrName) {
        this.apptDrName = new ApptDrName(apptDrName);
        return this;
    }

    public Appt build() {
        return new Appt(apptStart, apptEnd, apptVenue, apptInfo, apptDrName);
    }
}
