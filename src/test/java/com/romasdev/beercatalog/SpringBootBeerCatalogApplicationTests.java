package com.romasdev.beercatalog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.romasdev.beercatalog.SpringBootBeerCatalogApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootBeerCatalogApplication.class)
@WebAppConfiguration
public class SpringBootBeerCatalogApplicationTests {

	@Test
	public void contextLoads() {
	}

}
