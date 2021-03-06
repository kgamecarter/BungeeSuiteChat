package com.minecraftdimensions.bungeesuitechat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.minecraftdimensions.bungeesuitechat.managers.PlayerManager;

public class IgnoreCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {

		if (args.length == 1) {
			PlayerManager.ignorePlayer(sender, args[0]);
			return true;
		}
		return false;
	}

}
