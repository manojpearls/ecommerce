package com.ecommerce.register;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecommerce.login.Login;
import com.ecommerce.login.LoginRepository;

@RunWith(SpringRunner.class)
public class RegisterServiceImplTest {

	@InjectMocks
	RegisterServiceImpl registerService;
	
	@Mock
	LoginRepository loginRepository;
	
	@Before
	public void init_mocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testRegisterUserWithValidData() {
		Login login=new Login();
		login.setUserId("A001");
		
		
		when(loginRepository.register(Mockito.any())).thenReturn(true);
		
		String result=registerService.registerUser(login);
		assertThat(result, is("Registered Succesfully"));
	}
	
	@Test
	public void testRegisterUserWithInValidData() {
		Login login=new Login();
		login.setUserId("A001");
		
		
		when(loginRepository.register(Mockito.any())).thenReturn(false);
		
		String result=registerService.registerUser(login);
		assertThat(result, is("Something went wrong!"));
	}
}
