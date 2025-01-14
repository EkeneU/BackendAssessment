package com.assessment.BackendAssessment;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contributions {
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    private String first_name;
    private String email;
    private double amount;

    @OneToMany(mappedBy = "contributions", cascade = {CascadeType.ALL, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JsonManagedReference
    private List<Causes> causesList;
}
