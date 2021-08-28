package com.greymatter.bootstrap;

import com.greymatter.domain.Category;
import com.greymatter.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        fruits.setName("dried");

        Category fresh = new Category();
        fruits.setName("fresh");

        Category exotic = new Category();
        fruits.setName("exotic");

        Category nuts = new Category();
        fruits.setName("nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("DATA LOADED: " + categoryRepository.count());
    }
}
