package htw.berlin.wi.prog2.data;

import htw.berlin.wi.prog2.domain.Ingredient;
import htw.berlin.wi.prog2.domain.IngredientBuilder;

import java.util.*;

// Eine statische Datenbank-Klasse
public class Menu {
    private Menu() {}
    private static IngredientBuilder builder = new IngredientBuilder();

    public static Map<Long, Ingredient> buns = Map.of(
            1L, builder.setName("Vollkorn").setPrice("0.60").setCals(120).build(Ingredient.Category.BUN),
            2L, builder.setName("Ciabatta").setPrice("0.70").setCals(100).build(Ingredient.Category.BUN));
    public static Map<Long, Ingredient> meat = Map.of(
            3L, builder.setName("Salami").setPrice("0.90").setCals(90).build(Ingredient.Category.MEAT),
            4L, builder.setName("Schinken").setPrice("0.90").setCals(80).build(Ingredient.Category.MEAT));
    public static Map<Long, Ingredient> salads = Map.of(
            5L, builder.setName("Eisbergsalat").setPrice("0.40").setCals(20).build(Ingredient.Category.SALAD),
            6L, builder.setName("Rucolasalat").setPrice("0.60").setCals(20).build(Ingredient.Category.SALAD));
    public static Map<Long, Ingredient> veggies = Map.of(
            7L, builder.setName("Tomate").setPrice("0.60").setCals(40).build(Ingredient.Category.VEGGIE),
            8L, builder.setName("Gurke").setPrice("0.30").setCals(20).build(Ingredient.Category.VEGGIE));
    public static Map<Long, Ingredient> sauces = Map.of(
            9L, builder.setName("Mayo").setPrice("0.30").setCals(20).build(Ingredient.Category.SAUCE));

    public static Map<Long, Ingredient> getAllArticles() {
        Map<Long, Ingredient> articles = new HashMap<>();
        articles.putAll(buns);
        articles.putAll(meat);
        articles.putAll(salads);
        articles.putAll(veggies);
        articles.putAll(sauces);
        return articles;
    }

}
