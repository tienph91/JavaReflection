package ReflectionUtils;

public class Street {

    private String streetName;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Street(String streetName) {
        super();
        this.streetName = streetName;
    }

    public Street() {
        super();
    }

}
