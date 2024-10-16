package com.soohyun.portfolio.presentation.interceptor

import com.soohyun.portfolio.domain.entity.HttpInterface
import com.soohyun.portfolio.domain.repository.HttpInterfacetRepository
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class PresentationInterceptor(
        private val httpInterfacetRepository: HttpInterfacetRepository
) : HandlerInterceptor {
    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        val httpInterface = HttpInterface(request)
        httpInterfacetRepository.save(httpInterface)
    }
}