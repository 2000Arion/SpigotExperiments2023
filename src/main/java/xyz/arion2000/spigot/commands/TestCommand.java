package xyz.arion2000.spigot.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String message = "Hallo ";

        sender.sendMessage(message + sender.getName() + "!");
        return false;
    }
}
