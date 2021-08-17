package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.HelpCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.RobTakh.JavarushTelegramBot.command.CommandName.HELP;
import static com.github.RobTakh.JavarushTelegramBot.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
