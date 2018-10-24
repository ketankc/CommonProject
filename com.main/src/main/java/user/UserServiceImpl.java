package user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class UserServiceImpl implements UserService {

	public void addUserDetails(TblUser tblUser) {
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<TblUser> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblUser> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblUser> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUser getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TblUser> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(TblUser arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TblUser> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<TblUser> findById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TblUser> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends TblUser> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TblUser> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
