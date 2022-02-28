package com.b6r4.webservices.rest.ticket.service;

import com.b6r4.webservices.rest.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
}
