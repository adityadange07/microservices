package com.example.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "accounts")
public class AccountsContactInfoDto {

    String message = "";

    Map<String, String> contactDetails = new HashMap<>();

    List<String> onCallSupport = new ArrayList<>();

}
