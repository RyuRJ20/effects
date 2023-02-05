package mod.minisse.elementals.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class Iggi extends ItemGroup {

    public static final Iggi IGGI = new Iggi(ItemGroup.GROUPS.length,"iggi");

    public Iggi(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.IGGI.get());
    }


}
