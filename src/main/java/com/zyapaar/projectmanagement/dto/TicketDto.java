package com.zyapaar.projectmanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

  // @NotNull
  // public String ticketId;
  @NotNull(message = "Ticket Title shouldn't be empty")
  @Size(min = 5, max = 50, message = "Description should be less than 500 characters.")
  public String ticketTitle;
  @NotNull
  @Size(max = 250, message = "Maximum 250 characters allowed.")
  public String ticketDescription;
  public String comment;
  // public String createdBy;
  // public String createdOn;
  @NotNull
  public StageType stage;
  // public String workedOn;
  // public String workedBy;
  // public String testingBy;
  // public String testingOn;
  public Boolean testingResult;
  // public String mergeBy;
  // public String mergeOn;
}
