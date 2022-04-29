package com.zyapaar.projectmanagement.service;

import java.util.List;

public interface TicketService {

  List<Ticket> getAllTickets();

  Ticket getTicketById(String ticketId);

  void createTicket(String ticketId);

  void deleteTicketById(String ticketId);

  void updateTicketById(String ticketId);

  void changeStageOfTicket(String ticketId);

  


  
  
}
