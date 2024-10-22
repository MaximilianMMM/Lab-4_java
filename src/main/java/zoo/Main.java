package zoo;

public class Main {
    public static void main(String[] args) {
        HealthStatus healthyStatus = new HealthStatus.HealthStatusBuilder()
                .setStatus("Healthy")
                .build();

        Section section = new Section.SectionBuilder()
                .setSectionName("Savannah")
                .setLocation("Africa Zone")
                .build();

        Animal lion = new AnimalBuilder() // Використовуйте AnimalBuilder
                .setName("Lion")
                .setGender("Male")
                .setBirthDate("2020-03-15")
                .setArrivalDate("2021-05-20")
                .setHealthStatus(healthyStatus)
                .setSection(section)
                .setFoodName("Meat")
                .build();

        System.out.println(lion);
    }
}
