package mod.minisse.elementals;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class NarutoCards extends ItemGroup {

    public static final NarutoCards NARUTO_CARDS = new NarutoCards(ItemGroup.GROUPS.length,"sasuke_booster");

    public NarutoCards(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.SASUKE_BOOSTER.get());
    }

    
}
