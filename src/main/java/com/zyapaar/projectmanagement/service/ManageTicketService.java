package com.zyapaar.projectmanagement.service;

import java.util.List;
import com.zyapaar.projectmanagement.dto.TicketDto;
import com.zyapaar.projectmanagement.repository.TicketRepo;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManageTicketService  implements TicketService{

TicketRepo ticketRepo;


@Override
  public List<TicketDto> getAllTickets() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TicketDto getTicketById(String ticketId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void createTicket(String ticketId) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteTicketById(String ticketId) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void updateTicketById(String ticketId) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void changeStageOfTicket(String ticketId) {
    // TODO Auto-generated method stub
    
  }

  
}
