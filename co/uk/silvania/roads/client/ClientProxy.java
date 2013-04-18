package co.uk.silvania.roads.client;

import net.minecraftforge.client.MinecraftForgeClient;
import co.uk.silvania.roads.CommonProxy;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderThings() {
    		MinecraftForgeClient.preloadTexture("/co/uk/silvania/roads/blocks.png");
    		MinecraftForgeClient.preloadTexture("/co/uk/silvania/roads/items.png");
    		
        }
        
}