package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions for Person */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_BLOODTYPE = new Prefix("b/");

    /* Prefix definitions for Appt */
    public static final Prefix PREFIX_APPT_START = new Prefix("s/");
    public static final Prefix PREFIX_APPT_END = new Prefix("e/");
    public static final Prefix PREFIX_APPT_VENUE = new Prefix("v/");
    public static final Prefix PREFIX_APPT_INFO = new Prefix("i/");
    public static final Prefix PREFIX_APPT_DRNAME = new Prefix("d/");
}
