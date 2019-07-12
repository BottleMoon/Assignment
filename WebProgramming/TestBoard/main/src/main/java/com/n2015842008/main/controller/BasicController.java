package com.n2015842008.main.controller;

import com.n2015842008.main.domain.Basic;
import com.n2015842008.main.service.BasicService;
import com.n2015842008.main.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class BasicController {
    private BasicService basicService;
    private ProfileService profileService;
    public BasicController( BasicService basicService, ProfileService profileService){
        this.basicService = basicService;
        this.profileService = profileService;
    }

    @GetMapping("/")
    public  String index(Model model){
        model.addAttribute("basicList",basicService.findBasicList());
        model.addAttribute("profileList",profileService.findProfileList());
        return "index";
    }
    @GetMapping("/basic/{idx}")
    public String read(@PathVariable Long idx, Model model){
        model.addAttribute("basic", basicService.findBasicByIdx(idx));
        return "item";
    }
    @PostMapping("/basic/add")
    public String add(Basic basic,Model model){
        Basic saveBasic = basicService.saveBasic(basic);
        model.addAttribute("basic",basicService.findBasicByIdx(saveBasic.getIdx()));
        return "item";
    }
    @GetMapping("/basic/new")
    public String form(Basic basic){
        return "new";
    }

    @RequestMapping(value = "/basic/{idx}/update", method = RequestMethod.GET)
    public String updater(@PathVariable("idx")Long idx,Model model){
        Basic basic = basicService.getOne(idx);
        model.addAttribute("basic",basic);
        return "new";
    }
    @RequestMapping(value = "/basic/{idx}/update", method = RequestMethod.POST)
    public String update(@Valid Basic basic, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return"item";
        }
        return "redirect:/basic/"+basicService.saveBasic(basic).getIdx();
    }//수정
    @RequestMapping("/basic/{idx}/delete")
    public String view(@PathVariable("idx") Long idx){
        basicService.deletBasicByIdx(idx);
        return "redirect:/";
    } //삭제
}
