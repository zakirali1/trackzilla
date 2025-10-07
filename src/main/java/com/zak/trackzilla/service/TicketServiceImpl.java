package com.zak.trackzilla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zak.trackzilla.model.Ticket;
import com.zak.trackzilla.respository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable <Ticket> listTickets() {
        return ticketRepository.findAll();
    }


}
