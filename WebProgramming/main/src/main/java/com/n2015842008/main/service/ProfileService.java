package com.n2015842008.main.service;

import com.n2015842008.main.domain.Profile;
import com.n2015842008.main.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository){this.profileRepository = profileRepository;}
    public Profile findProfileByIdx(Long idx){ return profileRepository.findById(idx).orElse(new Profile());}
    public List<Profile> findProfileList() {return profileRepository.findAll();}
    public Profile saveProfile(Profile profile){return profileRepository.save(profile);}
    public Profile getOne(Long idx){return profileRepository.getOne(idx);}
    public void deletProfileByIdx(Long idx){profileRepository.deleteById(idx);}
}
