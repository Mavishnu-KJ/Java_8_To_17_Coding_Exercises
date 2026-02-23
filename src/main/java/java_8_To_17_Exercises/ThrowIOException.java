package java_8_To_17_Exercises;

import java.io.IOException;

@FunctionalInterface
public interface ThrowIOException<T> {
    public void throwIOException(T t) throws IOException;
}
