package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EscalatorModel extends ModelBase {
//fields
 ModelRenderer Step1;
 ModelRenderer Step2;
 ModelRenderer Step3;
 ModelRenderer Step4;
 ModelRenderer Banister1;
 ModelRenderer MetalSide1;
 ModelRenderer Base;
 ModelRenderer Side1;
 ModelRenderer Side2;
 ModelRenderer Side3;
 ModelRenderer Banister2;
 ModelRenderer MetalSide2;
 ModelRenderer Glass1;
 ModelRenderer Glass2;
 ModelRenderer Glass3;
 ModelRenderer Glass4;
 ModelRenderer Glass5;
 ModelRenderer Glass6;
 ModelRenderer Glass7;
 ModelRenderer Glass8;
 ModelRenderer Glass9;
 ModelRenderer Glass10;
 ModelRenderer Glass11;
 ModelRenderer Glass12;
 ModelRenderer Glass13;
 ModelRenderer Glass14;
 ModelRenderer Glass15;
 ModelRenderer Glass16;
 ModelRenderer Side4;
 ModelRenderer Side5;
 ModelRenderer Side6;
 ModelRenderer Side7;
 ModelRenderer Side8;
 ModelRenderer Side9;
 ModelRenderer Side10;
 ModelRenderer Side11;
 ModelRenderer Side12;
 ModelRenderer Side13;
 ModelRenderer Side14;
 ModelRenderer Side15;
 ModelRenderer Side16;
 ModelRenderer Side17;
 ModelRenderer Side18;
 ModelRenderer Side19;
 ModelRenderer Side20;
 ModelRenderer Side21;
 ModelRenderer Side22;
 ModelRenderer Side23;
 ModelRenderer Side24;
 ModelRenderer Side25;
 ModelRenderer Side26;
 ModelRenderer Side27;
 ModelRenderer Side28;
 ModelRenderer Side29;
 ModelRenderer Side30;
 ModelRenderer Side31;
 ModelRenderer Side32;
 ModelRenderer Glass17;
 ModelRenderer Glass18;
 ModelRenderer Glass19;
 ModelRenderer Glass20;
 ModelRenderer Glass21;
 ModelRenderer Glass22;
 ModelRenderer Glass23;
 ModelRenderer Glass24;
 ModelRenderer Glass25;
 ModelRenderer Glass26;
 ModelRenderer Glass27;
 ModelRenderer Glass28;
 ModelRenderer Glass29;
 ModelRenderer Glass30;
 ModelRenderer Glass31;
 ModelRenderer Glass32;

public EscalatorModel()
{
 textureWidth = 64;
 textureHeight = 32;
 
   Step1 = new ModelRenderer(this, 0, 24);
   Step1.addBox(0F, 0F, 0F, 12, 4, 4);
   Step1.setRotationPoint(-6F, 20F, -8F);
   Step1.setTextureSize(64, 32);
   Step1.mirror = true;
   setRotation(Step1, 0F, 0F, 0F);
   Step2 = new ModelRenderer(this, 0, 24);
   Step2.addBox(0F, 0F, 0F, 12, 4, 4);
   Step2.setRotationPoint(-6F, 16F, -4F);
   Step2.setTextureSize(64, 32);
   Step2.mirror = true;
   setRotation(Step2, 0F, 0F, 0F);
   Step3 = new ModelRenderer(this, 0, 24);
   Step3.addBox(0F, 0F, 0F, 12, 4, 4);
   Step3.setRotationPoint(-6F, 12F, 0F);
   Step3.setTextureSize(64, 32);
   Step3.mirror = true;
   setRotation(Step3, 0F, 0F, 0F);
   Step4 = new ModelRenderer(this, 0, 24);
   Step4.addBox(0F, 0F, 0F, 12, 4, 4);
   Step4.setRotationPoint(-6F, 8F, 4F);
   Step4.setTextureSize(64, 32);
   Step4.mirror = true;
   setRotation(Step4, 0F, 0F, 0F);
   Banister1 = new ModelRenderer(this, 52, 0);
   Banister1.addBox(-1F, 0F, -0.5F, 2, 23, 1);
   Banister1.setRotationPoint(7F, -11F, 7.5F);
   Banister1.setTextureSize(64, 32);
   Banister1.mirror = true;
   setRotation(Banister1, -0.7853982F, 0F, 0F);
   MetalSide1 = new ModelRenderer(this, 58, 0);
   MetalSide1.addBox(-1F, 0F, -0.5F, 2, 23, 1);
   MetalSide1.setRotationPoint(7F, 5F, 7.5F);
   MetalSide1.setTextureSize(64, 32);
   MetalSide1.mirror = true;
   setRotation(MetalSide1, -0.7853982F, 0F, 0F);
   Base = new ModelRenderer(this, 0, 0);
   Base.addBox(-8F, 0F, -0.5F, 16, 23, 1);
   Base.setRotationPoint(0F, 12F, 7.5F);
   Base.setTextureSize(64, 32);
   Base.mirror = true;
   setRotation(Base, -0.7853982F, 0F, 0F);
   Side1 = new ModelRenderer(this, 34, 0);
   Side1.addBox(0F, 0F, 0F, 1, 7, 1);
   Side1.setRotationPoint(6.1F, 20F, -8F);
   Side1.setTextureSize(64, 32);
   Side1.mirror = true;
   setRotation(Side1, 0F, 0F, 0F);
   Side2 = new ModelRenderer(this, 34, 0);
   Side2.addBox(0F, 0F, 0F, 1, 7, 1);
   Side2.setRotationPoint(6.1F, 19F, -7F);
   Side2.setTextureSize(64, 32);
   Side2.mirror = true;
   setRotation(Side2, 0F, 0F, 0F);
   Side3 = new ModelRenderer(this, 34, 0);
   Side3.addBox(0F, 0F, 0F, 1, 7, 1);
   Side3.setRotationPoint(6.1F, 18F, -6F);
   Side3.setTextureSize(64, 32);
   Side3.mirror = true;
   setRotation(Side3, 0F, 0F, 0F);
   Banister2 = new ModelRenderer(this, 52, 0);
   Banister2.addBox(-1F, 0F, -0.5F, 2, 23, 1);
   Banister2.setRotationPoint(-7F, -11F, 7.5F);
   Banister2.setTextureSize(64, 32);
   Banister2.mirror = true;
   setRotation(Banister2, -0.7853982F, 0F, 0F);
   MetalSide2 = new ModelRenderer(this, 58, 0);
   MetalSide2.addBox(-1F, 0F, -0.5F, 2, 23, 1);
   MetalSide2.setRotationPoint(-7F, 5F, 7.5F);
   MetalSide2.setTextureSize(64, 32);
   MetalSide2.mirror = true;
   setRotation(MetalSide2, -0.7853982F, 0F, 0F);
   Glass1 = new ModelRenderer(this, 39, 0);
   Glass1.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass1.setRotationPoint(6.5F, 4F, -8F);
   Glass1.setTextureSize(64, 32);
   Glass1.mirror = true;
   setRotation(Glass1, 0F, 0F, 0F);
   Glass2 = new ModelRenderer(this, 39, 0);
   Glass2.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass2.setRotationPoint(6.5F, 3F, -7F);
   Glass2.setTextureSize(64, 32);
   Glass2.mirror = true;
   setRotation(Glass2, 0F, 0F, 0F);
   Glass3 = new ModelRenderer(this, 39, 0);
   Glass3.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass3.setRotationPoint(6.5F, 2F, -6F);
   Glass3.setTextureSize(64, 32);
   Glass3.mirror = true;
   setRotation(Glass3, 0F, 0F, 0F);
   Glass4 = new ModelRenderer(this, 39, 0);
   Glass4.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass4.setRotationPoint(6.5F, 1F, -5F);
   Glass4.setTextureSize(64, 32);
   Glass4.mirror = true;
   setRotation(Glass4, 0F, 0F, 0F);
   Glass5 = new ModelRenderer(this, 39, 0);
   Glass5.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass5.setRotationPoint(6.5F, 0F, -4F);
   Glass5.setTextureSize(64, 32);
   Glass5.mirror = true;
   setRotation(Glass5, 0F, 0F, 0F);
   Glass6 = new ModelRenderer(this, 39, 0);
   Glass6.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass6.setRotationPoint(6.5F, -1F, -3F);
   Glass6.setTextureSize(64, 32);
   Glass6.mirror = true;
   setRotation(Glass6, 0F, 0F, 0F);
   Glass7 = new ModelRenderer(this, 39, 0);
   Glass7.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass7.setRotationPoint(6.5F, -2F, -2F);
   Glass7.setTextureSize(64, 32);
   Glass7.mirror = true;
   setRotation(Glass7, 0F, 0F, 0F);
   Glass8 = new ModelRenderer(this, 39, 0);
   Glass8.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass8.setRotationPoint(6.5F, -3F, -1F);
   Glass8.setTextureSize(64, 32);
   Glass8.mirror = true;
   setRotation(Glass8, 0F, 0F, 0F);
   Glass9 = new ModelRenderer(this, 39, 0);
   Glass9.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass9.setRotationPoint(6.5F, -4F, 0F);
   Glass9.setTextureSize(64, 32);
   Glass9.mirror = true;
   setRotation(Glass9, 0F, 0F, 0F);
   Glass10 = new ModelRenderer(this, 39, 0);
   Glass10.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass10.setRotationPoint(6.5F, -5F, 1F);
   Glass10.setTextureSize(64, 32);
   Glass10.mirror = true;
   setRotation(Glass10, 0F, 0F, 0F);
   Glass11 = new ModelRenderer(this, 39, 0);
   Glass11.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass11.setRotationPoint(6.5F, -6F, 2F);
   Glass11.setTextureSize(64, 32);
   Glass11.mirror = true;
   setRotation(Glass11, 0F, 0F, 0F);
   Glass12 = new ModelRenderer(this, 39, 0);
   Glass12.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass12.setRotationPoint(6.5F, -7F, 3F);
   Glass12.setTextureSize(64, 32);
   Glass12.mirror = true;
   setRotation(Glass12, 0F, 0F, 0F);
   Glass13 = new ModelRenderer(this, 39, 0);
   Glass13.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass13.setRotationPoint(6.5F, -8F, 4F);
   Glass13.setTextureSize(64, 32);
   Glass13.mirror = true;
   setRotation(Glass13, 0F, 0F, 0F);
   Glass14 = new ModelRenderer(this, 39, 0);
   Glass14.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass14.setRotationPoint(6.5F, -9F, 5F);
   Glass14.setTextureSize(64, 32);
   Glass14.mirror = true;
   setRotation(Glass14, 0F, 0F, 0F);
   Glass15 = new ModelRenderer(this, 39, 0);
   Glass15.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass15.setRotationPoint(6.5F, -10F, 6F);
   Glass15.setTextureSize(64, 32);
   Glass15.mirror = true;
   setRotation(Glass15, 0F, 0F, 0F);
   Glass16 = new ModelRenderer(this, 39, 0);
   Glass16.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass16.setRotationPoint(6.5F, -11F, 7F);
   Glass16.setTextureSize(64, 32);
   Glass16.mirror = true;
   setRotation(Glass16, 0F, 0F, 0F);
   Side4 = new ModelRenderer(this, 34, 0);
   Side4.addBox(0F, 0F, 0F, 1, 7, 1);
   Side4.setRotationPoint(6.1F, 17F, -5F);
   Side4.setTextureSize(64, 32);
   Side4.mirror = true;
   setRotation(Side4, 0F, 0F, 0F);
   Side5 = new ModelRenderer(this, 34, 0);
   Side5.addBox(0F, 0F, 0F, 1, 7, 1);
   Side5.setRotationPoint(6.1F, 16F, -4F);
   Side5.setTextureSize(64, 32);
   Side5.mirror = true;
   setRotation(Side5, 0F, 0F, 0F);
   Side6 = new ModelRenderer(this, 34, 0);
   Side6.addBox(0F, 0F, 0F, 1, 7, 1);
   Side6.setRotationPoint(6.1F, 15F, -3F);
   Side6.setTextureSize(64, 32);
   Side6.mirror = true;
   setRotation(Side6, 0F, 0F, 0F);
   Side7 = new ModelRenderer(this, 34, 0);
   Side7.addBox(0F, 0F, 0F, 1, 7, 1);
   Side7.setRotationPoint(6.1F, 14F, -2F);
   Side7.setTextureSize(64, 32);
   Side7.mirror = true;
   setRotation(Side7, 0F, 0F, 0F);
   Side8 = new ModelRenderer(this, 34, 0);
   Side8.addBox(0F, 0F, 0F, 1, 7, 1);
   Side8.setRotationPoint(6.1F, 13F, -1F);
   Side8.setTextureSize(64, 32);
   Side8.mirror = true;
   setRotation(Side8, 0F, 0F, 0F);
   Side9 = new ModelRenderer(this, 34, 0);
   Side9.addBox(0F, 0F, 0F, 1, 7, 1);
   Side9.setRotationPoint(6.1F, 12F, 0F);
   Side9.setTextureSize(64, 32);
   Side9.mirror = true;
   setRotation(Side9, 0F, 0F, 0F);
   Side10 = new ModelRenderer(this, 34, 0);
   Side10.addBox(0F, 0F, 0F, 1, 7, 1);
   Side10.setRotationPoint(6.1F, 11F, 1F);
   Side10.setTextureSize(64, 32);
   Side10.mirror = true;
   setRotation(Side10, 0F, 0F, 0F);
   Side11 = new ModelRenderer(this, 34, 0);
   Side11.addBox(0F, 0F, 0F, 1, 7, 1);
   Side11.setRotationPoint(6.1F, 10F, 2F);
   Side11.setTextureSize(64, 32);
   Side11.mirror = true;
   setRotation(Side11, 0F, 0F, 0F);
   Side12 = new ModelRenderer(this, 34, 0);
   Side12.addBox(0F, 0F, 0F, 1, 7, 1);
   Side12.setRotationPoint(6.1F, 9F, 3F);
   Side12.setTextureSize(64, 32);
   Side12.mirror = true;
   setRotation(Side12, 0F, 0F, 0F);
   Side13 = new ModelRenderer(this, 34, 0);
   Side13.addBox(0F, 0F, 0F, 1, 7, 1);
   Side13.setRotationPoint(6.1F, 8F, 4F);
   Side13.setTextureSize(64, 32);
   Side13.mirror = true;
   setRotation(Side13, 0F, 0F, 0F);
   Side14 = new ModelRenderer(this, 34, 0);
   Side14.addBox(0F, 0F, 0F, 1, 7, 1);
   Side14.setRotationPoint(6.1F, 7F, 5F);
   Side14.setTextureSize(64, 32);
   Side14.mirror = true;
   setRotation(Side14, 0F, 0F, 0F);
   Side15 = new ModelRenderer(this, 34, 0);
   Side15.addBox(0F, 0F, 0F, 1, 7, 1);
   Side15.setRotationPoint(6.1F, 6F, 6F);
   Side15.setTextureSize(64, 32);
   Side15.mirror = true;
   setRotation(Side15, 0F, 0F, 0F);
   Side16 = new ModelRenderer(this, 34, 0);
   Side16.addBox(0F, 0F, 0F, 1, 7, 1);
   Side16.setRotationPoint(6.1F, 5F, 7F);
   Side16.setTextureSize(64, 32);
   Side16.mirror = true;
   setRotation(Side16, 0F, 0F, 0F);
   Side17 = new ModelRenderer(this, 34, 0);
   Side17.addBox(0F, 0F, 0F, 1, 7, 1);
   Side17.setRotationPoint(-7.1F, 20F, -8F);
   Side17.setTextureSize(64, 32);
   Side17.mirror = true;
   setRotation(Side17, 0F, 0F, 0F);
   Side18 = new ModelRenderer(this, 34, 0);
   Side18.addBox(0F, 0F, 0F, 1, 7, 1);
   Side18.setRotationPoint(-7.1F, 19F, -7F);
   Side18.setTextureSize(64, 32);
   Side18.mirror = true;
   setRotation(Side18, 0F, 0F, 0F);
   Side19 = new ModelRenderer(this, 34, 0);
   Side19.addBox(0F, 0F, 0F, 1, 7, 1);
   Side19.setRotationPoint(-7.1F, 18F, -6F);
   Side19.setTextureSize(64, 32);
   Side19.mirror = true;
   setRotation(Side19, 0F, 0F, 0F);
   Side20 = new ModelRenderer(this, 34, 0);
   Side20.addBox(0F, 0F, 0F, 1, 7, 1);
   Side20.setRotationPoint(-7.1F, 17F, -5F);
   Side20.setTextureSize(64, 32);
   Side20.mirror = true;
   setRotation(Side20, 0F, 0F, 0F);
   Side21 = new ModelRenderer(this, 34, 0);
   Side21.addBox(0F, 0F, 0F, 1, 7, 1);
   Side21.setRotationPoint(-7.1F, 16F, -4F);
   Side21.setTextureSize(64, 32);
   Side21.mirror = true;
   setRotation(Side21, 0F, 0F, 0F);
   Side22 = new ModelRenderer(this, 34, 0);
   Side22.addBox(0F, 0F, 0F, 1, 7, 1);
   Side22.setRotationPoint(-7.1F, 15F, -3F);
   Side22.setTextureSize(64, 32);
   Side22.mirror = true;
   setRotation(Side22, 0F, 0F, 0F);
   Side23 = new ModelRenderer(this, 34, 0);
   Side23.addBox(0F, 0F, 0F, 1, 7, 1);
   Side23.setRotationPoint(-7.1F, 14F, -2F);
   Side23.setTextureSize(64, 32);
   Side23.mirror = true;
   setRotation(Side23, 0F, 0F, 0F);
   Side24 = new ModelRenderer(this, 34, 0);
   Side24.addBox(0F, 0F, 0F, 1, 7, 1);
   Side24.setRotationPoint(-7.1F, 13F, -1F);
   Side24.setTextureSize(64, 32);
   Side24.mirror = true;
   setRotation(Side24, 0F, 0F, 0F);
   Side25 = new ModelRenderer(this, 34, 0);
   Side25.addBox(0F, 0F, 0F, 1, 7, 1);
   Side25.setRotationPoint(-7.1F, 12F, 0F);
   Side25.setTextureSize(64, 32);
   Side25.mirror = true;
   setRotation(Side25, 0F, 0F, 0F);
   Side26 = new ModelRenderer(this, 34, 0);
   Side26.addBox(0F, 0F, 0F, 1, 7, 1);
   Side26.setRotationPoint(-7.1F, 11F, 1F);
   Side26.setTextureSize(64, 32);
   Side26.mirror = true;
   setRotation(Side26, 0F, 0F, 0F);
   Side27 = new ModelRenderer(this, 34, 0);
   Side27.addBox(0F, 0F, 0F, 1, 7, 1);
   Side27.setRotationPoint(-7.1F, 10F, 2F);
   Side27.setTextureSize(64, 32);
   Side27.mirror = true;
   setRotation(Side27, 0F, 0F, 0F);
   Side28 = new ModelRenderer(this, 34, 0);
   Side28.addBox(0F, 0F, 0F, 1, 7, 1);
   Side28.setRotationPoint(-7.1F, 9F, 3F);
   Side28.setTextureSize(64, 32);
   Side28.mirror = true;
   setRotation(Side28, 0F, 0F, 0F);
   Side29 = new ModelRenderer(this, 34, 0);
   Side29.addBox(0F, 0F, 0F, 1, 7, 1);
   Side29.setRotationPoint(-7.1F, 8F, 4F);
   Side29.setTextureSize(64, 32);
   Side29.mirror = true;
   setRotation(Side29, 0F, 0F, 0F);
   Side30 = new ModelRenderer(this, 34, 0);
   Side30.addBox(0F, 0F, 0F, 1, 7, 1);
   Side30.setRotationPoint(-7.1F, 7F, 5F);
   Side30.setTextureSize(64, 32);
   Side30.mirror = true;
   setRotation(Side30, 0F, 0F, 0F);
   Side31 = new ModelRenderer(this, 34, 0);
   Side31.addBox(0F, 0F, 0F, 1, 7, 1);
   Side31.setRotationPoint(-7.1F, 6F, 6F);
   Side31.setTextureSize(64, 32);
   Side31.mirror = true;
   setRotation(Side31, 0F, 0F, 0F);
   Side32 = new ModelRenderer(this, 34, 0);
   Side32.addBox(0F, 0F, 0F, 1, 7, 1);
   Side32.setRotationPoint(-7.1F, 5F, 7F);
   Side32.setTextureSize(64, 32);
   Side32.mirror = true;
   setRotation(Side32, 0F, 0F, 0F);
   Glass17 = new ModelRenderer(this, 39, 0);
   Glass17.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass17.setRotationPoint(-7.5F, 4F, -8F);
   Glass17.setTextureSize(64, 32);
   Glass17.mirror = true;
   setRotation(Glass17, 0F, 0F, 0F);
   Glass18 = new ModelRenderer(this, 39, 0);
   Glass18.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass18.setRotationPoint(-7.5F, 3F, -7F);
   Glass18.setTextureSize(64, 32);
   Glass18.mirror = true;
   setRotation(Glass18, 0F, 0F, 0F);
   Glass19 = new ModelRenderer(this, 39, 0);
   Glass19.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass19.setRotationPoint(-7.5F, 2F, -6F);
   Glass19.setTextureSize(64, 32);
   Glass19.mirror = true;
   setRotation(Glass19, 0F, 0F, 0F);
   Glass20 = new ModelRenderer(this, 39, 0);
   Glass20.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass20.setRotationPoint(-7.5F, 1F, -5F);
   Glass20.setTextureSize(64, 32);
   Glass20.mirror = true;
   setRotation(Glass20, 0F, 0F, 0F);
   Glass21 = new ModelRenderer(this, 39, 0);
   Glass21.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass21.setRotationPoint(-7.5F, 0F, -4F);
   Glass21.setTextureSize(64, 32);
   Glass21.mirror = true;
   setRotation(Glass21, 0F, 0F, 0F);
   Glass22 = new ModelRenderer(this, 39, 0);
   Glass22.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass22.setRotationPoint(-7.5F, -1F, -3F);
   Glass22.setTextureSize(64, 32);
   Glass22.mirror = true;
   setRotation(Glass22, 0F, 0F, 0F);
   Glass23 = new ModelRenderer(this, 39, 0);
   Glass23.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass23.setRotationPoint(-7.5F, -2F, -2F);
   Glass23.setTextureSize(64, 32);
   Glass23.mirror = true;
   setRotation(Glass23, 0F, 0F, 0F);
   Glass24 = new ModelRenderer(this, 39, 0);
   Glass24.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass24.setRotationPoint(-7.5F, -3F, -1F);
   Glass24.setTextureSize(64, 32);
   Glass24.mirror = true;
   setRotation(Glass24, 0F, 0F, 0F);
   Glass25 = new ModelRenderer(this, 39, 0);
   Glass25.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass25.setRotationPoint(-7.5F, -4F, 0F);
   Glass25.setTextureSize(64, 32);
   Glass25.mirror = true;
   setRotation(Glass25, 0F, 0F, 0F);
   Glass26 = new ModelRenderer(this, 39, 0);
   Glass26.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass26.setRotationPoint(-7.5F, -5F, 1F);
   Glass26.setTextureSize(64, 32);
   Glass26.mirror = true;
   setRotation(Glass26, 0F, 0F, 0F);
   Glass27 = new ModelRenderer(this, 39, 0);
   Glass27.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass27.setRotationPoint(-7.5F, -6F, 2F);
   Glass27.setTextureSize(64, 32);
   Glass27.mirror = true;
   setRotation(Glass27, 0F, 0F, 0F);
   Glass28 = new ModelRenderer(this, 39, 0);
   Glass28.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass28.setRotationPoint(-7.5F, -7F, 3F);
   Glass28.setTextureSize(64, 32);
   Glass28.mirror = true;
   setRotation(Glass28, 0F, 0F, 0F);
   Glass29 = new ModelRenderer(this, 39, 0);
   Glass29.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass29.setRotationPoint(-7.5F, -8F, 4F);
   Glass29.setTextureSize(64, 32);
   Glass29.mirror = true;
   setRotation(Glass29, 0F, 0F, 0F);
   Glass30 = new ModelRenderer(this, 39, 0);
   Glass30.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass30.setRotationPoint(-7.5F, -9F, 5F);
   Glass30.setTextureSize(64, 32);
   Glass30.mirror = true;
   setRotation(Glass30, 0F, 0F, 0F);
   Glass31 = new ModelRenderer(this, 39, 0);
   Glass31.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass31.setRotationPoint(-7.5F, -10F, 6F);
   Glass31.setTextureSize(64, 32);
   Glass31.mirror = true;
   setRotation(Glass31, 0F, 0F, 0F);
   Glass32 = new ModelRenderer(this, 39, 0);
   Glass32.addBox(0F, 0F, 0F, 1, 16, 1);
   Glass32.setRotationPoint(-7.5F, -11F, 7F);
   Glass32.setTextureSize(64, 32);
   Glass32.mirror = true;
   setRotation(Glass32, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
 super.render(entity, f, f1, f2, f3, f4, f5);
 setRotationAngles(f, f1, f2, f3, f4, f5, entity);
 Step1.render(f5);
 Step2.render(f5);
 Step3.render(f5);
 Step4.render(f5);
 Banister1.render(f5);
 MetalSide1.render(f5);
 Base.render(f5);
 Side1.render(f5);
 Side2.render(f5);
 Side3.render(f5);
 Banister2.render(f5);
 MetalSide2.render(f5);
 Glass1.render(f5);
 Glass2.render(f5);
 Glass3.render(f5);
 Glass4.render(f5);
 Glass5.render(f5);
 Glass6.render(f5);
 Glass7.render(f5);
 Glass8.render(f5);
 Glass9.render(f5);
 Glass10.render(f5);
 Glass11.render(f5);
 Glass12.render(f5);
 Glass13.render(f5);
 Glass14.render(f5);
 Glass15.render(f5);
 Glass16.render(f5);
 Side4.render(f5);
 Side5.render(f5);
 Side6.render(f5);
 Side7.render(f5);
 Side8.render(f5);
 Side9.render(f5);
 Side10.render(f5);
 Side11.render(f5);
 Side12.render(f5);
 Side13.render(f5);
 Side14.render(f5);
 Side15.render(f5);
 Side16.render(f5);
 Side17.render(f5);
 Side18.render(f5);
 Side19.render(f5);
 Side20.render(f5);
 Side21.render(f5);
 Side22.render(f5);
 Side23.render(f5);
 Side24.render(f5);
 Side25.render(f5);
 Side26.render(f5);
 Side27.render(f5);
 Side28.render(f5);
 Side29.render(f5);
 Side30.render(f5);
 Side31.render(f5);
 Side32.render(f5);
 Glass17.render(f5);
 Glass18.render(f5);
 Glass19.render(f5);
 Glass20.render(f5);
 Glass21.render(f5);
 Glass22.render(f5);
 Glass23.render(f5);
 Glass24.render(f5);
 Glass25.render(f5);
 Glass26.render(f5);
 Glass27.render(f5);
 Glass28.render(f5);
 Glass29.render(f5);
 Glass30.render(f5);
 Glass31.render(f5);
 Glass32.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
{
 super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
}

}
