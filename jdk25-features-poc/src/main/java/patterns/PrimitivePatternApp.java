void main() {
    test(10);
    test(10L);
    test(10.5);
    test("Hello");
}

// =========================================
// PATTERN MATCHING SWITCH
// =========================================
private static void test(Object object) {

    switch (object) {

        case Integer i -> IO.println("Integer: " + i);

        case Long l -> IO.println("Long: " + l);

        case Double d -> IO.println("Double: " + d);

        default -> IO.println("Unknown: " + object);

    }

}
