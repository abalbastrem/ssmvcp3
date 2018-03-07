package es.smartcoding.ssmvcp3.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SimpleInterceptor2 extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleInterceptor2.class);
	
	/**
	 * Retorna true si la aplicación debe continuar su curso normal
	 * y false cuando el propio interceptor gestiona la respuesta
	 * por sí mismo
	 */
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("en preHandle del Interceptor 2");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
		logger.info("en postHandle del Interceptor 2");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	throws Exception {
		logger.info("en afterCompletion");
		super.afterCompletion(request, response, handler, ex);
	}

}
