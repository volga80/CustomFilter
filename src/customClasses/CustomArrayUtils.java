package customClasses;

import filter.Filter;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayUtils {
    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> result = new ArrayList<>();
        for (Object o : array) {
            result.add(filter.apply(o));
        }
        return result.toArray(new Object[0]);
    }
}
