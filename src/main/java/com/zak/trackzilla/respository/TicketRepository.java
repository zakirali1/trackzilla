package com.zak.trackzilla.respository;

import org.springframework.data.repository.CrudRepository;

import com.zak.trackzilla.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
