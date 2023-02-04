package com.kefx.super_kassa.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ExceptionDto {

    private final String message;
    private final int code;
}
