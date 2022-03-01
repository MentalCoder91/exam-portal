package com.example.examportal.Repository;

import com.example.examportal.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository  extends JpaRepository<Question,Long> {
}
