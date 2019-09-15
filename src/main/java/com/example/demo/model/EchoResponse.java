package com.example.demo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EchoResponse {
    private final String message;
    private final boolean reversed;
}
