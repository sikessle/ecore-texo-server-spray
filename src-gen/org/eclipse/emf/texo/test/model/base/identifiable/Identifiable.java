package org.eclipse.emf.texo.test.model.base.identifiable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>Identifiable</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "identifiable_Identifiable")
@Table(name = "identifiable_Identifiable")
public class Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "db_Id")
	private Long db_Id = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "db_version")
	private Integer db_version = null;

	/**
	 * Returns the value of '<em><b>db_Id</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>db_Id</b></em>' feature
	 * @generated
	 */
	public Long getDb_Id() {
		return db_Id;
	}

	/**
	 * Sets the '{@link Identifiable#getDb_Id() <em>db_Id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDb_Id
	 *            the new value of the '{@link Identifiable#getDb_Id() db_Id}'
	 *            feature.
	 * @generated
	 */
	public void setDb_Id(Long newDb_Id) {
		db_Id = newDb_Id;
	}

	/**
	 * Returns the value of '<em><b>db_version</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>db_version</b></em>' feature
	 * @generated
	 */
	public Integer getDb_version() {
		return db_version;
	}

	/**
	 * Sets the '{@link Identifiable#getDb_version() <em>db_version</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDb_version
	 *            the new value of the '{@link Identifiable#getDb_version()
	 *            db_version}' feature.
	 * @generated
	 */
	public void setDb_version(Integer newDb_version) {
		db_version = newDb_version;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Identifiable " + " [db_Id: " + getDb_Id() + "]"
				+ " [db_version: " + getDb_version() + "]";
	}
}
