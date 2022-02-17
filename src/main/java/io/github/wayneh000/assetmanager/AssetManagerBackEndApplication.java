package io.github.wayneh000.assetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AssetManagerBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetManagerBackEndApplication.class, args);
	}

}
