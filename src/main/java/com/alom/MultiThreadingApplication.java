package com.alom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alom.number_seq.NumberGenRunner;

@SpringBootApplication
public class MultiThreadingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		NumberGenRunner.test();
	}

}
