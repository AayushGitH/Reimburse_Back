package proj.api.in.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssignEmployeeInDtoTest {
	@Test
	  @DisplayName("AssignEmployeeInDto getter and setter test")
	  public void getterAndSetter() {
		AssignEmployeeInDto assignEmployeeInDto = new AssignEmployeeInDto();
		assignEmployeeInDto.setEmployeeEmail("employee@nucleusTeq.com");
		assignEmployeeInDto.setManagerEmail("manager@nucleusTeq.com");
	  	
	  	String expectedEmployeeEmail = "employee@nucleusTeq.com";
	  	String expectedManagerEmail = "manager@nucleusTeq.com";
	  	assertNotNull(assignEmployeeInDto.getEmployeeEmail());
	  	assertNotNull(assignEmployeeInDto.getManagerEmail());
	  	assertEquals(expectedEmployeeEmail, assignEmployeeInDto.getEmployeeEmail());
	  	assertEquals(expectedManagerEmail, assignEmployeeInDto.getManagerEmail());
	  }
}
