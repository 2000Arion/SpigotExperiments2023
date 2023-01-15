package xyz.arion2000.spigot.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 1) {
                try {
                    @SuppressWarnings("deprecation")
                    Player player = Bukkit.getServer().getPlayer(args[0]);
                    assert player != null;
                    player.setHealth(20);
                    player.setFoodLevel(20);
                    sender.sendMessage(ChatColor.WHITE + player.getName() + " wurde " + ChatColor.GREEN + "geheilt");
                    player.sendMessage(ChatColor.WHITE + sender.getName() + " hat dich " + ChatColor.GREEN + "geheilt");
                } catch (NullPointerException d) {
                    sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                }
                return false;
            }  else {
                sender.sendMessage(ChatColor.RED + "A player is required to run this command here");
            }
        }

            if (sender.hasPermission("minecraft.admin")) {
                if (args.length == 1) {
                    try {
                        @SuppressWarnings("deprecation")
                        Player player = Bukkit.getServer().getPlayer(args[0]);
                        assert player != null;
                        player.setHealth(20);
                        player.setFoodLevel(20);
                        sender.sendMessage(ChatColor.WHITE + player.getName() + " wurde " + ChatColor.GREEN + "geheilt");
                        player.sendMessage(ChatColor.WHITE + sender.getName() + " hat dich " + ChatColor.GREEN + "geheilt");
                    } catch (NullPointerException d) {
                        sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                    }
                    return false;
                } else if (args.length == 0) {
                    Player player = (Player) sender;
                    player.setHealth(20);
                    player.setFoodLevel(20);
                    sender.sendMessage(ChatColor.WHITE + "Du wurdest " + ChatColor.GREEN + "geheilt");
                    return false;

                }
            } else {
                sender.sendMessage(ChatColor.RED + "Keine Berechtigung!");
                return false;
            }

            return false;
    }

}
