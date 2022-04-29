package com.zyapaar.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.zyapaar.projectmanagement.dto.StageType;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "tickes")
@RequestMapping("/api")
public class TicketModel {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String ticketId;
    public String ticketTitle;
    public String ticketDescription;
    public String comment;
    public String createdBy;
    public String createdOn;
    public StageType stage;
    public String workedOn;
    public String workedBy;
    public String testingBy;
    public String testingOn;
    public Boolean testingResult;
    public String mergeBy;
    public String mergeOn;


}
