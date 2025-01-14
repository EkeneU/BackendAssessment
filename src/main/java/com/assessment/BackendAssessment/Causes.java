package com.assessment.BackendAssessment;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Causes {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String causes_description;
    private String img_url;
    @ManyToOne(cascade = {CascadeType.ALL, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "_id")
    @JsonBackReference
    private Contributions contributions;

}
