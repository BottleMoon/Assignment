package com.n2015842008.main.domain;


import com.n2015842008.main.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileTest {
    @Autowired
    private ProfileRepository profileRepository;

    private Profile savedProfile;

    @Before
    public void init() {
        savedProfile = profileRepository.save(Profile.builder()
                .network("페이스북")
                .username("@home" )
                .url("localhost:1234/으아아앙ㄱ")
                .createdDate(LocalDateTime.now())
                .build());

        savedProfile = profileRepository.save(Profile.builder()
                .network("페이스북1")
                .username("@home1" )
                .url("localhost:1234/으아아앙ㄱ1")
                .createdDate(LocalDateTime.now())
                .build());

        savedProfile = profileRepository.save(Profile.builder()
                .network("페이스북2")
                .username("@home2" )
                .url("localhost:1234/으아아앙ㄱ2")
                .createdDate(LocalDateTime.now())
                .build());


    }

    @Test
    public void testFindIDProfile() {
        Profile foundProfile = profileRepository.findById(savedProfile.getIdx()).orElse(null);
        assertThat(foundProfile.getIdx()).isEqualTo(savedProfile.getIdx());
    }

    @Test
    public void testFindAllProfile() {
        List<Profile> findAllProfile = profileRepository.findAllByUsername("제목3");
        assertThat(findAllProfile.size()).isEqualTo(2);
    }

    @Test
    public void testFindUsernameProfile() {
        Profile findUsernameProfile = profileRepository.findFirstByUsername("제목1");
        assertThat(findUsernameProfile.getUsername()).isEqualTo("제목1");
    }

    @Test
    public void testUpdateUsernameProfile() {
        Profile updateUsernameProfile = profileRepository.findFirstByUsername("제목1");
        updateUsernameProfile.setUsername("제목1-수정");
        updateUsernameProfile = profileRepository.save(updateUsernameProfile);

        assertThat(updateUsernameProfile.getUsername()).isEqualTo("제목1-수정");
    }

    @Test
    public void testDeleteUsernameProfile() {
        Profile deleteUsernameProfile = profileRepository.findFirstByUsername("제목1");
        profileRepository.delete(deleteUsernameProfile);

        Profile findUsernameProfile = profileRepository.findFirstByUsername("제목1");

        assertThat(findUsernameProfile).isNull();
    }

    @Test
    public void testAccountFK() {
        Profile findUsernameProfile = profileRepository.findFirstByUsername("제목1");
        assertThat(findUsernameProfile.getUsername()).isEqualTo("홍길동");
    }
}