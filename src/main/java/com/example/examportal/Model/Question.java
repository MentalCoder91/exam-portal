package com.example.examportal.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions_table")
@Data
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "q_id")
    private Long qId;

    @Column(name = "q_name")
    private String qName;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<OptionData> options;







}
