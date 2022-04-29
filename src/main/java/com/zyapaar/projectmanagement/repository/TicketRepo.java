package com.zyapaar.projectmanagement.repository;

import com.zyapaar.projectmanagement.dto.StageType;
import com.zyapaar.projectmanagement.model.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepo extends JpaRepository<TicketModel,String>{
  
  List<TicketModel> findByPublished(StageType stageType);
  List<TicketModel> findByTitleContaining(String title);


}
