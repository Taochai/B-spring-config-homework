package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


@ConfigurationProperties(prefix = "mail")
@Setter
@Getter
@ToString
public class MailConfig {

    private String hostname;
    private int port;
    private String from;

    private List<String> defaultRecipients;
    private Map<String, Boolean> additionalHeaders;
    private Credentials credentials;


}
