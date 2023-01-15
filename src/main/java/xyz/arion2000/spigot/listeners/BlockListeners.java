package xyz.arion2000.spigot.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.*;

public class BlockListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerPickupArrow(PlayerPickupArrowEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerItemDamage(PlayerItemDamageEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerArmorStandManipulate(PlayerArmorStandManipulateEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerBedLeave(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerBucketEntity(PlayerBucketEntityEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerBucketFill(PlayerBucketFillEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }


    @EventHandler(ignoreCancelled = true)
    public void onPlayerEditBook(PlayerEditBookEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerHarvestBlock(PlayerHarvestBlockEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("minecraft.admin")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Du benötigst Administrator-Rechte, um dies zu tun.");
        }
    }
}
