package com.knoldus.utilities;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class DataResponse {
    int page;
    int per_page;
    int total;
    int total_pages;
    List<Data> data;
}
