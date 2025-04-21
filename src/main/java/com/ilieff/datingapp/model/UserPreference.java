package com.ilieff.datingapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_preferences")
public class UserPreference {
    @Id
    private Long userId;
    
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
    
    @Column(name = "min_age")
    private Integer minAge;
    
    @Column(name = "max_age")
    private Integer maxAge;
    
    @Column(name = "max_distance")
    private Integer maxDistance;
    
    @ElementCollection
    @CollectionTable(name = "preferred_genders", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Set<Gender> preferredGenders = new HashSet<>();

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Integer maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Set<Gender> getPreferredGenders() {
        return preferredGenders;
    }

    public void setPreferredGenders(Set<Gender> preferredGenders) {
        this.preferredGenders = preferredGenders;
    }
} 