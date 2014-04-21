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
	// clears references of Place t before removing the object.
	// To solve the db foreign key constraint problem.
	//
	// Note: to remove a reference from a Object A to a Object B
	// we must NOT call B.removeFrom..(A), but A.removeFrom...(B)!
	//
	// generation of this code is not difficult, we must somehow find out 
	// which refs can exist -- use reflection for that?
	public void remove(Place t){
	   System.out.println("Deleting Place: "+t.getDb_Id());
	
	   // list contains the objects that refer to Place t
	   List<Object> referingObjects = this.getReferingObjects(t, Integer.MAX_VALUE, true);
	   System.out.println("Threre are "+referingObjects.size()+" references on t");
	   System.out.println("The references to this object are:");
	   
	   for(Object o : referingObjects){
		  try{
		   InputArc i = (InputArc)o;
		   System.out.println(i.removeFromPlace(t));
		   System.out.println("\t"+i.toString()+" "+i.getDb_Id());
		  }catch(Exception e){}
		  try{
		   OutputArc i = (OutputArc)o;
		   System.out.println(i.removeFromPlace(t));
		   System.out.println("\t"+i.toString()+" "+i.getDb_Id());
		  }catch(Exception e){}
		}
	   
	   // we cleared the refs, can delete the object itself now
	   super.remove(t);
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
