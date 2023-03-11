package com.project.questapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "p_like")
public class Like {
    @Id
    Long id;
    Long postId;
    Long userId;
}
