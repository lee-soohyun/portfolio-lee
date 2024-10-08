package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ExperienceRepository : JpaRepository<Experience, Long> {
    fun findAllByIsActive(isActive: Boolean): List<Experience>

}