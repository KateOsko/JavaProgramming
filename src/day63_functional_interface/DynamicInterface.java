package day63_functional_interface;

@FunctionalInterface
public interface DynamicInterface <T> {

    void test (T t); // t is the generic type and the lower case t - parameter name
}
