package com.example.demoC14.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Customer not found")

public class CustomerNotFoundException extends Exception{
}
