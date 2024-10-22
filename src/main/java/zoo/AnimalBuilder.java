package zoo;

public class AnimalBuilder {
    protected String name;
    protected String gender;
    protected String birthDate;
    protected String arrivalDate;
    protected HealthStatus healthStatus;
    protected Section section;
    protected String foodName;

    public AnimalBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name: Cannot be null or empty.");
        }
        this.name = name;
        return this;
    }

    public AnimalBuilder setGender(String gender) {
        if (gender == null || gender.isEmpty()) {
            throw new IllegalArgumentException("Invalid gender: Cannot be null or empty.");
        }
        this.gender = gender;
        return this;
    }

    public AnimalBuilder setBirthDate(String birthDate) {
        // Ваші правила валідації дати
        this.birthDate = birthDate;
        return this;
    }

    public AnimalBuilder setArrivalDate(String arrivalDate) {
        // Ваші правила валідації дати
        this.arrivalDate = arrivalDate;
        return this;
    }

    public AnimalBuilder setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    public AnimalBuilder setSection(Section section) {
        this.section = section;
        return this;
    }

    public AnimalBuilder setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public Animal build() {
        return new Animal(this);
    }
}
