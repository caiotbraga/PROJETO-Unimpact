package com.Unimpact.Unimpact.model;

// import javax.persistence.*;
// import javax.annotation.*;
import jakarta.persistence.*;

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

