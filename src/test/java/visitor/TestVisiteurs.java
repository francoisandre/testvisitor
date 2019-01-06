package visitor;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import testvisitor.Academie;
import testvisitor.Classe;
import testvisitor.Eleve;
import testvisitor.Etablissement;
import testvisitor.visitor.VisiteurCompteEleve;
import testvisitor.visitor.VisiteurListeEtablissements;

public class TestVisiteurs {

	@Test
	public void testVisiteurListeEtablissement() {
		Academie academie = creactionJeuxDeDonnees();
		VisiteurListeEtablissements visiteur = new VisiteurListeEtablissements();
		List < String > listeEtablissement = visiteur.getListeEtablissements(academie);
		Assert.assertTrue(listeEtablissement.size() == 3);
	}

	@Test
	public void testVisiteurCompteEleves() {
		Academie academie = creactionJeuxDeDonnees();
		VisiteurCompteEleve visiteur = new VisiteurCompteEleve();
		int resultat = visiteur.getNombreEleves(academie);
		System.out.println(resultat);
		Assert.assertTrue(resultat == 149);
	}

	private Academie creactionJeuxDeDonnees() {

		Academie academie = new Academie("Toulouse");
		Etablissement college1 = new Etablissement("College Auterive");
		ajouteClasse(15, college1);
		ajouteClasse(34, college1);
		Etablissement college2 = new Etablissement("College Ramonville");

		ajouteClasse(12, college2);
		ajouteClasse(23, college2);
		ajouteClasse(23, college2);

		Etablissement lycee1 = new Etablissement("Lycee Muret");

		ajouteClasse(17, lycee1);
		ajouteClasse(25, college1);

		academie.add(college1);
		academie.add(college2);
		academie.add(lycee1);

		return academie;
	}

	private void ajouteClasse(final int nombreEleve, final Etablissement etablissement) {
		Classe classe = new Classe("Classe fictive");
		for (int i = 0; i < nombreEleve; i++) {
			classe.addEleve(new Eleve("NomEleve", "PrenomEleve"));
		}
		etablissement.add(classe);
	}
}
