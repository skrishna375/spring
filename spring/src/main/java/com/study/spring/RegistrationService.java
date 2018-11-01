package com.study.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {
	@Autowired
	private UsrRepository usrRepository;
	
	public void regUser(User usr) throws Exception{
		
		/*UsrEntity ue = usrRepository.findOne(usr.getUsrId());
		if(ue != null){
			throw new UserExists("")
		}*/
		
		UsrEntity usrEntity = new UsrEntity();
		usrEntity.setCity(usr.getCity());
		usrEntity.setEmail(usr.getEmail());
		usrEntity.setName(usr.getName());
		usrEntity.setPassword(usr.getPassword());
		usrEntity.setPhone(usr.getPhone());
		usrEntity.setUserid(usr.getUsrId());
		
		usrRepository.saveAndFlush(usrEntity);
		
		
	}
	

}
