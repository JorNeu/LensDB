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
@Table(name = "Zoom")
public class Zoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    @Column(name = "min_focal_length_mm")
    private Double zoomMin;
    @Column(name = "max_focal_length_mm")
    private Double zoomMax;
    @Column(name = "min_aperture")
    private Double minA;
    @Column(name = "max_aperture_min_mm")
    private Double maxAmin;
    @Column(name = "max_aperture_max_mm")
    private Double maxAmax;
    @Column(name = "weight_grams")
    private Double grams;
    @Column(name = "macro")
    private Boolean macro;
}
