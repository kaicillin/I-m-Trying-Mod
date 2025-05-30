package noidea.trying.command;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.text.Text;
import noidea.trying.Trying;

public class TryingCommands implements ModInitializer {

    @Override
    public void onInitialize(){
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("try_command").executes(context -> {
                context.getSource().sendFeedback(() -> Text.literal("Called /try_command."), true);
                return 1;
            }));
        });
    }
}
