import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] input = {1, 2, 3, 4, 5};

        Filter newFilter = new Filter() {
            @Override
            public Object apply(Object o) {
                if (o instanceof Integer) {
                    return (Integer) o * (Integer) o;
                }
                return o;
            }
        };

        Object[] output = CustomArrayUtils.filter(input, newFilter);

        for (Object o : output) {
            System.out.println(o);
        }
    }
}
class CustomArrayUtils {

    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> result = new ArrayList<>();
        for (Object o : array) {
            result.add(filter.apply(o));
        }
        return result.toArray(new Object[0]);
    }
}

interface Filter{
    Object apply(Object o);
}
