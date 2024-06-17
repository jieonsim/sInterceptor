package com.spring.sInterceptor.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BoardInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("BoardInterCeptor의 preHandle 통과 중");

		HttpSession session = request.getSession();
		int level = session.getAttribute("sLevel") == null ? 99 : (int) session.getAttribute("sLevel");

		if (level > 3) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/message/loginNo");
			dispatcher.forward(request, response);
			return false;
		} else if (level == 3) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/message/levelNo");
			dispatcher.forward(request, response);
			return false;
		}
		// return super.preHandle(request, response, handler); 이거로 해도되고 아래처럼 적어도됨
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("BoardInterCeptor의 postHandle 통과 중");

		super.postHandle(request, response, handler, modelAndView);
	}
}
