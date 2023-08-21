package net.david.rubymod.item;

import net.david.rubymod.RubyMod;
import net.david.rubymod.item.custom.RubyArmorItem;
import net.david.rubymod.item.custom.RubyPickaxeItem;
import net.david.rubymod.item.custom.RubySwordItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MOD_ID);

public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
public static final RegistryObject<Item> RUBYSWORD = ITEMS.register("rubysword",
        () -> new RubySwordItem(new Tier() {
            @Override
            public int getUses() {
                return 500;
            }

            @Override
            public float getSpeed() {
                return 8;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 5;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        },8,8, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> RUBYPICKAXE = ITEMS.register("rubypickaxe",
        () -> new RubyPickaxeItem(new Tier() {
            @Override
            public int getUses() {
                return 700;
            }

            @Override
            public float getSpeed() {
                return 20;
            }

            @Override
            public float getAttackDamageBonus() {
                return 2;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 5;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        },6,7, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

public static final RegistryObject<Item> RUBYAXE = ITEMS.register("rubyaxe",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBYSHOVEL = ITEMS.register("rubyshovel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBYHOE = ITEMS.register("rubyhoe",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RUBYHELMET = ITEMS.register("rubyhelmet",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD , new Item.Properties()));

    public static final RegistryObject<Item> RUBYCHESTPLATE = ITEMS.register("rubychestplate",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST , new Item.Properties()));
    public static final RegistryObject<Item> RUBYBOOTS = ITEMS.register("rubyboots",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET , new Item.Properties()));
    public static final RegistryObject<Item> RUBYLEGGINGS = ITEMS.register("rubyleggings",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS , new Item.Properties()));

public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
}

}
