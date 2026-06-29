package ffm;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class ForeignFunctionMemoryApp {

    // =========================================
    // FOREIGN FUNCTION & MEMORY API
    // =========================================
    static void main(String[] args) {

        try (Arena arena = Arena.ofConfined()) {

            MemorySegment segment = arena.allocate(100);

            segment.set(ValueLayout.JAVA_INT, 0, 42);

            int value = segment.get(ValueLayout.JAVA_INT, 0);

            System.out.println("Value in native memory: " + value);
        }
    }

}
