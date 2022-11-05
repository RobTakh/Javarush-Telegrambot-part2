package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.CommandContainer;
import com.github.RobTakh.JavarushTelegramBot.command.CommandName;
import com.github.RobTakh.JavarushTelegramBot.command.UnknownCommand;
import com.github.RobTakh.JavarushTelegramBot.service.SendBotMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

@DisplayName("Unit-level testing for CommandContainer")
class CommandContainerTest {

    private CommandContainer commandContainer;

    @BeforeEach
    public void init(){
        SendBotMessageService sendBotMessageService = Mockito.mock(SendBotMessageService.class);
        commandContainer = new CommandContainer(sendBotMessageService);
    }

    @Test
    public void shouldGetAllTheExistingCommands() {
        // when-then
        Arrays.stream(CommandName.values())
                .forEach(commandName -> {
                    Command command = commandContainer.retrieveCommand(commandName.getCommandName());
                    Assertions.assertNotEquals(UnknownCommand.class, command.getClass());
                });
    }
        @Test
        public void shouldReturnUnknownCommand() {
        // given
        String unknownCommand = "/ghjklkjhghj";

        // when
        Command command = commandContainer.retrieveCommand(unknownCommand);

        // then
        Assertions.assertEquals(UnknownCommand.class, command.getClass());
        }
}
