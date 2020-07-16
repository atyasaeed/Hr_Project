package com.hr.service;

import java.util.List;

public interface AbstractService<E,e> {
	
	List<E> findAll();
	E findById(Integer id);
	E add(E e);
	E udate(E e);
	void delete (Integer id);
	

}
