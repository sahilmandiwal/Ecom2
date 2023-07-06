package com.ecom.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResourceNotFoundExp extends RuntimeException {

    private String message;
    private String resource;
    private String fieldValue;

    public ResourceNotFoundExp(String message,String resource, String fieldValue) {
        super(String.format("%s with %s : %s ",message,resource,fieldValue));
        this.message=message;
        this.resource=resource;
        this.fieldValue = fieldValue;
    }
}
