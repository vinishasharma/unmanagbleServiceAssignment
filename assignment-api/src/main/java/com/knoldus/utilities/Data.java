package com.knoldus.utilities;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Data {

    int id;
    String name;
    int year;
    String color;
    String pantone_value;
}
