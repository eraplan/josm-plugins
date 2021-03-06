/*
 *      CommandAction.java
 *
 *      Copyright 2011 Hind <foxhind@gmail.com>
 *
 */

package CommandLine;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import org.openstreetmap.josm.actions.JosmAction;
import org.openstreetmap.josm.tools.ImageProvider;

public class CommandAction extends JosmAction {
    private final CommandLine parentPlugin;
    private final Command parentCommand;
    public CommandAction(Command parentCommand, CommandLine parentPlugin) {
        super(tr(parentCommand.name), "blankmenu", tr(parentCommand.name), null, true, parentCommand.name, true);
        if (!parentCommand.icon.equals("")) {
            try {
                putValue(Action.SMALL_ICON, ImageProvider.get(CommandLine.pluginDir, parentCommand.icon));
                putValue(Action.LARGE_ICON_KEY, ImageProvider.get(CommandLine.pluginDir, parentCommand.icon));
            }
            catch (NullPointerException e) {
                putValue(Action.SMALL_ICON, ImageProvider.get("blankmenu"));
                putValue(Action.LARGE_ICON_KEY, ImageProvider.get("blankmenu"));
            }
            catch (RuntimeException e) {
                putValue(Action.SMALL_ICON, ImageProvider.get("blankmenu"));
                putValue(Action.LARGE_ICON_KEY, ImageProvider.get("blankmenu"));
            }
        }

        this.parentCommand = parentCommand;
        this.parentPlugin = parentPlugin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parentPlugin.startCommand(parentCommand);
        parentPlugin.history.addItem(parentCommand.name);
    }
}
