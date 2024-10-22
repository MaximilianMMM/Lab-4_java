package zoo;

public class HealthStatus {
    private final String status;

    // Публічний конструктор, який приймає HealthStatusBuilder
    public HealthStatus(HealthStatusBuilder builder) {
        this.status = builder.status;
    }

    public static class HealthStatusBuilder {
        private String status;

        public HealthStatusBuilder setStatus(String status) {
            if (status == null || status.isEmpty()) {
                throw new IllegalArgumentException("Invalid status: Cannot be null or empty.");
            }
            this.status = status;
            return this;
        }

        public HealthStatus build() {
            return new HealthStatus(this);
        }
    }
}
