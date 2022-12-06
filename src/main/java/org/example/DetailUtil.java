package org.example;

import org.example.model.Detail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DetailUtil {
    public static Map<Integer, Detail> repository = new ConcurrentHashMap<>();
    public static AtomicInteger counter = new AtomicInteger(0);
    public static List<Detail> meals = Arrays.asList(
            new Detail(1, "Транзистор", 50),
            new Detail(2, "Резистор", 50),
            new Detail(3, "Предохранитель", 50)
    );
}
