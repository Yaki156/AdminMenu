package me.yaki.adminmenu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

public class Event implements Listener {

    @EventHandler
    void onClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        ItemStack itemStack = new ItemStack(Material.STICK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "Бивень");
        itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 10000, true);
        itemStack.setItemMeta(itemMeta);




        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Админ Панель")){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return;
            }else if(event.getCurrentItem().getType().equals(Material.BARRIER)){
                player.closeInventory();
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @e");
            }else if (event.getCurrentItem().getType().equals(Material.STICK)){
                player.closeInventory();
                player.getInventory().addItem(itemStack);
            }else if (event.getCurrentItem().getType().equals(Material.POTION)){
                player.closeInventory();
                player.setNoDamageTicks(Integer.MAX_VALUE);
            } else if (event.getCurrentItem().getType().equals(Material.ZOMBIE_SPAWN_EGG)) {
                player.closeInventory();
                Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);

            }

        }



    }


    }

