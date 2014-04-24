Ecore Texo Server for the spray project
====================================================

Required steps for adding new ecores to the server:

- Install the [Eclipse Texo Plugin](https://wiki.eclipse.org/Texo)

- Put the **ecores** and the **corresponding annotationsmodels** in the model folder. Every **ecore type is required to have a unique-id**, this can simply be achieved by making the ecore-types subtypes of "Identifiable". Further the ecore must have one all-enclosing type (see Net in PetriNet.ecore for an example). **The annotationsmodel is** very simple but **needed for making Texo use our custom Dao-Root-Class**, which is neccessary for automatically clearing the references to objects before deleting them. The Annoations model is a simple xml-file of the following form:
>```
<?xml version="1.0" encoding="UTF-8"?>
<annotationsmodel:AnnotatedModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:annotationsmodel="http://www.eclipse.org/emf/texo/annotations/model" xmlns:modelannotations="http://www.eclipse.org/emf/texo/modelgen*erator/modelannotations">
  <annotatedEPackages>
    <ePackage href="PetriNet.ecore#/"/>
    <ePackageAnnotations xsi:type="modelannotations:EPackageModelGenAnnotation" daoRootClass="org.eclipse.emf.texo.web.example.CustomBaseDao"/>
  </annotatedEPackages>
</annotationsmodel:AnnotatedModel>
```
Note: exchange **PetriNet.ecore** with the appropriate ecore name
- Now use the Texo Plugin to generate `JPA Annoated Model Code + Dao` for each new ecore.
    
- Add the generated classes to **persistence.xml** in the same way as the petrinet classes.
    
- The EcoreModels must also be registered in **TexoWebExampleContextListener** with **.register(PetriNetModelPackage.INSTANCE)**. Exchange PetriNet with the appropriate name.

- Make sure you have a Mysql-server running, username and so forth can be configured in **persistence.xml**

- **Finally run the project on a Tomcat!**

- The [JSON-REST API](https://wiki.eclipse.org/Texo/JSON_REST_Web_Services)  for querying, deleting and updating is very simple and straightforward.
- In addition to that you can get a list of available ecores on the server by doing a get on "/ecorelist""

