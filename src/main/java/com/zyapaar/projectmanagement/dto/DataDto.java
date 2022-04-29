package com.zyapaar.projectmanagement.dto;

import lombok.Data;

@Data
public class DataDto {

  public String ticketTitle;
  public String ticketDescription;
  public String comment;
  public String timestamp;
  public StageType stage;
  
}
