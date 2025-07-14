package me.dio.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 16)
    private String number;

    // RENOMEADO DE 'limit' PARA 'cardLimit'
    @Column(name = "card_limit", precision = 10, scale = 2, nullable = false)
    private BigDecimal cardLimit; // Nome do atributo alterado

    public Card() {
    }

    // Construtor atualizado
    public Card(String number, BigDecimal cardLimit) {
        this.number = number;
        this.cardLimit = cardLimit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Getters e Setters atualizados
    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }
}