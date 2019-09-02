package com.coreJavanSpringwithAnnotations;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
	
	@Bean(name = "protein")
    public List<String> proteinDietContent() {
        return Arrays.asList("Eggs", "Bean", "Tofu");
    }
	
	@Bean(name = "carbs")
    public List<String> carbDietContent() {
        return Arrays.asList("Oats", "Apple", "Bread");
    }

}
