// =========================================
// DEFINE SCOPED VALUE (contexto imutável)
// =========================================
static final ScopedValue<String> USER_CTX = ScopedValue.newInstance();

void main() {

    // =========================================
    // SCOPED VALUES
    // =========================================
    ScopedValue.where(USER_CTX, "Guilherme")
            .run(() -> {
                // =========================================
                // CREATE TASKS
                // =========================================
                try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

                    executor.submit(() -> serviceLayer());
                    executor.submit(() -> repositoryLayer());

                    executor.shutdown();
                }
            });
}

static void serviceLayer() {
    IO.println("Service running for user: " + USER_CTX.get());
}

static void repositoryLayer() {
    IO.println("Repository running for user: " + USER_CTX.get());
}