package com.example.examportal.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "options_table")
public class OptionData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "opt_id")
    private Long optId;

    @Column(name= "opt_key")
    private char optKey;

    @Column(name= "opt_value")
    private String optValue;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "q_id")
    private Question question;






}
