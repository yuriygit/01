package com.yuriyb.petproject01.dao;

import java.util.List;
import com.yuriyb.petproject01.domain.Role;

public interface RoleDAO{
	public Long saveRole(Role role);
	public List getRoles();
}
