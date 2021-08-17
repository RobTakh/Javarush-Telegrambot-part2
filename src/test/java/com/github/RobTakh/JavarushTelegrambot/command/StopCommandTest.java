package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.StopCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.RobTakh.JavarushTelegramBot.command.StopCommand.STOP_MESSAGE;
import static com.github.RobTakh.JavarushTelegramBot.command.CommandName.STOP;

@DisplayName("Unit-level for testing StopCommand")
public class StopCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
