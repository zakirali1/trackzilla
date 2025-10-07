package com.zak.trackzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.zak.trackzilla.service.ApplicationService;
import com.zak.trackzilla.service.ReleaseService;
import com.zak.trackzilla.service.TicketService;

@Controller
public class TzaController {

    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
      this.ticketService = ticketService;
      
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
      this.releaseService = releaseService;
      
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

   @GetMapping("/tickets")
   public String retrieveTickets(Model model) {
      model.addAttribute("tickets", ticketService.listTickets());
      return "tickets";
   }

   @GetMapping("/releases")
   public String retrieveReleases(Model model) {
      model.addAttribute("releases", releaseService.listReleases());
      return "release";
   }


}
