package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>