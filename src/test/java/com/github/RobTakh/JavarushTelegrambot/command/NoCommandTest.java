package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.NoCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.RobTakh.JavarushTelegramBot.command.NoCommand.NO_MESSAGE;
import static com.github.RobTakh.JavarushTelegramBot.command.CommandName.NO;

@DisplayName("Unit-level for testing NoCommand")
public class NoCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
