package com.example.demo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AddingResponse {
    private final int result;
}
