package co.uk.silvania.roads;

import co.uk.silvania.roads.block.*;
import co.uk.silvania.roads.item.*;
import co.uk.silvania.roads.liquid.*;
import co.uk.silvania.roads.tileentities.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.liquids.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="FlenixRoads", name="FlenixRoads", version="0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Roads { 
	
    @Instance("FlenixRoads")
    public static Roads instance;

    @SidedProxy(clientSide="co.uk.silvania.roads.client.ClientProxy", serverSide="co.uk.silvania.roads.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabRoads = new CreativeTabs("tabRoads") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Roads.roadBlockDYS, 1, 0);
		}
	};
			
	public static Block roadBlock;
	public static Block macadamBlock;
	public static Block cementBlock;
	public static Block limeStoneBlock;
	public static Block hardenedTarBlock;
	public static Block sidewalkBlocks;
	public static Block roadsTarStill;
	public static Block roadsTarFlowing;
	public static Block sidewalkKerbed;
	public static Block sidewalkKerbed1;
	public static Block sidewalkKerbed2;
	public static Block sidewalkKerbedInnerCorner;
	public static Block sidewalkKerbed1InnerCorner;
	public static Block sidewalkKerbed2InnerCorner;
	public static Block sidewalkKerbedOuterCorner;
	public static Block sidewalkKerbed1OuterCorner;
	public static Block sidewalkKerbed2OuterCorner;
	public static Block catsEye;
	public static Block catsEyeSide;
	
	public static Block roadBlockSWS2;
	public static Block roadBlockDYS;
	public static Block roadBlockDYSEL;
	public static Block roadBlockDYSER;
	public static Block roadBlockDYSI;
	public static Block roadBlockDYSO;
	public static Block roadBlockSYS;
	public static Block roadBlockSWS;
	public static Block roadBlockSWC;
	public static Block roadBlockSYC;
	public static Block roadBlockDYC;
	public static Block roadBlockWhiteCross;
	public static Block roadBlockYellowCross;
	public static Block roadBlockWhiteFull;
	public static Block roadBlockYellowFull;
	public static Block roadBlockWC;
	public static Block roadBlockFYS;
	public static Block roadBlockYC;
	public static Block roadBlockYAC;
	public static Block roadBlockWAC;
	public static Block roadBlockWSL;
	public static Block roadBlockWSSL;
	public static Block roadBlockYSSL;
	public static Block roadBlockJO;
	public static Block roadBlockJI;
	public static Block roadBlockJOL;
	public static Block roadBlockJIL;
	public static Block roadBlockJOIL;
	public static Block roadBlockJIIL;
	public static Block roadBlockAL;
	public static Block roadBlockAUS;
	public static Block roadBlockAUL;
	public static Block roadBlockAUR;
	public static Block roadBlockWDS;
	public static Block roadBlockYDS;
	public static Block roadBlockWSS;
	public static Block roadBlockYSS;
	public static Block roadBlockSL;
	public static Block roadBlockOW;
	public static Block roadBlockST;
	public static Block roadBlockOP;
	
	public static Block powerPole;
	//public static Block roadPainter;
	public static Block trafficLight;
	//public static Block trafficHanging;
	//public static Block lightBollard;
	//public static Block streetLamp1;
	//public static Block streetLamp2;
	//public static Block streetSign;
	
	//Items Start Here
	public static Item cementItem;
	public static Item cementDustItem;
	public static Item limeStonePowderItem;
	public static Item limeClayPowderItem;
	public static Item tarBucketItem;

	//And finally the worldgen
	public static WorldGen worldGen = new WorldGen();

    
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	RoadsConfig config = new RoadsConfig();
    	
    	RoadsConfig.loadConfig(event); 

    	roadBlock = new RoadBlock(config.roadBlockID).setUnlocalizedName("roadBlock");
    	macadamBlock = new MacadamBlock(config.macadamBlockID).setUnlocalizedName("macadamBlock");
    	cementBlock = new CementBlock(config.cementBlockID).setUnlocalizedName("cementBlock");
    	limeStoneBlock = new LimeStoneBlock(config.limeStoneBlockID).setUnlocalizedName("limeStoneBlock");
    	hardenedTarBlock = new HardenedTarBlock(config.hardenedTarBlockID).setUnlocalizedName("hardenedTarBlock");
    	sidewalkBlocks = new SideWalkBlocks(config.sidewalkBlocksID).setUnlocalizedName("sidewalkBlocks");
    	sidewalkKerbed = new SideWalkKerbed(config.sidewalkKerbedID).setUnlocalizedName("sidewalkKerbed");
    	sidewalkKerbed1 = new SideWalkKerbed1(config.sidewalkKerbed1ID).setUnlocalizedName("sidewalkKerbed1");
    	sidewalkKerbed2 = new SideWalkKerbed2(config.sidewalkKerbed2ID).setUnlocalizedName("sidewalkKerbed2");
    	sidewalkKerbedInnerCorner = new SideWalkKerbed(config.sidewalkKerbedInnerCornerID).setUnlocalizedName("sidewalkKerbedInnerCorner");
    	sidewalkKerbed1InnerCorner = new SideWalkKerbed1InnerCorner(config.sidewalkKerbed1InnerCornerID).setUnlocalizedName("sidewalkKerbed1InnerCorner");
    	sidewalkKerbed2InnerCorner = new SideWalkKerbed2InnerCorner(config.sidewalkKerbed2InnerCornerID).setUnlocalizedName("sidewalkKerbed2InnerCorner");
    	sidewalkKerbedOuterCorner = new SideWalkKerbed(config.sidewalkKerbedOuterCornerID).setUnlocalizedName("sidewalkKerbedOuterCorner");
    	sidewalkKerbed1OuterCorner = new SideWalkKerbed1(config.sidewalkKerbed1OuterCornerID).setUnlocalizedName("sidewalkKerbed1OuterCorner");
    	sidewalkKerbed2OuterCorner = new SideWalkKerbed2(config.sidewalkKerbed2OuterCornerID).setUnlocalizedName("sidewalkKerbed2OuterCorner");
    	catsEye = new CatsEye(config.catsEyeID).setUnlocalizedName("catsEye");
    	catsEyeSide = new CatsEyeSide(config.catsEyeSideID).setUnlocalizedName("catsEyeSide");
    	roadsTarStill = new StillTarBlock(config.roadsTarStillID).setUnlocalizedName("roadsTarStill");
    	roadsTarFlowing = new FlowingTarBlock(config.roadsTarFlowingID).setUnlocalizedName("roadsTarFlowing");
    	
    	roadBlockSWS2 = new RBSideWhiteStripe(config.roadBlockSWS2ID).setUnlocalizedName("roadBlockSWS2");
    	roadBlockDYS = new RBDoubleYellowStripe(config.roadBlockDYSID).setUnlocalizedName("roadBlockDYS");
    	roadBlockDYSEL = new RBDoubleYellowStripeEndLeft(config.roadBlockDYSELID).setUnlocalizedName("roadBlockDYSEL");
    	roadBlockDYSER = new RBDoubleYellowStripeEndRight(config.roadBlockDYSERID).setUnlocalizedName("roadBlockDYSER");
    	roadBlockDYSI = new RBDoubleYellowStripeInnerCorner(config.roadBlockDYSIID).setUnlocalizedName("roadBlockDYSI");
    	roadBlockDYSO = new RBDoubleYellowStripeOuterCorner(config.roadBlockDYSOID).setUnlocalizedName("roadBlockDYSO");
    	roadBlockSYS = new RBSingleYellowStripe(config.roadBlockSYSID).setUnlocalizedName("roadBlockSYS");
    	roadBlockSWS = new RBSingleWhiteSide(config.roadBlockSWSID).setUnlocalizedName("roadBlockSWS");
    	roadBlockSWC = new RBSingleWhiteCenter(config.roadBlockSWCID).setUnlocalizedName("roadBlockSWC");
    	roadBlockSYC = new RBSingleYellowCenter(config.roadBlockSYCID).setUnlocalizedName("roadBlockSYC");
    	roadBlockDYC = new RBDoubleYellowCenter(config.roadBlockDYCID).setUnlocalizedName("roadBlockDYC");
    	roadBlockWhiteCross = new RBWhiteCross(config.roadBlockWhiteCrossID).setUnlocalizedName("roadBlockWhiteCross");
    	roadBlockYellowCross = new RBYellowCross(config.roadBlockYellowCrossID).setUnlocalizedName("roadBlockYellowCross");
    	roadBlockWhiteFull = new RBWhiteFull(config.roadBlockWhiteFullID).setUnlocalizedName("roadBlockWhiteFull");
    	roadBlockYellowFull = new RBYellowFull(config.roadBlockYellowFullID).setUnlocalizedName("roadBlockYellowFull");
    	roadBlockWC = new RBWhiteCorner(config.roadBlockWCID).setUnlocalizedName("roadBlockWC");
    	roadBlockFYS = new RBFarYellowStripe(config.roadBlockFYSID).setUnlocalizedName("roadBlockFYS");
    	roadBlockYC = new RBYellowCorner(config.roadBlockYCID).setUnlocalizedName("roadBlockYC");
    	roadBlockYAC = new RBYellowAltCorner(config.roadBlockYACID).setUnlocalizedName("roadBlockYAC");
    	roadBlockWAC = new RBWhiteAltCorner(config.roadBlockWACID).setUnlocalizedName("roadBlockWAC");
    	roadBlockWSL = new RBWhiteStripedLine(config.roadBlockWSLID).setUnlocalizedName("roadBlockWSL");
    	roadBlockWSSL = new RBWhiteSideStripedLine(config.roadBlockWSSLID).setUnlocalizedName("roadBlockWSSL");
    	roadBlockYSSL = new RBYellowSideStripedLine(config.roadBlockYSSLID).setUnlocalizedName("roadBlockYSSL");
    	roadBlockJO = new RBJunctOut(config.roadBlockJOID).setUnlocalizedName("roadBlockJO");
    	roadBlockJI = new RBJunctIn(config.roadBlockJIID).setUnlocalizedName("roadBlockJI");
    	roadBlockJOL = new RBJunctOutLine(config.roadBlockJOLID).setUnlocalizedName("roadBlockJOL");
    	roadBlockJIL = new RBJunctInLine(config.roadBlockJILID).setUnlocalizedName("roadBlockJIL");
    	roadBlockJOIL = new RBJunctOutInvertedLine(config.roadBlockJOILID).setUnlocalizedName("roadBlockJOIL");
    	roadBlockJIIL = new RBJunctInInvertedLine(config.roadBlockJIILID).setUnlocalizedName("roadBlockJIIL");
    	roadBlockAL = new RBArrowLine(config.roadBlockALID).setUnlocalizedName("roadBlockAL");
    	roadBlockAUS = new RBArrowStraight(config.roadBlockAUSID).setUnlocalizedName("roadBlockAUS");
    	roadBlockAUL = new RBArrowLeft(config.roadBlockAULID).setUnlocalizedName("roadBlockAUL");
    	roadBlockAUR = new RBArrowRight(config.roadBlockAURID).setUnlocalizedName("roadBlockAUR");
    	roadBlockWDS = new RBWhiteDiagonalStripe(config.roadBlockWDSID).setUnlocalizedName("roadBlockWDS");
    	roadBlockYDS = new RBYellowDiagonalStripe(config.roadBlockYDSID).setUnlocalizedName("roadBlockYDS");
    	roadBlockWSS = new RBWhiteSmallSquare(config.roadBlockWSSID).setUnlocalizedName("roadBlockWSS");
    	roadBlockYSS = new RBYellowSmallSquare(config.roadBlockYSSID).setUnlocalizedName("roadBlockYSS");
    	roadBlockSL = new RBSL(config.roadBlockSLID).setUnlocalizedName("roadBlockSL");
    	roadBlockOW = new RBOW(config.roadBlockOWID).setUnlocalizedName("roadBlockOW");
    	roadBlockST = new RBST(config.roadBlockSTID).setUnlocalizedName("roadBlockST");
    	roadBlockOP = new RBOP(config.roadBlockOPID).setUnlocalizedName("roadBlockOP");
    	
    	powerPole = new PowerPoleBlock(config.powerPoleID).setUnlocalizedName("powerPole");
    	//roadPainter = new TileEntityRoadPainterBlock(config.roadPainterID).setUnlocalizedName("roadPainter");
    	trafficLight = new TileEntityTrafficLightBlock(config.trafficLightID).setUnlocalizedName("trafficLight");
    	//trafficHanging = new TileEntityTrafficHangingBlock(config.trafficHangingID).setUnlocalizedName("trafficHanging");
    	//lightBollard = new TileEntityLightBollardBlock(config.lightBollardID).setUnlocalizedName("lightBollard");
    	//streetLamp1 = new TileEntityStreetLamp1Block(config.streetLamp1ID).setUnlocalizedName("streetLamp1");
    	//streetLamp2 = new TileEntityStreetLamp2Block(config.streetLamp2ID).setUnlocalizedName("streetLamp2");
    	//streetSign = new TileEntityStreetSignBlock(config.streetSignID).setUnlocalizedName("streetSign");
    	
    	
    	cementItem = new CementItem(config.cementItemID).setUnlocalizedName("cementItem");
    	cementDustItem = new CementDustItem(config.cementDustID).setUnlocalizedName("cementDustItem");
    	limeStonePowderItem = new LimeStonePowderItem(config.limeStonePowderID).setUnlocalizedName("limeStonePowderItem");
    	limeClayPowderItem = new LimeClayPowderItem(config.limeClayPowderID).setUnlocalizedName("limeClayPowderItem");
    	tarBucketItem = new TarBucketItem(config.tarBucketID).setUnlocalizedName("tarBucketItem");
    	
        }
               
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderThings();
            
            proxy.registerBlocks();
            proxy.addNames();
            
            GameRegistry.registerTileEntity(TileEntityTrafficLightEntity.class, "tileEntityTrafficLight");
            
            LiquidContainerRegistry.registerLiquid(new LiquidContainerData(new LiquidStack(Roads.roadsTarStill, LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(Roads.tarBucketItem), new ItemStack(Item.bucketEmpty)));
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabRoads", "en_US", "Roads");

            //Setup the world generator
            GameRegistry.registerWorldGenerator(new WorldGen());

            //Craftin' Time!
            //First, register the blocks and items we'll use.
            ItemStack clayStack = new ItemStack(Item.clay);
            ItemStack sandStack = new ItemStack(Block.sand);
            ItemStack waterBucketStack = new ItemStack(Item.bucketWater);
            ItemStack cementDustStack = new ItemStack(Roads.cementDustItem);
            ItemStack cobbleStoneStack = new ItemStack(Block.cobblestone);
            ItemStack cementItemStack = new ItemStack(Roads.cementItem);
            ItemStack tarBucketStack = new ItemStack(Roads.tarBucketItem);
            ItemStack macadamStack = new ItemStack(Roads.macadamBlock);
            ItemStack limeStack = new ItemStack (Roads.limeStonePowderItem);

            //Shaped Recipes
            GameRegistry.addRecipe(new ItemStack(Roads.cementItem, 4), " c ", " w ", "sss", 'w', waterBucketStack, 's', sandStack, 'c', cementDustStack);
            GameRegistry.addRecipe(new ItemStack(Roads.macadamBlock, 8), "xxx", "xyx", "xxx", 'x', cobbleStoneStack, 'y', cementItemStack);
            GameRegistry.addRecipe(new ItemStack(Roads.limeStoneBlock), "ll", "ll", 'l', limeStack);

            //Shapeless Recipes
            GameRegistry.addShapelessRecipe(new ItemStack(Roads.roadBlock), macadamStack, tarBucketStack);
            GameRegistry.addShapelessRecipe(new ItemStack(Roads.limeClayPowderItem), limeStack, clayStack);

            //And some smelting!
            GameRegistry.addSmelting(Roads.limeClayPowderItem.itemID, new ItemStack(Roads.cementDustItem), 0.1f);
            GameRegistry.addSmelting(Roads.cementItem.itemID, new ItemStack(Roads.cementBlock), 0.2f);
            
            //RenderingRegistry.registerBlockHandler(new TileEntityTrafficLightRenderer());
        }


		@PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        		}
		};