package com.capinol.betterthancoal.item.custom;

import com.mojang.realmsclient.dto.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.OutgoingChatMessage;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class TextSenderItem extends Item {
    public TextSenderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        greet(player);
        return InteractionResult.SUCCESS;
    }

    public void greet(Player player) {
        player.sendSystemMessage(Component.literal("Hewwo :3"));
    }
}
