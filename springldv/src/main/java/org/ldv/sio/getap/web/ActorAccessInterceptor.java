/**
 * Implémentation de la logique d'accès aux contrôleurs de cas d'utilisation
 *  
 * @author kpu
 */
package org.ldv.sio.getap.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ldv.sio.getap.app.User;
import org.ldv.sio.getap.utils.UtilSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ActorAccessInterceptor extends HandlerInterceptorAdapter {
	// private final Log logger = LogFactory.getLog(getClass());
	private final Logger logger = LoggerFactory
	    .getLogger(ActorAccessInterceptor.class);

	public boolean preHandle(HttpServletRequest request,
	    HttpServletResponse response, Object handler) throws Exception {

		String servletName = request.getRequestURI().split("/")[3];

		System.out.println("TEST  INTERCEPTOR 2:" + request.getContextPath()
		    + " servlet: " + servletName);

		logger.info("TEST  INTERCEPTOR with LOGGER !:" + request.getContextPath()
		    + " servlet: " + servletName);

		User userInSession = UtilSession.getUserInSession();

		if (!servletName.equals("login") && null == userInSession) {
			response.sendRedirect(request.getContextPath() + "/app/login/index");
			return false;
		}

		if (servletName.equals("voitures")
		    && !userInSession.getRole().equals("prof")) {
			response.sendRedirect(request.getContextPath() + "/app/hotels/index");
			return false;
		}

		return true;
	}
}
