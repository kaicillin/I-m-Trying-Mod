package noidea.trying.client.command;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.text.Text;

public class TryingClientCommands implements ModInitializer {

    public void onInitialize(){
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("client_command").executes(context -> {
                context.getSource().sendFeedback(Text.literal("A /client_command which returns something?"));
                return 1;
            }));
        });
    }
}
