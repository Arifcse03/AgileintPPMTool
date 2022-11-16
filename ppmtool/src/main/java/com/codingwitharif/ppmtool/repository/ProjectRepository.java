package com.codingwitharif.ppmtool.repository;

import com.codingwitharif.ppmtool.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends JpaRepository<Project,Long> {

}
