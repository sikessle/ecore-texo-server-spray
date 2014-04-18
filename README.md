ecore-texo-server-spray
=======================

The ecore server based on Eclipse Texo for the teamproject spray
=======
Beispiel Projekt mit PetriNet Ecore und mysql/derby2
====================================================

Das vorliegende Eclipse-Projekt enthält alles notwendige und kann direkt auf dem Tomcat ausgeführt werden.

Dazu waren folgende Schritte notwendig:

- Eclipse Plugin installieren
- In WebContent/WEB-INF/lib folgende JARs kopieren:
    - org.eclipse.emf.texo.datagenerator.jar
    - org.eclipse.emf.texo.json.jar
    - org.eclipse.emf.texo.server.jar   
    - org.eclipse.emf.texo.xml.jar
    - org.eclipse.emf.texo.jar
- ecore Datei in „model“ ablegen (jeder Typ sollte Identifiable sein, eindeutige ID haben)
    -Beim Kopieren der ecore Datei in Eclipse werden automatisch die JPA Annotated Klassen + DAO Klassen generiert.
- persistence.xml: 
    - Die Mapping-File Attribute sind nicht notwendig, da der Code mit den JPA Annotationen versehen ist.   
    - Die generierten Klassen müssen in der persistence-unit deklariert werden: \<class\>…\</class\>
    - Die ddl-generation sollte auf "create-tables“ gestellt werden. Dadurch werden die Tabellen nur einmal erstellt und danach wird persistiert.
    - Zum Testen: Den Pfad der derby2 DB anpassen von /tmp/sprayDB auf beliebigen Pfad, sofern kein Unix benutzt wird.
- Welche persistence-unit benutzt wird, kann in der Klasse „TexoWebExampleContextListener“ definiert werden. Diese Klasse ist als listener in der web.xml konfiguriert. Hier müssen wir uns einklinken und die persistence unit entsprechend auswählen.
- Den entsprechenden JDBC Driver (z.b. mysql) in den WebContent/WEB-INF/lib Ordner legen.
- In „TexoWebExampleContextListener“ muss mittels ServiceModelPackageRegistry.getInstance().register(<b>PetriNet</b>ModelPackage.INSTANCE) die Instanz gesetzt werden, sonst findet er die ECore Typen nicht. Das Fett-gedruckte muss entsprechend ersetzt werden, je nach dem wie das Ecore heißt.
- JSON-REST Schnittstelle: <https://wiki.eclipse.org/Texo/JSON_REST_Web_Services>
