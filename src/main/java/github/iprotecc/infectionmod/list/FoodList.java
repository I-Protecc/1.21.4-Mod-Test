package github.iprotecc.infectionmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;

public class FoodList {
    public static final FoodComponent EXAMPLE_FOOD_COMPONENTS = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();

}
