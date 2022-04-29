package com.zyapaar.projectmanagement.dto;

// import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDto {

  // @NotNull
  // public String ticketId;
  public String ticketTitle;
  public String ticketDescription;
  public String comment;
  // public String createdBy;
  // public String createdOn;
  public StageType stage;
  // public String workedOn;
  // public String workedBy;
  // public String testingBy;
  // public String testingOn;
  public Boolean testingResult;
  // public String mergeBy;
  // public String mergeOn;
}
