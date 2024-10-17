package com.soohyun.portfolio.admin.context.introduction.service

import com.soohyun.portfolio.admin.data.TableDTO
import com.soohyun.portfolio.domain.entity.Introduction
import com.soohyun.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}