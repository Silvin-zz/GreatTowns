package diplomado.ccm.itesm.greattowns;

/**
 * Created by Laboratorios on 8/8/15.
 */
public class Town {

    private String name;
    private String description;
    private String state;
    private String food;
    private String urlImage;

    public Town(String name, String description, String state, String food, String urlImage) {
        this.name           = name;
        this.description    = description;
        this.state          = state;
        this.food           = food;
        this.urlImage       = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
