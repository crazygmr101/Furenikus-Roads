package com.silvaniastudios.roads.client.model;

import java.awt.Color;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.vecmath.Matrix4f;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.primitives.Ints;
import com.silvaniastudios.roads.FurenikusRoads;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class CrusherBakedModel implements IBakedModel {
	
	private IBakedModel model;
	float p = 1/16F;
	private CrusherOverrideList overrideList;
	String rot;
	
	public CrusherBakedModel(IBakedModel model, String rot) {
		this.model = model;
		this.rot = rot;
		this.overrideList = new CrusherOverrideList(this);
	}

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		List<BakedQuad> quadList = new LinkedList<BakedQuad>();
		quadList.addAll(model.getQuads(state, side, rand));
		
		if (side == null) {
			return model.getQuads(state, side, rand);
		}
		
		TextureAtlasSprite tex = Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(FurenikusRoads.MODID + ":blocks/machine_vent_back_on");
		
		if (rot.equalsIgnoreCase("north")) {
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					2.24F*p, 1.5F *p, 2.75F *p, 
					2.24F*p, 1.5F *p, 13.25F*p,
					2.24F*p, 6.75F*p, 13.25F*p,
					2.24F*p, 6.75F*p, 2.75F *p), 0.007F));
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					13.76F*p, 1.5F *p, 13.25F*p, 
					13.76F*p, 1.5F *p, 2.75F *p,
					13.76F*p, 6.75F*p, 2.75F *p,
					13.76F*p, 6.75F*p, 13.25F*p), 0.007F));
		}
		
		if (rot.equalsIgnoreCase("west")) {
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					13.25F*p, 1.5F *p, 2.24F*p, 
					2.75F *p, 1.5F *p, 2.24F*p,
					2.75F *p, 6.75F*p, 2.24F*p,
					13.25F*p, 6.75F*p, 2.24F*p), 0.007F));
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					2.75F *p, 1.5F *p, 13.76F*p, 
					13.25F*p, 1.5F *p, 13.76F*p,
					13.25F*p, 6.75F*p, 13.76F*p,
					2.75F *p, 6.75F*p, 13.76F*p), 0.007F));
		}
		
		if (rot.equalsIgnoreCase("south")) {
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					2.24F*p, 1.5F *p, 2.75F *p, 
					2.24F*p, 1.5F *p, 13.25F*p,
					2.24F*p, 6.75F*p, 13.25F*p,
					2.24F*p, 6.75F*p, 2.75F *p), 0.007F));
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					13.76F*p, 1.5F *p, 13.25F*p, 
					13.76F*p, 1.5F *p, 2.75F *p,
					13.76F*p, 6.75F*p, 2.75F *p,
					13.76F*p, 6.75F*p, 13.25F*p), 0.007F));
		}
		
		if (rot.equalsIgnoreCase("east")) {
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					13.25F*p, 1.5F *p, 2.24F*p, 
					2.75F *p, 1.5F *p, 2.24F*p,
					2.75F *p, 6.75F*p, 2.24F*p,
					13.25F*p, 6.75F*p, 2.24F*p), 0.007F));
			quadList.add(RenderHelper.setBrightTexture(light(tex,
					//SW SE NE NW
					2.75F *p, 1.5F *p, 13.76F*p, 
					13.25F*p, 1.5F *p, 13.76F*p,
					13.25F*p, 6.75F*p, 13.76F*p,
					2.75F *p, 6.75F*p, 13.76F*p), 0.007F));
		}	
		return quadList;
	}
	
	private BakedQuad light(TextureAtlasSprite texture, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
		int packednormal;
		packednormal = RenderHelper.calculatePackedNormal(x1, y1, z1,  x2, y2, z2,  x3, y3, z3,  x4, y4, z4);
		return new BakedQuad(Ints.concat(
				RenderHelper.vertexToInts(x1, y1, z1, Color.WHITE.getRGB(), texture, 16, 16, packednormal),
				RenderHelper.vertexToInts(x2, y2, z2, Color.WHITE.getRGB(), texture, 16, 0, packednormal),
				RenderHelper.vertexToInts(x3, y3, z3, Color.WHITE.getRGB(), texture, 0, 0, packednormal),
				RenderHelper.vertexToInts(x4, y4, z4, Color.WHITE.getRGB(), texture, 0, 16, packednormal)),
				0, EnumFacing.SOUTH, texture, true, net.minecraft.client.renderer.vertex.DefaultVertexFormats.ITEM);
	}

	@Override
	public boolean isAmbientOcclusion() {
		return model.isAmbientOcclusion();
	}

	@Override
	public boolean isGui3d() {
		return model.isGui3d();
	}

	@Override
	public boolean isBuiltInRenderer() {
		return false;
	}

	@Override
	public TextureAtlasSprite getParticleTexture() {
		return model.getParticleTexture();
	}

	@Override
	public ItemOverrideList getOverrides() {
		return this.overrideList;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public ItemCameraTransforms getItemCameraTransforms() {
		return model.getItemCameraTransforms();
	}
	
	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
		Matrix4f matrix4f = model.handlePerspective(cameraTransformType).getRight();
		return Pair.of(this, matrix4f);
	}
	
	public CrusherBakedModel setCurrentItemStack(ItemStack stack) {
		return this;
	}
	
	private static class CrusherOverrideList extends ItemOverrideList {
		private CrusherBakedModel model;
		
		public CrusherOverrideList(CrusherBakedModel model) {
			super(Collections.emptyList());
			this.model = model;
		}
		
		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world, EntityLivingBase entity) {
			return this.model.setCurrentItemStack(stack);
		}
	}

}
