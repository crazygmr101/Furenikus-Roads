package co.uk.silvania.roads;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RoadBlock extends Block {

        public RoadBlock (int texture, Material material) {
                super(texture, material);
        }
        
        public int getBlockTextureFromSide(int side){
        	if(side == 1){
        		return 1;
        	}else{
        		return 1;
        		
        	}

        }
        
        @Override
        public String getTextureFile () {
                return CommonProxy.BLOCK_PNG;
        }

}