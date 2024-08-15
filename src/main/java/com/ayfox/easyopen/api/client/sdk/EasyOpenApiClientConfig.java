package com.ayfox.easyopen.api.client.sdk;

import com.ayfox.easyopen.api.client.sdk.client.EasyOpenApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yovvis
 * @date 2024-06-07
 */
@ConfigurationProperties("yovvis.api.client")
@Configuration
@Data
@ComponentScan
public class EasyOpenApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public EasyOpenApiClient easyOpenApiClient() {
        return new EasyOpenApiClient(accessKey, secretKey);
    }

}
