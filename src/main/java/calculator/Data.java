package calculator;


import lombok.Getter;

import java.util.List;

@Getter
public class Data<T> implements Printable {
    private final List<T> data;

    public Data(List<T> list) {
        this.data = List.copyOf(list);
    }

    @Override
    public String print() {
        return data.toString();
    }
}
