package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {

    // select * from introduction wherer is_active = isActive
    fun findAllBYIsActive(isActive: Boolean): List<Link>
}