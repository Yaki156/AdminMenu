package me.yaki.adminmenu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ISPOLNIZHELANIE implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Inventory gui = Bukkit.createInventory(player, 9, ChatColor.RED + "Админ Панель");

        ItemStack itemStack = new ItemStack(Material.BARRIER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "Killer");
        itemStack.setItemMeta(itemMeta);

        ItemStack itemStack1 = new ItemStack(Material.STICK);
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        itemMeta1.setDisplayName(ChatColor.RED + "VanShot");
        itemStack1.setItemMeta(itemMeta1);

        ItemStack itemStack2 = new ItemStack(Material.POTION);
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        itemMeta2.setDisplayName(ChatColor.RED + "GodMode");
        itemStack2.setItemMeta(itemMeta2);

        ItemStack itemStack3 = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        ItemMeta itemMeta3 = itemStack3.getItemMeta();
        itemMeta3.setDisplayName(ChatColor.RED + "Zombie10k");
        itemStack3.setItemMeta(itemMeta3);

        gui.setItem(1, itemStack);
        gui.setItem(3, itemStack1);
        gui.setItem(5, itemStack2);
        gui.setItem(7, itemStack3);

        player.openInventory(gui);

        return false;
    }
}