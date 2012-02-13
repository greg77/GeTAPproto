package org.ldv.sio.getap.web;

import org.ldv.sio.getap.app.DemandeConsoTempsAccPers;
import org.ldv.sio.getap.app.User;
import org.ldv.sio.getap.app.service.IFManagerGeTAP;
import org.ldv.sio.getap.utils.UtilSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Web controller for eleve related actions.
 */
@Controller
@RequestMapping("/eleve/*")
public class EleveController {

	@Autowired
	@Qualifier("mockServiceManager")
	private IFManagerGeTAP manager;

	public void setManagerEleve(IFManagerGeTAP serviceManager) {
		this.manager = serviceManager;
	}

	/**
	 * Default action, displays the use case page.
	 * 
	 * 
	 */
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public void index() {

	}

	@RequestMapping(value = "mesdctap", method = RequestMethod.GET)
	public String mesdctap(Model model) {
		User me = UtilSession.getUserInSession();
		model.addAttribute("mesdctaps", manager.getAllDCTAP(me));
		return "eleve/mesdctap";
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String deleteDCTAPById(@PathVariable String id, Model model) {

		if (!manager.deleteDCTAPById(Long.valueOf(id))) {
			return "redirect:/app/eleve/index";
		}

		return "redirect:/app/eleve/mesdctap";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String editDCTAPById(@RequestParam("id") String id,
	    DemandeConsoTempsAccPers dctap, Model model) {

		DemandeConsoTempsAccPers currentDctap = manager.getDCTAPById(Long
		    .valueOf(id));

		// valorise le bean de vue avec le dctap courant
		dctap.setId(currentDctap.getId()); // en provenance d'un champ caché
		dctap.setDateAction(currentDctap.getDateAction());
		dctap.setProf(currentDctap.getProf());

		return "eleve/edit";
	}

	@RequestMapping(value = "doedit", method = RequestMethod.POST)
	public String doeditDCTAPById(DemandeConsoTempsAccPers dctap,
	    BindingResult bindResult, Model model) {
		System.out.println("TEST :" + dctap.getId());
		System.out.println("TEST :" + bindResult);
		System.out.println("TEST :" + model);

		DemandeConsoTempsAccPers databaseDctap = manager.getDCTAPById(Long
		    .valueOf(dctap.getId()));

		// valorise l'objet de la base à partir du bean de vue
		databaseDctap.setDateAction(dctap.getDateAction());
		databaseDctap.setProf(manager.getProfesseurById(dctap.getProf().getId()));

		// DemandeConsoTempsAccPers currentDctaap = manager.getDCTAPById(Long
		// .valueOf(id));
		// dctap.setDateAction(currentDctaap.getDateAction());
		// User eleve = UtilSession.getUserInSession();
		// manager.editDCTAPById(Long.valueOf(id), eleve)) {

		// return "redirect:/app/eleve/mesdctap";
		return "eleve/doedit";
	}
}
