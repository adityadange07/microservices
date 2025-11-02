package com.example.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "loans")
public class LoansContactInfoDto {

    String message = "";

    Map<String, String> contactDetails = new HashMap<>();

    List<String> onCallSupport = new ArrayList<>();

}
