package com.lensdb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Prime")
public class Prime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    @Column(name = "focal_length_mm")
    private Double mm;
    @Column(name = "min_aperture")
    private Double minA;
    @Column(name = "max_aperture")
    private Double maxA;
    @Column(name = "weight_grams")
    private Double grams;
    @Column(name = "macro")
    private Boolean macro;
}
