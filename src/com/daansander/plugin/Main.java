package com.daansander.plugin;


import me.daansander.serverchecker.ServerChecker;
import me.daansander.serverchecker.plugin.Plugin;

/**
 * Created by Daan on 1-8-2015.
 */
public class Main implements Plugin {

    @Override
    public void onEnable() {
        ServerChecker.getServerChecker().getM().registerCommand("testCommand", new TestCommand());
        System.out.println("registering event");
        ServerChecker.getServerChecker().getE().registerEvent(new EventForThisPLugin());
    }

}
