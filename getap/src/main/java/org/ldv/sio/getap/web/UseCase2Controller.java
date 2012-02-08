package org.ldv.sio.getap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Web controller for hotel related actions.
 */
@Controller
@RequestMapping("/useCase2/*")
public class UseCase2Controller {

	/**
	 * Default action, displays the search page.
	 * 
	 */
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public void index() {
	}

}
