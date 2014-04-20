package de.konstanz.htwg.spray.petrinet.dao;

import java.util.List;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;

import de.konstanz.htwg.spray.petrinet.InputArc;
import de.konstanz.htwg.spray.petrinet.Net;
import de.konstanz.htwg.spray.petrinet.OutputArc;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Place;
import de.konstanz.htwg.spray.petrinet.Token;

/**
 * The Dao implementation for the model object '<em><b>Place</b></em>'.
 * 
 * @generated
 */
public class PlaceDao extends BaseDao<Place> {

	/**
	 * @generated
	 */
	@Override
	public Class<Place> getEntityClass() {
		return Place.class;
	}

	
	@Override
	public void remove(Place t){
	   System.out.println("Deleting Place: "+t.getDb_Id());
	
	   // list contains the objects that refer to Place t
	   List<Object> list = this.getReferingObjects(t, Integer.MAX_VALUE, true);
	   System.out.println("Threre are "+list.size()+" references on t");
	   System.out.println("The references to this object are:");
	   
	   // t.removeFrom.. does not seem to work
	   for(Object o : list){
		  try{
		   InputArc i = (InputArc)o;
		   t.removeFromInputArc(i);
		   EntityManagerProvider.getInstance().getEntityManager().persist(i);
		   EntityManagerProvider.getInstance().getEntityManager().flush();
		   EntityManagerProvider.getInstance().getEntityManager().refresh(i);
		   
		   System.out.println("\t"+i.toString()+" "+i.getDb_Id());
		  }catch(Exception e){}
		  
		  try{
		   OutputArc i = (OutputArc)o;
		   t.removeFromOutputArc(i);
		   EntityManagerProvider.getInstance().getEntityManager().persist(i);
		   EntityManagerProvider.getInstance().getEntityManager().flush();
		   EntityManagerProvider.getInstance().getEntityManager().refresh(i);

		   System.out.println("\t"+i.toString()+" "+i.getDb_Id());
		  }catch(Exception e){}
		  
		  try{			  
		   Token i = (Token)o;
		   t.removeFromToken(i);
		   EntityManagerProvider.getInstance().getEntityManager().persist(i);
		   EntityManagerProvider.getInstance().getEntityManager().flush();
		   EntityManagerProvider.getInstance().getEntityManager().refresh(i);

		   System.out.println("\t"+i.toString()+" "+i.getDb_Id());
		  }catch(Exception e){} 
		}
	}
	
	@Override
	public void remove(List<Place> t){
		for(Place p : t){
			this.remove(p);
		}
		return;
	}
	
	
	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getPlaceEClass();
	}
}
