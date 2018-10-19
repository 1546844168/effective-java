package chapterSix;

/**
 * @author 江峰
 * @create 2018-10-18 14:20
 */
enum Operation {
    Plus {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        // 具体方法
        double apply(double x, double y) {
            return x / y;
        }
    };

    // 抽象方法
    abstract double apply(double x, double y);
}

class Main {
    public static void main(String[] args) {
        for (Operation value : Operation.values()) {
            System.out.println(value.apply(1,4));
        }
    }
}
