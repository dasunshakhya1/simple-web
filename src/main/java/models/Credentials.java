package models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Credentials {
    private String username;
    private String password;


    public static Credentials getValidCredentials() {
        return Credentials.builder().username("standard_user").password("secret_sauce").build();
    }

    public static Credentials getCredentialsOnyUsername() {
        return Credentials.builder().username("standard_user").password("").build();
    }

    public static Credentials getCredentialsOnyPassword() {
        return Credentials.builder().password("standard_user").username("").build();
    }
    public static Credentials getNotExisingCredentials() {
        return Credentials.builder().username("testuser").password("testuser").build();
    }
}
