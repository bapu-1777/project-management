package com.zyapaar.projectmanagement.service;

import java.util.List;
import com.zyapaar.projectmanagement.dto.DataDto;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManageTicketService  implements TicketService 
{
  private final DataDto dataDto;

  @Override
  public List<Ticket> getAllTickets()
  {
    return new List<Ticket>();
  }



  
}
