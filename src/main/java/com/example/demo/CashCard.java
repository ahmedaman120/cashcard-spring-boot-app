package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.GeneratedValue;

@Table("CASH_CARD")
record CashCard(@Id  @GeneratedValue Long id, Double amount, String owner) {
}
