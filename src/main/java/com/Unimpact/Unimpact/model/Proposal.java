package com.Unimpact.Unimpact.model;

import javax.persistence.*;

@Entity
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String submittedBy;

    // Getters and setters
}

