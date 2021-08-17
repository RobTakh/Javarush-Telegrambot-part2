package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.UnknownCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.RobTakh.JavarushTelegramBot.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level for testing UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/ghjkl;lkjh";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
