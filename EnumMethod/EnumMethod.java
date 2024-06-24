package EnumMethod;

enum Operation {
    ADD {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int apply(int x, int y) {
            if (y == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return x / y;
        }
    };

    // 추상 메서드 선언
    public abstract int apply(int x, int y);

    // 일반 메서드
    public static Operation fromString(String name) {
        for (Operation operation : Operation.values()) {
            if (operation.name().equalsIgnoreCase(name)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Unknown operation: " + name);
    }
}

public class EnumMethod {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;

        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + op.apply(x, y));
        }

        // Using the fromString method
        Operation operation = Operation.fromString("ADD");
        System.out.println("ADD operation: " + operation.apply(x, y));
    }
}

