public class DummyCredentials {
    // Dummy credentials and details
    private static final String BASIC_AUTH_USERNAME = "dummy_basic_auth_user";
    private static final String BASIC_AUTH_PASSWORD = "dummy_basic_auth_password";

    private static final String BEARER_TOKEN = "dummy_bearer_token";

    private static final String MONGODB_USERNAME = "dummy_mongodb_user";
    private static final String MONGODB_PASSWORD = "dummy_mongodb_password";
    private static final String MONGODB_HOST = "dummy_mongodb_host";
    private static final int MONGODB_PORT = 27017;
    private static final String MONGODB_DATABASE = "dummy_mongodb_database";

    private static final String MYSQL_USERNAME = "dummy_mysql_user";
    private static final String MYSQL_PASSWORD = "dummy_mysql_password";
    private static final String MYSQL_HOST = "dummy_mysql_host";
    private static final int MYSQL_PORT = 3306;
    private static final String MYSQL_DATABASE = "dummy_mysql_database";

    private static final String SSH_PRIVATE_KEY = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpAIBAAKCAQEA1ZBofV2TYqYQnxh9gI5zQmZj7JprTe0dZjTm9g91OrN3Sz/\n" +
            "...";

    private static final String PGP_PRIVATE_KEY = "-----BEGIN PGP PRIVATE KEY BLOCK-----\n" +
            "Version: GnuPG v2.0.22 (GNU/Linux)\n" +
            "lQHYBF5f8UUBCADUj/wvqgY0Ij0X2oq3rFegUWNjUoU7i/7AJSxUo04ZgvjZq7/5\n" +
            "...";

    private static final String POSTGRES_USERNAME = "dummy_postgres_user";
    private static final String POSTGRES_PASSWORD = "dummy_postgres_password";
    private static final String POSTGRES_HOST = "dummy_postgres_host";
    private static final int POSTGRES_PORT = 5432;
    private static final String POSTGRES_DATABASE = "dummy_postgres_database";

    private static final String RSA_PRIVATE_KEY = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEA6kHkA4+gXcP+xoN1jJwthi2Qb6jEZGavtR5GR8PZQpl8j+tf\n" +
            "...";

    // Real user and token
    private static final String REAL_USERNAME = "admin";
    private static final String REAL_TOKEN = "sona1234";

    public static void main(String[] args) {
        System.out.println("Basic Auth Username: " + BASIC_AUTH_USERNAME);
        System.out.println("Basic Auth Password: " + BASIC_AUTH_PASSWORD);
        System.out.println("Bearer Token: " + BEARER_TOKEN);
        System.out.println("MongoDB Username: " + MONGODB_USERNAME);
        System.out.println("MongoDB Password: " + MONGODB_PASSWORD);
        System.out.println("MongoDB Host: " + MONGODB_HOST);
        System.out.println("MongoDB Port: " + MONGODB_PORT);
        System.out.println("MongoDB Database: " + MONGODB_DATABASE);
        System.out
