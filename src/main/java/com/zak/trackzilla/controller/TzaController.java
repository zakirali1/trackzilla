package com.zak.trackzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.zak.trackzilla.service.ApplicationService;

@Controller
public class TzaController {

    private ApplicationService applicationService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

   @GetMapping("/")
   public String home() {
      return "index";
   }

   @GetMapping("/applications")
   public String retrieveApplications(Model model) {
      model.addAttribute("applications", applicationService.listAllApplications());
      return "applications";

   }


}
