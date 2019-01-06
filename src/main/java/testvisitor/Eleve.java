package testvisitor;

import testvisitor.visitor.DefaultVisitor;

public class Eleve {

	private String nom;
	private String prenom;

	public Eleve(final String nom, final String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void accept(final DefaultVisitor visiteur) {
		visiteur.visit(this);
	}

}
