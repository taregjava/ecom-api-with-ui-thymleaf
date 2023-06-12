package com.halfacode.client.dto;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public record Product(String id, String reference, String name, String description, BigDecimal price,
                      Set<String> categories, Date created) {
}