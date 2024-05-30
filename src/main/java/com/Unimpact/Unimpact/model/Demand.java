package com.Unimpact.Unimpact.model;

import javax.persistence.*;

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
