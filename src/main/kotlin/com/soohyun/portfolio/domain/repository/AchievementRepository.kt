package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement wherer is_active = isActive
    fun findAllByIsActive(isActive: Boolean): List<Achievement>
}