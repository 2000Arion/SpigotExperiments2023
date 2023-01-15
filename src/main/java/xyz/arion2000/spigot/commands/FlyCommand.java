package xyz.arion2000.spigot.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 1) {
                try {
                    @SuppressWarnings("deprecation")
                    Player player = Bukkit.getServer().getPlayer(args[0]);
                    assert player != null;
                    if (!player.getAllowFlight()) {
                        player.setAllowFlight(true);
                        player.sendMessage(ChatColor.WHITE + sender.getName() + " hat Fliegen wurde für dich "
                                + ChatColor.GREEN + "aktiviert");
                        sender.sendMessage(ChatColor.WHITE + "Fliegen wurde für " + player.getName()
                                + ChatColor.GREEN + " aktiviert");
                    } else if (player.getAllowFlight()) {
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.WHITE + sender.getName() + " hat Fliegen wurde für dich "
                                + ChatColor.RED + "deaktiviert");
                        sender.sendMessage(ChatColor.WHITE + "Fliegen wurde für " + player.getName()
                                + ChatColor.RED + " deaktiviert");
                    }
                } catch (NullPointerException d) {
                    sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "A player is required to run this command here");
            }
            return false;
        }

        if (sender.hasPermission("minecraft.admin")) {
            if (args.length == 1) {
                try {
                    @SuppressWarnings("deprecation")
                    Player player = Bukkit.getServer().getPlayer(args[0]);
                    assert player != null;
                    if (!player.getAllowFlight()) {
                        player.setAllowFlight(true);
                        player.sendMessage(ChatColor.WHITE + sender.getName() + " hat Fliegen wurde für dich "
                                + ChatColor.GREEN + "aktiviert");
                        sender.sendMessage(ChatColor.WHITE + "Fliegen wurde für " + player.getName()
                                + ChatColor.GREEN + " aktiviert");
                    } else if (player.getAllowFlight()) {
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.WHITE + sender.getName() + " hat Fliegen wurde für dich "
                                + ChatColor.RED + "deaktiviert");
                        sender.sendMessage(ChatColor.WHITE + "Fliegen wurde für " + player.getName()
                                + ChatColor.RED + " deaktiviert");
                    }
                } catch (NullPointerException d) {
                    sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                }
            } else if (args.length == 0) {
                Player player = (Player) sender;
                if (!player.getAllowFlight()) {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.WHITE + "Fliegen wurde für dich " + ChatColor.GREEN + "aktiviert");
                } else if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.WHITE + "Fliegen wurde für dich " + ChatColor.RED + "deaktiviert");
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "Keine Berechtigung!");
        }

        return false;
    }
}
