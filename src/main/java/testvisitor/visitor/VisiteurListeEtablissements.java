package testvisitor.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import testvisitor.Academie;
import testvisitor.Etablissement;

public class VisiteurListeEtablissements extends DefaultVisitor {

	List < String > noms = new ArrayList <>();

	@Override
	public void visit(final Etablissement etablissement) {
		noms.add(etablissement.getNomEtablissement());
	}

	public List < String > getListeEtablissements(final Academie academie) {
		academie.accept(this);
		Collections.sort(noms);
		return noms;
	}

}
