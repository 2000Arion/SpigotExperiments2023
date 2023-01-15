package xyz.arion2000.spigot.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 2) {
                try {
                    @SuppressWarnings("deprecation")
                    Player player = Bukkit.getServer().getPlayer(args[1]);
                    assert player != null;
                    if (args[0].equalsIgnoreCase("0")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("1")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("2")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("3")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("survival")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("creative")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("adventure")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("su")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("c")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("a")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("sp")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("spec")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    }
                } catch (NullPointerException d) {
                    sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                }
                return false;
            }  else {
                sender.sendMessage(ChatColor.RED + "A player is required to run this command here");
            }
        }

            if (args.length == 1) {
                Player player = (Player) sender;
                if (args[0].equalsIgnoreCase("0")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("1")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("2")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("3")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("survival")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("creative")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("adventure")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("spectator")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("su")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("c")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                } else if (args[0].equalsIgnoreCase("a")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("sp")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                } else if (args[0].equalsIgnoreCase("spec")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                }
            } else if (args.length == 2) {
                try {
                    @SuppressWarnings("deprecation")
                    Player player = Bukkit.getServer().getPlayer(args[1]);
                    assert player != null;
                    if (args[0].equalsIgnoreCase("0")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("1")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("2")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("3")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("survival")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("creative")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("adventure")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("su")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Überlebensmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Überlebensmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("c")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Kreativmodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Kreativmodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("a")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Abenteuermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Abenteuermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("sp")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    } else if (args[0].equalsIgnoreCase("spec")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.WHITE + "Dein Spielmodus wurde auf Zuschauermodus gesetzt");
                        sender.sendMessage(ChatColor.WHITE + "Der Spielmodus von " + player.getName()
                                + " wurde auf Zuschauermodus gesetzt");
                    }
                } catch (NullPointerException d) {
                    sender.sendMessage(ChatColor.RED + "Es wurde kein Spieler gefunden");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "Unbekannter oder unvollständiger Befehl, siehe unten für den Fehler\n" +
                        ChatColor.GRAY + "gm" + ChatColor.RED + ChatColor.ITALIC + "<--[HIER]");
            }

            return false;

    }
}
