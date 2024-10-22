package zoo;

public class Animal {
    private final String name;
    private final String gender;
    private final String birthDate;
    private final String arrivalDate;
    private final HealthStatus healthStatus;
    private final Section section;
    private final String foodName;

    // Конструктор
    public Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.birthDate = builder.birthDate;
        this.arrivalDate = builder.arrivalDate;
        this.healthStatus = builder.healthStatus;
        this.section = builder.section;
        this.foodName = builder.foodName;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate; // Додайте геттер для дати народження
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public Section getSection() {
        return section;
    }

    public String getFoodName() {
        return foodName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", healthStatus=" + healthStatus +
                ", section=" + section +
                ", food='" + foodName + '\'' +
                '}';
    }
}
