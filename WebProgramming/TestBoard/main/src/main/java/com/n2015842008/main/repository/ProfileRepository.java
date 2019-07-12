package com.n2015842008.main.repository;

import com.n2015842008.main.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    List<Profile> findAllByUsername(final String username);
    Profile findFirstByUsername(final String username);
}
