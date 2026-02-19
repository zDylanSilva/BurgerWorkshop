package Burger;

public class Burger {
    private final String breadType;
    private final String meatType;
    private final String cheese;
    private final String extraIngredients;

    private Burger(Builder builder) {
        this.breadType = builder.breadType;
        this.meatType = builder.meatType;
        this.cheese = builder.cheese;
        this.extraIngredients = builder.extraIngredients;
    }

    @Override
    public String toString() {
        return String.format("Order\n Bread: %s\n Meat: %s\n Cheese: %s\n Extras: %s", 
                breadType, meatType, cheese, extraIngredients);
    }

    public static class Builder {
        private final String breadType;
        private final String meatType;
        private String cheese = "None";
        private String extraIngredients = "None";

        public Builder(String breadType, String meatType) {
            this.breadType = breadType;
            this.meatType = meatType;
        }

        public Builder addCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addExtras(String extraIngredients) {
            this.extraIngredients = extraIngredients;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
