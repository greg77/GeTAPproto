package org.ldv.sio.getap.app.service;

import java.util.List;

import org.ldv.sio.getap.app.DemandeConsoTempsAccPers;
import org.ldv.sio.getap.app.User;

/**
 * Contrat de services pour les cas d'utilisation liés à un élève
 * 
 * @author (kpu) projet GeTAP - SIO SLAM MELUN
 * 
 */
public interface IFManagerGeTAP {

	public List<DemandeConsoTempsAccPers> getAllDCTAP(User eleve);

	public void addDCTAP(DemandeConsoTempsAccPers dctap);

	public void updateDCTAP(DemandeConsoTempsAccPers dctap);

	public void deleteDCTAP(DemandeConsoTempsAccPers dctap);

	public User getProfesseurById(Long id);

	public boolean deleteDCTAPById(Long id);

	public boolean editDCTAPById(Long valueOf, User user);

	public DemandeConsoTempsAccPers getDCTAPById(Long valueOf);
}
