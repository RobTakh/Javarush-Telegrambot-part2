package com.github.RobTakh.JavarushTelegrambot.command;

import com.github.RobTakh.JavarushTelegramBot.bot.JavarushTelegramBot;
import com.github.RobTakh.JavarushTelegramBot.command.Command;
import com.github.RobTakh.JavarushTelegramBot.command.HelpCommand;
import com.github.RobTakh.JavarushTelegramBot.service.SendBotMessageService;
import com.github.RobTakh.JavarushTelegramBot.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Abstract class for testing {@link Command}s
 */

abstract class AbstractCommandTest {

    protected JavarushTelegramBot javarushBot = Mockito.mock(JavarushTelegramBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageServiceImpl(javarushBot);

    abstract String getCommandName();

    abstract String getCommandMessage();

    abstract Command getCommand();

    @Test
    public void shouldProperlyExecuteCommand() throws TelegramApiException {
        // given
        Long chatId = 1234567823456L;

        Update update = new Update();
        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatId);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);

        // when
        getCommand().execute(update);

        // then
        Mockito.verify(javarushBot).execute(sendMessage);
    }
}
