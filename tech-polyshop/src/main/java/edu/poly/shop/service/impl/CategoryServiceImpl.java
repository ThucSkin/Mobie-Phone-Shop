package edu.poly.shop.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.poly.shop.domain.Category;
import edu.poly.shop.repository.CategoryRepositoty;
import edu.poly.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	CategoryRepositoty categoryRepositoty;

	public CategoryServiceImpl(CategoryRepositoty categoryRepositoty) {
		this.categoryRepositoty = categoryRepositoty;
	}

	@Override
	public List<Category> findByNameContaining(String name) {
		return categoryRepositoty.findByNameContaining(name);
	}

	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryRepositoty.findByNameContaining(name, pageable);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepositoty.save(entity);
	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		return categoryRepositoty.findOne(example);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepositoty.findAll();
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepositoty.findAll(pageable);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRepositoty.findAll(sort);
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryRepositoty.findAllById(ids);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepositoty.findById(id);
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		return categoryRepositoty.saveAll(entities);
	}

	@Override
	public void flush() {
		categoryRepositoty.flush();
	}

	@Override
	public <S extends Category> S saveAndFlush(S entity) {
		return categoryRepositoty.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return categoryRepositoty.existsById(id);
	}

	@Override
	public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
		return categoryRepositoty.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Category> entities) {
		categoryRepositoty.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return categoryRepositoty.count();
	}

	@Override
	public <S extends Category> boolean exists(Example<S> example) {
		return categoryRepositoty.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		categoryRepositoty.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		categoryRepositoty.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Category entity) {
		categoryRepositoty.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		categoryRepositoty.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		categoryRepositoty.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends Category> entities) {
		categoryRepositoty.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		categoryRepositoty.deleteAll();
	}

	@Override
	public Category getById(Long id) {
		return categoryRepositoty.getById(id);
	}
	
    
}
