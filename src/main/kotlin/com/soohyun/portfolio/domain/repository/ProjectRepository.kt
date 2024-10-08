package com.soohyun.portfolio.domain.repository


import com.soohyun.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository


interface ProjectRepository : JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Project>

}