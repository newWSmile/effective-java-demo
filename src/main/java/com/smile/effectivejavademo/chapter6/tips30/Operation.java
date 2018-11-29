package com.smile.effectivejavademo.chapter6.tips30;

import java.util.HashMap;
import java.util.Map;

public enum Operation {

    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };


    private static final Map<String, Operation> stringToOption = new HashMap<>(Operation.values().length);

    static {
        for (Operation value : values()) {
            stringToOption.put(value.getSymbol(), value);
        }
    }

    public static Operation fromString(String symbol) {
        return stringToOption.get(symbol);
    }

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);
}
