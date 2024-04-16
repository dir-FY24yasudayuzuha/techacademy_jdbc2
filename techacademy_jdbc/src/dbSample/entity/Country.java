package dbSample.entity;

public class Country {
    private String name;
    private int population;
    
    // hikisuu nasi constructor
    public Country() {
    }
    
    // hikisuu ari constructor
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    
    // getter / setter
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }

}
