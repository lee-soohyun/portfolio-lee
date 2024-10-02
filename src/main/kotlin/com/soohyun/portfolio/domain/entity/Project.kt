package com.soohyun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Project : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Project_id")
    var id: Long? = null
}