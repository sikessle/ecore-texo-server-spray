Ecore Texo Server for the spray project
====================================================

Required steps for adding new ecores to the server:

- Install Eclipse Texo Plugin

- Put the ecore file and the corresponding annotationsmodel in „model“, (every type is required to have an unique id, so make the types subtypes of "Identifiable")

- The annotationsmodel must specify the ecore as EPackage and CustomBaseDao.java as root class

- Now use the Texo Plugin to generate JPA Annoated classes + Dao Classes for the new ecore.
    
- persistence.xml: 
    - The mapping-file attributes are not necessary, as we use JPA annotations.   
    - The new generated classes must be declared in the persistence-unit: \<class\>…\</class\>
    
- The EcoreModels must be registered in „TexoWebExampleContextListener“: ServiceModelPackageRegistry.getInstance().register(<b>PetriNet</b>ModelPackage.INSTANCE). Exchange the bold part with the ecore name.

- JSON-REST API: <https://wiki.eclipse.org/Texo/JSON_REST_Web_Services>
