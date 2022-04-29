package com.zyapaar.projectmanagement.service;

import java.util.List;
import com.zyapaar.projectmanagement.dto.TicketDto;

public interface TicketService {

  List<TicketDto> getAllTickets();

  TicketDto getTicketById(String ticketId);

  void createTicket(String ticketId);

  void deleteTicketById(String ticketId);

  void updateTicketById(String ticketId);

  void changeStageOfTicket(String ticketId);

  


  
  
}
