package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    // select * from introduction wherer is_active = isActive
    fun findAllBYIsActive(isActive: Boolean): List<Introduction>
}