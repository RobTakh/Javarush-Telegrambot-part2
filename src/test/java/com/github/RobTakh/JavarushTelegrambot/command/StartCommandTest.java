package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.StartCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.RobTakh.JavarushTelegramBot.command.StartCommand.START_MESSAGE;
import static com.github.RobTakh.JavarushTelegramBot.command.CommandName.START;

@DisplayName("Unit-level for testing StartCommand")
public class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }

}
