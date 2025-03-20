package annotations.cache;

public interface Summarable<T> {
     T sum();
     void mutate();
     T add(T arg);
}
