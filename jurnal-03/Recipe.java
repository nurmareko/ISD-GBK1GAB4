public class Recipe {
    private String name;
    private String mainComponent;
    private String cookingTime;

    public Recipe(String name, String mainComponent, String cookingTime) {
        this.name = name;
        this.mainComponent = mainComponent;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + mainComponent + " " + cookingTime;
    }
}
