package mod.minisse.elementals;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;



public class EffectsItemGroup extends ItemGroup {

    public static final EffectsItemGroup EFFECTS_ITEM_GROUP = new EffectsItemGroup(ItemGroup.GROUPS.length,"ramen");

    public EffectsItemGroup(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.RAMEN.get());
    }


}
