package com.n2015842008.main;

import com.n2015842008.main.domain.Basic;
import com.n2015842008.main.domain.Profile;
import com.n2015842008.main.repository.BasicRepository;
import com.n2015842008.main.repository.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(BasicRepository basicRepository, ProfileRepository profileRepository) {
		return (args) -> IntStream.rangeClosed(1, 3).forEach(index -> {
			basicRepository.save(Basic.builder()
					.name("김사장" + index)
					.label("백수" + index)
					.email("이메일" + index)
					.phone("010-1234-568" + index)
					.build());
			profileRepository.save(Profile.builder()
					.network("페이스북" + index)
					.username("@home" + index)
					.url("localhost:1234/으아아앙ㄱ" + index)
					.createdDate(LocalDateTime.now())
					.build());
		});
	}
}