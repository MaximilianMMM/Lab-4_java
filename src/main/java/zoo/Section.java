package zoo;

public class Section {
    private final String sectionName;
    private final String location;

    // Публічний конструктор, який приймає SectionBuilder
    public Section(SectionBuilder builder) {
        this.sectionName = builder.sectionName;
        this.location = builder.location;
    }

    public static class SectionBuilder {
        private String sectionName;
        private String location;

        public SectionBuilder setSectionName(String sectionName) {
            if (sectionName == null || sectionName.isEmpty()) {
                throw new IllegalArgumentException("Invalid section name: Cannot be null or empty.");
            }
            this.sectionName = sectionName;
            return this;
        }

        public SectionBuilder setLocation(String location) {
            if (location == null || location.isEmpty()) {
                throw new IllegalArgumentException("Invalid location: Cannot be null or empty.");
            }
            this.location = location;
            return this;
        }

        public Section build() {
            return new Section(this);
        }
    }
}
