package utils;

import com.github.javafaker.Faker;

public class Constants {

    public static final String FIRST_NAME = "Mihaitza";
    public static final String LAST_NAME = "Din Chitila";
    public static final String EMAIL = generateRandomEmail();
    public static final String PASSWORD = "High69*SmekerdeSmeker";
    public static final String URL = "https://magento.softwaretestingboard.com/";
    public static final String EXPECTED_REGISTER_SUCCESS_MESSAGE = "Thank you for registering with Fake Online Clothing Store.";
    public static String generateRandomEmail() {
        Faker faker = new Faker();
        return "adi@" + faker.name().username() + ".com";
    }
}
