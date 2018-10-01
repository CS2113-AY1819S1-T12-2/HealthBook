package seedu.address.model.medhistory;


import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents medical history's previous countries visited by a person.
 * Guarantees: immutable; is valid as declared in {@link #isValidCountry(String)}
 */
public class PrevCountry {

    public static final String MESSAGE_COUNTRY_CONSTRAINTS =
            "Names should only contain alphanumeric characters and spaces, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String COUNTRY_VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    public final String fullCountry;

    /**
     * Constructs a {@code PrevCountry}.
     *
     * @param country A valid country.
     */

    public PrevCountry(String country) {
        requireNonNull(country);
        checkArgument(isValidCountry(country), MESSAGE_COUNTRY_CONSTRAINTS);
        fullCountry = country;
    }

    /**
     * Returns true if a given string is a valid country.
     */

    public static boolean isValidCountry(String test) {
        return test.matches(COUNTRY_VALIDATION_REGEX);
    }

    @Override
    public String toString() {

        return fullCountry;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PrevCountry // instanceof handles nulls
                && fullCountry.equals(((PrevCountry) other).fullCountry)); // state check
    }

    @Override
    public int hashCode() {

        return fullCountry.hashCode();
    }

}
