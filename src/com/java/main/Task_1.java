package com.java.main;

import com.java.main.my_exception.MyException;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Comparator;


public class Task_1 {

    public static void filter(Collection<BigDecimal> numbers) {


        BigDecimal maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        BigDecimal minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        try {
            throw new MyException("Error 0!", minNumber);
        } catch (MyException e) {
            e.printStackTrace();
        }

        Collection<BigDecimal> afterFiltration = null;


        for (BigDecimal bigDecimal : numbers) {

            int result = (maxNumber.divide(minNumber)).compareTo(bigDecimal);

            if (result == 1) {
                afterFiltration.add(bigDecimal);
            }

        }

    }
}
