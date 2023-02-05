package mod.minisse.elementals.items;

import mod.minisse.elementals.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Effects.MOD_ID);

    public static final RegistryObject<Item> RAMEN = ITEMS.register("ramen",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(20).saturation(5.2f).setAlwaysEdible().build())));


    public static final RegistryObject<Item> COOKED_RICE = ITEMS.register("cooked_rice",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(6f).setAlwaysEdible().build())));

    public static final RegistryObject<Item> FIRE_RELEASE = ITEMS.register("fire_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> LIGHTNING_RELEASE = ITEMS.register("lightning_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> WATER_RELEASE = ITEMS.register("water_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> BOIL_RELEASE = ITEMS.register("boil_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> STORM_RELEASE = ITEMS.register("storm_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> WIND_RELEASE = ITEMS.register("wind_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> DUST_RELEASE = ITEMS.register("dust_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> LAVA_RELEASE = ITEMS.register("lava_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> DARK_RELEASE = ITEMS.register("dark_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> YIN_RELEASE = ITEMS.register("yin_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> yang_RELEASE = ITEMS.register("yang_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> YIN_YANG_RELEASE = ITEMS.register("yin_yang_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> SCORCH_RELEASE = ITEMS.register("scorch_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> CRYSTAL_RELEASE = ITEMS.register("crystal_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> BLAZE_RELEASE = ITEMS.register("blaze_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> WOOD_RELEASE = ITEMS.register("wood_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> EARTH_RELEASE = ITEMS.register("earth_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> MAGNET_RELEASE = ITEMS.register("magnet_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> ICE_RELEASE = ITEMS.register("ice_release",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> DIMENSIONS_RELEASE = ITEMS.register("dimensions_release",
            () -> new Dimensions_release(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> SKELETON_1_TEST = ITEMS.register("skeleton_1_test",
            () -> new ArmorItem(Armor.SKELETON_1_TEST, EquipmentSlotType.HEAD,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> KUSANAGI = ITEMS.register("kusanagi",
            () -> new SwordItem(Tools.KUSANAGI,15,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> BONE_SWORD_1 = ITEMS.register("bone_sword_1",
            () -> new SwordItem(Tools.KUSANAGI,10,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> GUNBAI_1 = ITEMS.register("gunbai_1",
            () -> new SwordItem(Tools.KUSANAGI,30,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> KIBA = ITEMS.register("kiba",
            () -> new SwordItem(Tools.KUSANAGI,25,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> KUBIKIRIBOCHO = ITEMS.register("kubikiribocho",
            () -> new SwordItem(Tools.KUSANAGI,25,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));


    public static final RegistryObject<Item> DOUBLE_KUNAI = ITEMS.register("double_kunai",
            () -> new SwordItem(Tools.KUSANAGI,6,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> MINATO_CARD_1 = ITEMS.register("minato_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> ITACHI_CARD_1 = ITEMS.register("itachi_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> THIRD_RAIKAGE_CARD_1 = ITEMS.register("third_raikage_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> AMEYURI_CARD_1 = ITEMS.register("ameyuri_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> GAMABUNTA_CARD_1 = ITEMS.register("gamabunta_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KAKASHI_CHIDORI_CARD_1 = ITEMS.register("kakashi_chidori_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KIBA_CARD_1 = ITEMS.register("kiba_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> NARUTO_KCM1_CARD_1 = ITEMS.register("naruto_kcm1_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> CEE_CARD_1 = ITEMS.register("cee_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> NARUTO_RASENGAN_CARD_1 = ITEMS.register("naruto_rasengan_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> NARUTO_TAIJUTSU_CARD_1 = ITEMS.register("naruto_taijutsu_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SASUKE_MS_CARD_1 = ITEMS.register("sasuke_ms_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SHIKAMARU_CARD_1 = ITEMS.register("shikamaru_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TENTEN_CARD_1 = ITEMS.register("tenten_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> THIRD_HOKAGE_CARD_1 = ITEMS.register("third_hokage_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TOBI_CARD_1 = ITEMS.register("tobi_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> YAMATO_CARD_1 = ITEMS.register("yamato_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> S_RANK_SCROLL = ITEMS.register("s_rank_scroll",
            () -> new Item(new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> NARUTO_BOOSTER = ITEMS.register("naruto_booster",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SASUKE_BOOSTER = ITEMS.register("sasuke_booster",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KURENAI_CARD_1 = ITEMS.register("kurenai_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TAYUYA_CURSESEAL_CARD_1 = ITEMS.register("tayuya_curseseal_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TAYUYA_CARD_1 = ITEMS.register("tayuya_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TEMARI_CARD_1 = ITEMS.register("temari_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KIN_CARD_1 = ITEMS.register("kin_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KISAME_CARD_1 = ITEMS.register("kisame_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> MADARA_CARD_1 = ITEMS.register("madara_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> MADARA_CARD_2 = ITEMS.register("madara_card_2",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> MADARA_SHADOW_CARD_1 = ITEMS.register("madara_shadow_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> TAYUYA_FULL_CURSESEAL_CARD_1 = ITEMS.register("tayuya_full_curseseal_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SHINO_CARD_1 = ITEMS.register("shino_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> HINATA_CARD_1 = ITEMS.register("hinata_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> IGGI = ITEMS.register("iggi",
            () -> new Item(new Item.Properties().group(Iggi.IGGI).food(new Food.Builder().effect(new EffectInstance(net.minecraft.potion.Effects.REGENERATION,500),10).effect(new EffectInstance(net.minecraft.potion.Effects.INVISIBILITY,500),1).hunger(100).saturation(600f).setAlwaysEdible().build())));

    public static final RegistryObject<Item> SUIGETSU_CARD_1 = ITEMS.register("suigetsu_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KAKUZU_CARD_1 = ITEMS.register("kakuzu_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> NAGATO_CARD_1 = ITEMS.register("nagato_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> NAGATO_CHILDHOOD_CARD_1 = ITEMS.register("nagato_childhood_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KONAN_CARD_1 = ITEMS.register("konan_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> HIDAN_CARD_1 = ITEMS.register("hidan_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SHIN_CARD_1 = ITEMS.register("shin_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> SASORI_CARD_1 = ITEMS.register("sasori_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> ZETSU_CARD_1 = ITEMS.register("zetsu_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> ASUMA_CARD_1 = ITEMS.register("asuma_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> CHOJI_CARD_1 = ITEMS.register("choji_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> ASUMA_X_KURENAI_CARD_1 = ITEMS.register("asuma_x_kurenai_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> MADARA_CARD_3 = ITEMS.register("madara_card_3",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> OBITO_CHILDHOOD_CARD_1 = ITEMS.register("obito_childhood_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> OBITO_RAGE_CARD_1 = ITEMS.register("obito_rage_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> DEIDARA_CARD_1 = ITEMS.register("deidara_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> RIN_CARD_1 = ITEMS.register("rin_card_1",
            () -> new Item(new Item.Properties().group(NarutoCards.NARUTO_CARDS)));

    public static final RegistryObject<Item> KUNAI = ITEMS.register("kunai",
            () -> new KunaiItem(Tools.KUSANAGI,2,3,
                    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> NUIBARI = ITEMS.register("nuibari",
            () -> new NuibariItem(
    new Item.Properties().group(EffectsItemGroup.EFFECTS_ITEM_GROUP)));

    public static final RegistryObject<Item> IGGIS_HAMMER = ITEMS.register("iggis_hammer",
            () -> new KunaiItem(Tools.KUSANAGI,1000000000,1000000000,
                    new Item.Properties().group(null)));


}


