package models;

public class Genre {
    String name;
    String description;

//    This creates a constructor
    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

//  This is used to print private property in class it is called getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    this creates a setter which we can set new values in class property
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
