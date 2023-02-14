package fr.steelfri.factionrenamecancel;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.massivecraft.factions.event.FactionRenameEvent;

public final class FactionRenameCancel extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getConsoleSender().sendMessage(
                "§9" + getDescription().getName() + " enable!\n" +
                        "§9Version : " + getDescription().getVersion() + "\n" +
                        "§9Steelfri"
        );
    }

    @EventHandler
    public void onFactionRename(FactionRenameEvent event) {
        event.setCancelled(true);
        Player player = event.getfPlayer().getPlayer();
        player.sendMessage("You can't rename ur faction.");
    }
}

