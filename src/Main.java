import customClasses.CustomArrayUtils;
import filter.Filter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Object[] input = {1, 2, 3, 4, 5};

        Filter newFilter = new Filter() {
            @Override
            public Object apply(Object element) {
                if (element instanceof Integer) {
                    return (Integer) element * (Integer) element;
                }
                return element;
            }
        };

        Object[] output = CustomArrayUtils.filter(input, newFilter);

        for (Object element : output) {
            System.out.println(element);
        }
    }

    public static <T> Map<T, Integer> elementCounter(Collection<T> collection) {
        Map<T, Integer> result = new HashMap<>();
        if (collection == null) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        for (T element : collection) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
}

