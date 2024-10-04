package people;

public class Person {

    private String name;
    private String region;
    private Integer year;
    
    public Person(String name, String region, Integer year) {
        this.name = name;
        this.region = region;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    



    
}
