package edu.codeanywhere.j4.ssofacebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
@SpringBootApplication
@EnableOAuth2Sso
public class SsofacebookApplication {

	/**
	 * This method ___
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SsofacebookApplication.class, args);
	}
}
