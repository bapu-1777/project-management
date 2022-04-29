package com.zyapaar.projectmanagement.dto;

public enum StageType {
  TICKET("1"),
  INPROGRESS("2");

  private final String stage;

  StageType(String stage) {
    this.stage = stage;
  }

  public String stage() {
    return stage;
  
}
}