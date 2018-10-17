package seedu.address.model.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.medhistory.Allergy;
import seedu.address.model.medhistory.MedHistDate;
import seedu.address.model.medhistory.MedHistory;
import seedu.address.model.medhistory.PrevCountry;
import seedu.address.model.medicalreport.Date;
import seedu.address.model.medicalreport.Information;
import seedu.address.model.medicalreport.MedicalReport;
import seedu.address.model.medicalreport.Title;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.model.timetable.Appt;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {

    public static final Nric EMPTY_NRIC = new Nric("");
    public static final MedHistory EMPTY_MEDHISTORY = new MedHistory(new MedHistDate(""),
            new Allergy(""), new PrevCountry(""));
    public static final MedicalReport EMPTY_MEDICAL_REPORT = new MedicalReport(new Title(""), new Date(""),
            new Information(""));

    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("friends")),
            new Person(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("colleagues", "friends")),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("neighbours")),
            new Person(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("family")),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("classmates")),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"), EMPTY_MEDICAL_REPORT,
                       EMPTY_MEDHISTORY, getApptSet(), EMPTY_NRIC, getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

    /**
     * Returns an appt set containing the list of appts given.
     */
    // TODO: (Appt) MIGHT CONVERT TO USE STREAM IN FUTURE
    public static Set<Appt> getApptSet(Appt... appts) {
        Set<Appt> apptSet = new HashSet<>();
        for (Appt appt : appts) {
            apptSet.add(appt);
        }
        return apptSet;
    }
}
