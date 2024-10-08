package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.constant.SkillType
import com.soohyun.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SkillRepository : JpaRepository<Skill, Long> {

    fun findAllBYIsActive(isActive: Boolean): List<Skill>

    // select * from skill wherer lower(name) = lower(name) and skill_type = :type
    fun findByNameIgnoreCaseAndType(name: String, type: SkillType): Optional<Skill>
}