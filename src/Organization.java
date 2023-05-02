import java.util.Objects;

@Example("All")
public abstract class Organization {
    private final String EIN;
    private String name;
    private String corporateGroup;
    private int stuff;
    private boolean isState;
    private String registrationDate;
    private String location;
    private String country;
    private String connection;
    @Example("true")
    boolean isCurrent;


    public Organization(String EIN, String name, String corporateGroup, int stuff, boolean isState, String registrationDate, String location, String country, String connection, boolean isCurrent) {
        this.EIN = EIN;
        this.name = name;
        this.corporateGroup = corporateGroup;
        this.stuff = stuff;
        this.isState = isState;
        this.registrationDate = registrationDate;
        this.location = location;
        this.country = country;
        this.connection = connection;
        this.isCurrent = isCurrent;
    }

    public String getEIN() {
        return EIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporateGroup() {
        return corporateGroup;
    }

    public void setCorporateGroup(String corporateGroup) {
        this.corporateGroup = corporateGroup;
    }

    public int getStuff() {
        return stuff;
    }

    public void setStuff(int stuff) {
        this.stuff = stuff;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return stuff == that.stuff && isState == that.isState && isCurrent == that.isCurrent && Objects.equals(EIN, that.EIN) && Objects.equals(name, that.name) && Objects.equals(corporateGroup, that.corporateGroup) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(location, that.location) && Objects.equals(country, that.country) && Objects.equals(connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EIN, name, corporateGroup, stuff, isState, registrationDate, location, country, connection, isCurrent);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "EIN='" + EIN + '\'' +
                ", name='" + name + '\'' +
                ", corporateGroup='" + corporateGroup + '\'' +
                ", stuff=" + stuff +
                ", isState=" + isState +
                ", registrationDate='" + registrationDate + '\'' +
                ", location='" + location + '\'' +
                ", country='" + country + '\'' +
                ", connection='" + connection + '\'' +
                ", isCurrent=" + isCurrent +
                '}';
    }
}
