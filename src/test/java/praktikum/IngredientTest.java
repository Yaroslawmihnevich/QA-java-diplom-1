package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {

    private final Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "ingredient1", 100.0f);

    @Test
    public void getPrice() {
        assertEquals(100.0f, ingredient.getPrice(), 0.0000001);
    }

    @Test
    public void getName() {
        assertEquals("ingredient1", ingredient.getName());
    }

    @Test
    public void getType() {
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}