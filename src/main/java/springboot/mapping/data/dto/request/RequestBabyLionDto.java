package springboot.mapping.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class RequestBabyLionDto {

    private String name;

    private String email;

    private String number;

    private String password;

    private String profile;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNumber() {
        return this.number;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String toString() {
        return "RequestBabyLionDto(name=" + this.getName() + ", email=" + this.getEmail() + ", number=" + this.getNumber() + ", password=" + this.getPassword() + ", profile=" + this.getProfile() + ")";
    }
}