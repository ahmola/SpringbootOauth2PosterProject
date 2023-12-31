package dev.practice.poster.dto;

import dev.practice.poster.model.CustomUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginResponseDTO {

    private UserDetails user;
    private String jwt;
}
