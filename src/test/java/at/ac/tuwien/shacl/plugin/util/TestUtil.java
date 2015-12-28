package at.ac.tuwien.shacl.plugin.util;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * Provides convenience methods for test execution.
 */
public class TestUtil {
    public static Model getViolationModel() {
        Model model = ModelFactory.createDefaultModel();
        model.read("violations/constraint_violation.ttl");

        return model;
    }

    public static Model getShapesAndDataModel() {
        Model model = ModelFactory.createDefaultModel();
        model.read("topbraid/shaclsquare.ttl");

        return model;
    }
}
