package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Credentials {
    private String username;
    private String password;
    private String authMethod;
}
