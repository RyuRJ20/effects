package mod.minisse.elementals.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum Armor implements IArmorMaterial {
    SKELETON_1_TEST("skeleton_1_test", 10,new int[]{100,100,100,100},0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,10f,1f,()->Ingredient.fromItems(Items.FIRE_RELEASE.get()));


    private static final int[] baseDurability = {1000, 1000, 1000, 1000};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] amorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float thoughness;
    private final float knockbackResistence;
    private final Ingredient repaiIngredient;

    Armor(String name, int durabilityMultiplier, int[] amorVal, int enchantability, SoundEvent equipSound, float thoughness, float knockbackResistence, Supplier<Ingredient> repaiIngredient){
        this.name=name;
        this.durabilityMultiplier=durabilityMultiplier;
        this.amorVal=amorVal;
        this.enchantability=enchantability;
        this.equipSound=equipSound;
        this.thoughness=thoughness;
        this.knockbackResistence=knockbackResistence;
        this.repaiIngredient=repaiIngredient.get();
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return this.baseDurability[slot.getIndex()]*this.durabilityMultiplier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return this.amorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repaiIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.thoughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistence;
    }

}
