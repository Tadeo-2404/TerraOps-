package com.terraops.terraops_backend.models;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHttp {
    private HttpStatus status;
    private String message;
    private Object response;
}
