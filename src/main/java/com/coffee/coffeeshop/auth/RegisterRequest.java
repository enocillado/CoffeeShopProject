package com.coffee.coffeeshop.auth;

import com.coffee.coffeeshop.user.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String firstname;
  private String middlename;
  private String lastname;
  private String email;
  private String password;
  private String mobileNumber;
  private Address address;

}
