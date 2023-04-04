/**
 * 
 */
package kr.ensmart.keycloak.sampleclient.base;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2023. 3. 28.
 *
 */
@Configuration
public class AppConfig {
    @Bean
    public KeycloakConfigResolver KeycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
