package mod.minisse.elementals;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class skeleton_1_test extends EntityModel<Entity>{
	private ModelRenderer Head;
	private ModelRenderer bone;
	private ModelRenderer cube_r1;
	private ModelRenderer cube_r2;
	private ModelRenderer cube_r3;
	private ModelRenderer cube_r4;
	private ModelRenderer cube_r5;
	private ModelRenderer cube_r6;
	private ModelRenderer cube_r7;
	private ModelRenderer cube_r8;
	private ModelRenderer cube_r9;
	private ModelRenderer cube_r10;
	private ModelRenderer cube_r11;
	private ModelRenderer Body;
	private ModelRenderer RightArm;
	private ModelRenderer LeftArm;
	private ModelRenderer RightLeg;
	private ModelRenderer LeftLeg;

	public skeleton_1_test() {
		int textureWidth = 64;
		int textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 8.0F);
		Head.addChild(bone);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -12.0F, 0.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-12.0F, 13.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-12.0F, 6.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-10.0F, -6.0F, -14.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(8.0F, -6.0F, -14.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(9.0F, 0.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-11.0F, 0.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.1F, 13.0F, -19.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.1F, 6.0F, -19.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.9F, 13.0F, -19.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-7.1F, -6.0F, -17.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(1.9F, 0.0F, -19.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.9F, 6.0F, -19.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(1.9F, -6.0F, -17.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-7.1F, 0.0F, -19.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(10.0F, 6.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(10.0F, 13.0F, -15.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(9.0F, 8.0F, -18.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, 5.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(7.0F, -4.0F, -17.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-10.0F, 2.0F, -16.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(8.0F, 2.0F, -18.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-9.0F, -4.0F, -15.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.6981F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-11.0F, 15.0F, -16.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 15.0F, 0.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.4363F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, 0.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -15.0F, 0.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -21.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-9.0F, 15.0F, 13.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, -3.1416F, 0.4363F, 3.1416F);
		cube_r8.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 13.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-9.0F, 8.0F, 13.0F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, -3.1416F, 0.4363F, 3.1416F);
		cube_r9.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 13.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-9.0F, 2.0F, 13.0F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, -3.1416F, 0.4363F, 3.1416F);
		cube_r10.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 13.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-9.0F, -4.0F, 13.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, 0.4363F, 3.1416F);
		cube_r11.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}