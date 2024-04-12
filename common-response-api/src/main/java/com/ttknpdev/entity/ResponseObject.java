package com.ttknpdev.entity;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@Builder
@Data
@AllArgsConstructor
public class ResponseObject<T> {
    public Short status;
    public String info;
    public T data;
}
