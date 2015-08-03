package nl.wur.fbr.om.om18.set;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.om18.vocabulary.OM;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFParseException;
import org.openrdf.sail.memory.MemoryStore;

import java.io.IOException;
import java.io.InputStream;

/**
 * This is an extension of the {@link DefaultUnitAndScaleFactory} that includes
 * the units and measurement scales defined in the OM ontology (v1.8). The Identifiers for these units and scales
 * are defined as URIs.
 * Use these identifiers as parameter to {@link #getUnitOrScale(String)} to access the
 * OM set of units and scales.
 * @author Don Willems on 03/08/15.
 */
public class OMUnitAndScaleFactory extends DefaultUnitAndScaleFactory{

    /**
     * The Sesame SAIL in-memory repository that will contain the OM RDF file.
     * OM can be queried through this repository.
     */
    private Repository repository = null;

    /**
     * Constructs the default {@link OMUnitAndScaleFactory}. This constructor creates a new in-memory repository
     * with the RDF data contained in this release of the om-1.8-set library.
     * @throws UnitOrScaleCreationException When the in-memory repository could not be created.
     */
    public OMUnitAndScaleFactory() throws UnitOrScaleCreationException {
        repository = new SailRepository(new MemoryStore());
        try {
            repository.initialize();
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not initialise the repository containing the OM ontology.",e);
        }
        InputStream in = OMUnitAndScaleFactory.class.getResourceAsStream("/om.owl");
        System.out.println("RDF file: "+in);
        RepositoryConnection connection = null;
        try{
            connection = repository.getConnection();
            ValueFactory factory = connection.getValueFactory();
            URI fileContext = factory.createURI("http://www.wurvoc.org/contexts/om");
            connection.add(in,OM.NAMESPACE, RDFFormat.RDFXML,fileContext);
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not add the OM ontology to the in-memory repository.",e);
        } catch (RDFParseException e) {
            throw new UnitOrScaleCreationException("Could not parse the OM ontology file into the in-memory repository.",e);
        } catch (IOException e) {
            throw new UnitOrScaleCreationException("Could not access the OM ontology file.",e);
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (RepositoryException e) {
                }
            }
        }
    }

    /**
     * Creates a new factory initialised with the specified repository. This repository should contain the
     * OM ontology but may be available from for instance an HTTP server.
     * @param repository The repository containing the OM ontology.
     */
    public OMUnitAndScaleFactory(Repository repository){
        this.repository = repository;
    }

    /**
     * Returns the Unit or Scale identified by the specified identifier (either the full URI or the local name)
     * within the OM ontology. <br>
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance.
     *
     * If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier (URI) of the unit or scale to the specified identifier.
     * If the data for creating a new instance is not available, e.g. is not part of the core set, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale, in OM the string representation of a URI.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    @Override
    public Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException {
        Object uos = null;
        try{
            uos = super.getUnitOrScale(identifier);
        } catch (Exception e){ } // no memory of unit or scale
        if(uos==null){
            ValueFactory vf = repository.getValueFactory();
            URI uri = null;
            if(identifier.startsWith("http://")){
                uri = vf.createURI(identifier);
            }else{
                uri = vf.createURI("http://www.wurvoc.org/vocabularies/om-1.8/",identifier);
            }
            RepositoryConnection connection = null;
            try{
                connection = repository.getConnection();
                uos = createUnitOrScaleFromURI(uri,connection);
            } catch (RepositoryException e) {
                throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                        " could not be accessed.",identifier,e);
            } finally {
                if(connection!=null){
                    try {
                        connection.close();
                    } catch (RepositoryException e) {
                    }
                }
            }
        }
        return uos;
    }

    /**
     * Creates an instance of the unit or scale identified by the specified URI.
     * @param uri The URI in OM of the unit or scale to be created.
     * @param connection The connection to the repository.
     * @return The Unit or Scale.
     * @throws UnitOrScaleCreationException If the unit or scale could not be created.
     */
    private Object createUnitOrScaleFromURI(URI uri,RepositoryConnection connection) throws UnitOrScaleCreationException {
        try {
            URI type = this.getTypeOfResource(uri,connection);
            System.out.println("Type for <"+uri+"> is <"+type+">");
            if(type.equals(OM.SINGULAR_UNIT)){

            }else if(type.equals(OM.UNIT_MULTIPLE_OR_SUBMULTIPLE)){

            }else if(type.equals(OM.UNIT_MULTIPLICATION)){

            }else if(type.equals(OM.UNIT_DIVISION)){

            }else if(type.equals(OM.UNIT_EXPONENTIATION)){

            }else if(type.equals(OM.MEASUREMENT_SCALE)){

            }else if(type.equals(OM.CARDINAL_SCALE)){

            }else if(type.equals(OM.INTERVAL_SCALE)){

            }else if(type.equals(OM.NOMINAL_SCALE)){

            }else if(type.equals(OM.ORDINAL_SCALE)){

            }else if(type.equals(OM.RATIO_SCALE)){

            }else {
                throw new UnitOrScaleCreationException("The type of the requested resource with identifier <"+uri+"> " +
                        "is not one of the expected unit or scale types (type = <"+type+">.");
            }
        } catch (MalformedQueryException e) { // SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",uri.stringValue(),e);
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " could not be accessed.",uri.stringValue(),e);
        } catch (QueryEvaluationException e) {// SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",uri.stringValue(),e);
        } catch (Throwable e){
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+">.",uri.stringValue(),e);
        }
        return null;
    }

    /**
     * Returns the OM type as a URI of the specified resource. The different types can be accessed in {@link OM}.
     * @param resourceURI The URI of the unit or scale whose type needs to be determined.
     * @param connection The connection to the repository.
     * @return The type of unit that should be created.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When type of the resource could not be found.
     */
    private URI getTypeOfResource(URI resourceURI,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT ?type WHERE {\n" +
                "   <"+resourceURI+"> <"+ RDF.TYPE+"> ?type. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            return (URI)result.next().getValue("type");
        }
        throw new UnitOrScaleCreationException("Could not acquire the type of the resource identified by <"+resourceURI+">",resourceURI.stringValue());
    }
}
