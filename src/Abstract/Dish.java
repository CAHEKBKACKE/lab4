package Abstract;

public abstract class Dish {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public String toString() {
        return this.getTitle();
    }
}