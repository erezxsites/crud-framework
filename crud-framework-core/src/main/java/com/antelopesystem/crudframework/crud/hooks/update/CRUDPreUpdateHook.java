package com.antelopesystem.crudframework.crud.hooks.update;

import com.antelopesystem.crudframework.crud.hooks.base.EntityHook;
import com.antelopesystem.crudframework.model.BaseCrudEntity;

import java.io.Serializable;

@FunctionalInterface
public interface CRUDPreUpdateHook<ID extends Serializable, Entity extends BaseCrudEntity<ID>> extends EntityHook<ID, Entity> {

}
