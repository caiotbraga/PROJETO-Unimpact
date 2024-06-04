package com.Unimpact.Unimpact.model;

import jakarta.persistence.*;;

@Entity
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String demandTitle;
    private String demandDescription;
    private String submittedBy;

    // Getters and setters
}
// caio trabahlar nesta branch
