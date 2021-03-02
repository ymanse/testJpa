package org.tsc.todoList.config;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.*;
import org.springframework.stereotype.Component;

@Component
public class EncryptionListener
    implements PreInsertEventListener,
    PreUpdateEventListener,
    FlushEventListener,
    AutoFlushEventListener,
    FlushEntityEventListener,
    PreLoadEventListener {
  @Override
  public boolean onPreInsert(PreInsertEvent event) {
    Object[] state = event.getState();
    String[] propertyNames = event.getPersister()
                                  .getPropertyNames();
    Object entity = event.getEntity();

    return false;
  }

  @Override
  public boolean onPreUpdate(PreUpdateEvent event) {
    Object[] state = event.getState();
    String[] propertyNames = event.getPersister()
                                  .getPropertyNames();
    Object entity = event.getEntity();

    return false;
  }

  @Override
  public void onPreLoad(PreLoadEvent event) {
    Object[] state = event.getState();
    String[] propertyNames = event.getPersister().getPropertyNames();
    Object entity = event.getEntity();
  }

  @Override
  public void onFlushEntity(FlushEntityEvent event) throws HibernateException {

  }

  @Override
  public void onFlush(FlushEvent event) throws HibernateException {

  }

  @Override
  public void onAutoFlush(AutoFlushEvent event) throws HibernateException {

  }
}
