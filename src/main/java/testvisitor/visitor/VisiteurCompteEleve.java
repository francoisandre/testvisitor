package testvisitor.visitor;

import testvisitor.Academie;
import testvisitor.Eleve;

public class VisiteurCompteEleve extends DefaultVisitor {

	int nombreEleves = 0;

	@Override
	public void visit(final Eleve eleve) {
		nombreEleves++;
	}

	public int getNombreEleves(final Academie academie) {
		academie.accept(this);
		return nombreEleves;
	}

}
