package com.smile.effectivejavademo.chapter6.tips30;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-29 10:23
 **/
public enum PayrollDay {

    MONDAY(PayType.WEEKDAY),

    TUESDAY(PayType.WEEKDAY),

    WEDNESDAY(PayType.WEEKDAY),

    THURSDAY(PayType.WEEKDAY),

    FRIDAY(PayType.WEEKDAY),

    SATURDAY(PayType.WEEKEND),

    SUNDAY(PayType.WEEKEND);


    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    }

    private enum PayType {

        WEEKDAY {
            @Override
            double overTimePay(double hrs, double payRate) {
                return hrs <= HOURS_PER_SHIFT ? 0 : (hrs - HOURS_PER_SHIFT) * payRate / 2;
            }
        },

        WEEKEND {
            @Override
            double overTimePay(double hrs, double payRate) {
                return hrs * payRate / 2;
            }
        };


        private static final int HOURS_PER_SHIFT = 8;


        abstract double overTimePay(double hrs, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay + overTimePay(hoursWorked, payRate);

        }
    }
}
