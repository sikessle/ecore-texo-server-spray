Ecore Texo Server for the spray project
====================================================

Required steps for adding new ecores to the server:

- Install Eclipse Texo Plugin
- Put ecore file in „model“, (every type is required to have an unique id, so make 
    the types subtypes of "Identifiable")
    - Now generate with the Texo Plugin the JPA Annoated classes.
- persistence.xml: 
    - The mapping-file attributes are not necessary, as we use JPA annotations.   
    - The new generated classes must be declared in the persistence-unit: \<class\>…\</class\>
    - On startup a file at location "eclipselink.application-location" with the sql-scheme is generated.
    - Each foreign key constraint must be appended with "ON DELETE CASCADE".
    - Create the database tables with the generated sql script.
- In „TexoWebExampleContextListener“ must the ecore models registered: ServiceModelPackageRegistry.getInstance().register(<b>PetriNet</b>ModelPackage.INSTANCE). Exchange the bold part with the ecore name.
- JSON-REST API: <https://wiki.eclipse.org/Texo/JSON_REST_Web_Services>
