package com.soohyun.portfolio.domain.repository

import com.soohyun.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfacetRepository : JpaRepository<HttpInterface, Long>