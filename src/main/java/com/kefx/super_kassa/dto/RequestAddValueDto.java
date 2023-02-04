package com.kefx.super_kassa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class RequestAddValueDto {
    Integer id;
    Integer add;
}
