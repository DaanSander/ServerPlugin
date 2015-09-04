package com.daansander.plugin;

import me.daansander.serverchecker.command.CommandExecutor;

/**
 * Created by Daan on 21-8-2015.
 */
public class TestCommand implements CommandExecutor {
    @Override
    public void onCommand(String s, String[] strings) {
        if(s.equalsIgnoreCase("testCommand")) {
            l.info("YEASJFUWEYU$WUJTHWRJIOFGJRGIGDSIREIGJOJRSDHGJSHGJSHFKGJH  DAAN");
        }
    }
}
