package seedu.address.logic.commands;

import org.junit.Test;
import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.address.logic.commands.AddApptCommand.MESSAGE_ARGUMENTS;
import static seedu.address.logic.commands.CommandTestUtil.APPT_DUMMY1;
import static seedu.address.logic.commands.CommandTestUtil.APPT_DUMMY2;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND_PERSON;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

/**
 * Contains integration tests (interaction with the Model) and unit tests for AddApptCommand.
 */
public class AddApptCommandTest {

    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute() {
        final String appt = "Some appt";
        assertCommandFailure(new AddApptCommand(INDEX_FIRST_PERSON, appt), model, new CommandHistory(),
                String.format(MESSAGE_ARGUMENTS, INDEX_FIRST_PERSON.getOneBased(), appt));
    }

    @Test
    public void equals() {
        final AddApptCommand standardCommand = new AddApptCommand(INDEX_FIRST_PERSON, APPT_DUMMY1);

        // same values -> returns true
        AddApptCommand commandWithSameValues = new AddApptCommand(INDEX_FIRST_PERSON, APPT_DUMMY1);
        assertTrue(standardCommand.equals(commandWithSameValues));

        // same object -> returns true
        assertTrue(standardCommand.equals(standardCommand));

        // null -> returns false
        assertFalse(standardCommand.equals(null));

        // different types -> returns false
        assertFalse(standardCommand.equals(new ClearCommand()));

        // different index -> returns false
        assertFalse(standardCommand.equals(new AddApptCommand(INDEX_SECOND_PERSON, APPT_DUMMY1)));

        // different remark -> returns false
        assertFalse(standardCommand.equals(new AddApptCommand(INDEX_FIRST_PERSON, APPT_DUMMY2)));
    }
}
