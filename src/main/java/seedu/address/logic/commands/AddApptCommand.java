package seedu.address.logic.commands;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;
import static seedu.address.logic.parser.CliSyntax.*;

/**
 * Adds an appointment to a person's timetable.
 */
public class AddApptCommand extends Command {

    public static final String COMMAND_WORD = "addappt";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds an appointment to a patient's timetable, the" +
            " patient will be identified by the index number used in the last person listing.\n"
            + "Parameters: INDEX (must be a positive integer) "
//            + PREFIX_APPT_START + "[START] "
//            + PREFIX_APPT_END + "[END] "
//            + PREFIX_APPT_VENUE + "[VENUE] "
            + PREFIX_APPT_INFO + "[INFO] "
//            + PREFIX_APPT_DRNAME + "[DOCTOR'S NAME]\n"
            + "Example: " + COMMAND_WORD + " 1 "
//            + PREFIX_APPT_START + "16/09/2018 1500 "
//            + PREFIX_APPT_END + "16/09/2018 1530 "
//            + PREFIX_APPT_VENUE + "Consultation Room 12 "
            + PREFIX_APPT_INFO + "Diabetes Checkup ";
//            + PREFIX_APPT_DRNAME + "Dr Tan";

    public static final String MESSAGE_ARGUMENTS = "Index: %1$d, Appt: %2$s";

    private final Index index;
    private final String appt;

    /**
     * @param index of the person in the filtered person list to add appt
     * @param appt of the person to be updated to
     */
    public AddApptCommand(Index index, String appt) {
        requireAllNonNull(index, appt);
        this.index = index;
        this.appt = appt;
    }

    @Override
    public CommandResult execute(Model model, CommandHistory history) throws CommandException {
        throw new CommandException(String.format(MESSAGE_ARGUMENTS, index.getOneBased(), appt));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {    // short circuit if same object
            return true;
        }
        if (!(other instanceof AddApptCommand)) {   // instanceof handles nulls
            return false;
        }

        // state check
        AddApptCommand e = (AddApptCommand) other;
        return index.equals(e.index) && appt.equals(e.appt);
    }
}
