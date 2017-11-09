/**
 */
package PurchaseExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PurchaseExample.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link PurchaseExample.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link PurchaseExample.PurchaseOrder#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see PurchaseExample.PurchaseExamplePackage#getPurchaseOrder()
 * @model
 * @generated
 */
public interface PurchaseOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' attribute.
	 * @see #setBillTo(String)
	 * @see PurchaseExample.PurchaseExamplePackage#getPurchaseOrder_BillTo()
	 * @model
	 * @generated
	 */
	String getBillTo();

	/**
	 * Sets the value of the '{@link PurchaseExample.PurchaseOrder#getBillTo <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' attribute.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(String value);

	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' attribute.
	 * @see #setShipTo(String)
	 * @see PurchaseExample.PurchaseExamplePackage#getPurchaseOrder_ShipTo()
	 * @model
	 * @generated
	 */
	String getShipTo();

	/**
	 * Sets the value of the '{@link PurchaseExample.PurchaseOrder#getShipTo <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' attribute.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link PurchaseExample.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see PurchaseExample.PurchaseExamplePackage#getPurchaseOrder_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

} // PurchaseOrder
