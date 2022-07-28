package edu.poly.shop.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminLoginDto {
	@NotEmpty	
    private String username;
	@NotEmpty
	private String password;
	
	private Boolean rememberMe = false;
}
