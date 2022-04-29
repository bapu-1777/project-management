package com.zyapaar.projectmanagement.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

  // @ExceptionHandler(ResoursourceNotFound.class)
  // public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResoursourceNotFound ex){

  //     String getMassage=ex.getMessage();
  //     ApiResponse apiResponse=new ApiResponse(getMassage,false);
  //     return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);


  // }

  // @ExceptionHandler(MethodArgumentNotValidException.class)
  // public ResponseEntity<Map<String,String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex){
  //     Map<String,String> resp=new HashMap<>();
  //     ex.getBindingResult().getAllErrors().forEach((objectError -> {
  //         String fieldName = ((FieldError)objectError).getField();
  //         String massage= objectError.getDefaultMessage();
  //         resp.put(fieldName,massage);
  //     }));


  //     return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
  // }
  
}
