package com.daansander.plugin;

import me.daansander.serverchecker.ServerChecker;
import me.daansander.serverchecker.event.ServerConnectEvent;
import me.daansander.serverchecker.eventhandler.EventHandler;
import me.daansander.serverchecker.eventhandler.Listener;
import me.daansander.serverchecker.eventhandler.events.CommandProcesEvent;

/**
 * Created by Daan on 21-8-2015.
 */
public class EventForThisPLugin implements Listener {

    @EventHandler
    public void onServerConnect(CommandProcesEvent e) {
        ServerChecker.getServerChecker().getL().warning("CCOMMAND EXECUTED " + e.getCommand());
    }
}
