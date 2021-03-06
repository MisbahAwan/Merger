/**
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl.mergerDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import persons.tasks3.merger.mdsl.mergerDsl.Action;
import persons.tasks3.merger.mdsl.mergerDsl.MergerDslPackage;
import persons.tasks3.merger.mdsl.mergerDsl.Person;
import persons.tasks3.merger.mdsl.mergerDsl.Task;
import persons.tasks3.merger.mdsl.mergerDsl.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks3.merger.mdsl.mergerDsl.impl.TaskImpl#getAction <em>Action</em>}</li>
 *   <li>{@link persons.tasks3.merger.mdsl.mergerDsl.impl.TaskImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link persons.tasks3.merger.mdsl.mergerDsl.impl.TaskImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link persons.tasks3.merger.mdsl.mergerDsl.impl.TaskImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link persons.tasks3.merger.mdsl.mergerDsl.impl.TaskImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected static final int PRIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected int prio = PRIO_EDEFAULT;

  /**
   * The default value of the '{@link #getDl() <em>Dl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDl()
   * @generated
   * @ordered
   */
  protected static final int DL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDl() <em>Dl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDl()
   * @generated
   * @ordered
   */
  protected int dl = DL_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.MINUTE;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit unit = UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MergerDslPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergerDslPackage.TASK__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergerDslPackage.TASK__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergerDslPackage.TASK__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MergerDslPackage.TASK__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectResolvingEList<Person>(Person.class, this, MergerDslPackage.TASK__PERSONS);
    }
    return persons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPrio()
  {
    return prio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrio(int newPrio)
  {
    int oldPrio = prio;
    prio = newPrio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MergerDslPackage.TASK__PRIO, oldPrio, prio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDl()
  {
    return dl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDl(int newDl)
  {
    int oldDl = dl;
    dl = newDl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MergerDslPackage.TASK__DL, oldDl, dl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(TimeUnit newUnit)
  {
    TimeUnit oldUnit = unit;
    unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MergerDslPackage.TASK__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MergerDslPackage.TASK__ACTION:
        return basicSetAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MergerDslPackage.TASK__ACTION:
        return getAction();
      case MergerDslPackage.TASK__PERSONS:
        return getPersons();
      case MergerDslPackage.TASK__PRIO:
        return getPrio();
      case MergerDslPackage.TASK__DL:
        return getDl();
      case MergerDslPackage.TASK__UNIT:
        return getUnit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MergerDslPackage.TASK__ACTION:
        setAction((Action)newValue);
        return;
      case MergerDslPackage.TASK__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case MergerDslPackage.TASK__PRIO:
        setPrio((Integer)newValue);
        return;
      case MergerDslPackage.TASK__DL:
        setDl((Integer)newValue);
        return;
      case MergerDslPackage.TASK__UNIT:
        setUnit((TimeUnit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MergerDslPackage.TASK__ACTION:
        setAction((Action)null);
        return;
      case MergerDslPackage.TASK__PERSONS:
        getPersons().clear();
        return;
      case MergerDslPackage.TASK__PRIO:
        setPrio(PRIO_EDEFAULT);
        return;
      case MergerDslPackage.TASK__DL:
        setDl(DL_EDEFAULT);
        return;
      case MergerDslPackage.TASK__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MergerDslPackage.TASK__ACTION:
        return action != null;
      case MergerDslPackage.TASK__PERSONS:
        return persons != null && !persons.isEmpty();
      case MergerDslPackage.TASK__PRIO:
        return prio != PRIO_EDEFAULT;
      case MergerDslPackage.TASK__DL:
        return dl != DL_EDEFAULT;
      case MergerDslPackage.TASK__UNIT:
        return unit != UNIT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (prio: ");
    result.append(prio);
    result.append(", dl: ");
    result.append(dl);
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
