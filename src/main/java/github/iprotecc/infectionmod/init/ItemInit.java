package github.iprotecc.infectionmod.init;

import github.iprotecc.infectionmod.InfectionModTest;
import github.iprotecc.infectionmod.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class ItemInit {

    public static final Item EXAMPLE_ITEM = register("example_item",Item::new, new Item.Settings());
    public static final Item EXAMPLE_FOOD = register("example_food",Item::new, new Item.Settings().food(FoodList.EXAMPLE_FOOD_COMPONENTS).maxCount(16));

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(InfectionModTest.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }
    public static void load(){}
}
