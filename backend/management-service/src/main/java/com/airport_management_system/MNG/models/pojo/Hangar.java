package com.airport_management_system.MNG.models.pojo;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hangar_details", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "location"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hangar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hangarId;

    @NotBlank(message = "Hangar name is required")
    @Column(nullable = false, length = 30)
    private String hangarName;

    @Min(value = 2, message = "Minimum capacity must be at least 2")
    @Max(value = 5, message = "Maximum capacity cannot exceed 5")
    @Column(nullable = false)
    private int capacity;

    @NotBlank(message = "Hangar location is required")
    @Column(nullable = false, length = 30)
    private String hangarLocation;

    @NotNull(message = "User Id is required")
    private Long userId;

    // When user_details is integrated
    /*
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
 
}