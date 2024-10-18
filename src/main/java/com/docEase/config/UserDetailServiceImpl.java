package com.docEase.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.docEase.Dao.UserDataRepository;
import com.docEase.entities.User;

public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private UserDataRepository userDataRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userDataRepository.getUserByUserName(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("Username Could not found");
		}
		
		CustomUserDetail customUserDetail=new CustomUserDetail(user);
		return customUserDetail;
	}

}
