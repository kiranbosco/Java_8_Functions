package functionalInterfaces.Optional;

import java.util.Optional;

public class OptionalEmptyNullPointerExample {

    // Thsi Optional class can suport the N number of class and methods
    public static Optional<String> ofNullableExe() {

        Optional<String> stringOptional = Optional.ofNullable(" I am the First I am the last ");
        return stringOptional;
    }
    public static void main(String[] args) {

        System.out.println(ofNullableExe().isPresent());
        System.out.println(ofNullableExe().get());
    }
}
