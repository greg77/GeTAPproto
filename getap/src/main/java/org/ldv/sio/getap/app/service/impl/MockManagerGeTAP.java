package org.ldv.sio.getap.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ldv.sio.getap.app.DemandeConsoTempsAccPers;
import org.ldv.sio.getap.app.User;
import org.ldv.sio.getap.app.service.IFManagerGeTAP;
import org.springframework.stereotype.Service;

@Service("mockServiceManager")
public class MockManagerGeTAP implements IFManagerGeTAP {

	private List<DemandeConsoTempsAccPers> listeDCTAP;
	private List<User> listeProfs;

	public MockManagerGeTAP() {
		listeProfs = new ArrayList<User>();
		listeProfs.add(new User(2L, "Jean David", "Ichbiah", "ada",
		    "prof-intervenant"));
		listeProfs.add(new User(3L, "Guido ", "van Rossum", "python",
		    "prof-intervenant"));
		listeProfs.add(new User(4L, "Gérard", "Berry", "Esterel",
		    "prof-intervenant"));
		listeProfs.add(new User(5L, "Ada", "Lovelace", "", "prof-principal"));
		listeProfs.add(new User(10L, "Yukihiro", "Matsumoto", "ruby",
		    "prof-intervenant"));

		listeDCTAP = new ArrayList<DemandeConsoTempsAccPers>();
		listeDCTAP.add(new DemandeConsoTempsAccPers(100L, 2011, java.sql.Date
		    .valueOf("2011-01-21"), 60, getProfesseurById(2L), 1, 2, 0));
		listeDCTAP.add(new DemandeConsoTempsAccPers(101L, 2011, java.sql.Date
		    .valueOf("2011-01-22"), 60, getProfesseurById(2L), 1, 2, 0));
		listeDCTAP.add(new DemandeConsoTempsAccPers(102L, 2011, java.sql.Date
		    .valueOf("2011-01-23"), 120, getProfesseurById(5L), 1, 2, 0));
		listeDCTAP.add(new DemandeConsoTempsAccPers(102L, 2011, java.sql.Date
		    .valueOf("2011-01-24"), 120, getProfesseurById(10L), 1, 2, 0));
	}

	public List<DemandeConsoTempsAccPers> getAllDCTAP(User eleve) {
		// get anneeScolaire dans la session
		// puis SELECT ... WHERE anneeScolaire=... AND id=user.getId()
		return listeDCTAP;
	}

	public void addDCTAP(DemandeConsoTempsAccPers dctap) {
		listeDCTAP.add(dctap);
	}

	public void updateDCTAP(DemandeConsoTempsAccPers dctap) {
		// nothing car en mémoire seulement
	}

	public void deleteDCTAP(DemandeConsoTempsAccPers dctap) {
		listeDCTAP.remove(dctap);
	}

	public User getProfesseurById(Long id) {
		for (User prof : listeProfs) {
			if (id.equals(prof.getId()))
				return prof;
		}
		return null;
	}

	public boolean deleteDCTAPById(Long id) {
		for (DemandeConsoTempsAccPers dctap : listeDCTAP) {
			if (id.equals(dctap.getId())) {
				listeDCTAP.remove(dctap);
				return true;
			}
		}
		return false;

	}

	public boolean editDCTAPById(Long valueOf, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public DemandeConsoTempsAccPers getDCTAPById(Long id) {
		for (DemandeConsoTempsAccPers dctap : listeDCTAP) {
			if (id.equals(dctap.getId()))
				return dctap;
		}
		return null;
	}

}
