package com.n2015842008.main.controller;

import com.n2015842008.main.domain.Profile;
import com.n2015842008.main.repository.ProfileRepository;
import com.n2015842008.main.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
public class ProfileController {
    private ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile/{idx}")
    public String read(@PathVariable Long idx, Model model) {
        model.addAttribute("profile", profileService.findProfileByIdx(idx));
        return "profileItem";
    }

    @PostMapping("/profile/add")
    public String add(Profile profile, Model model) {
        profile.setCreatedDate(LocalDateTime.now());
        Profile saveProfile = profileService.saveProfile(profile);
        model.addAttribute("profile", profileService.findProfileByIdx(saveProfile.getIdx()));
        return "profileItem";
    }

    @GetMapping("/profile/new")
    public String form(Profile profile) {
        return "profileNew";
    }

    @RequestMapping(value = "/profile/{idx}/update", method = RequestMethod.GET)
    public String updater(@PathVariable("idx") Long idx, Model model) {
        Profile profile = profileService.getOne(idx);
        model.addAttribute("profile", profile);
        return "profileNew";
    }

    @RequestMapping(value = "/profile/{idx}/update", method = RequestMethod.POST)
    public String update(@Valid Profile profile, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "profileItem";
        }
        profile.setCreatedDate(LocalDateTime.now());
        return "redirect:/profile/" + profileService.saveProfile(profile).getIdx();
    }//수정

    @RequestMapping("/profile/{idx}/delete")
    public String view(@PathVariable("idx") Long idx) {
        profileService.deletProfileByIdx(idx);
        return "redirect:/";
    }//삭
}
