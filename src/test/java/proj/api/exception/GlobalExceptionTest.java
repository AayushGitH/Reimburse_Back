package proj.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.MethodParameter;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import proj.api.out.dto.ErrorResponse;

@ExtendWith(MockitoExtension.class)
public class GlobalExceptionTest {
	
	@InjectMocks
	private GlobalExceptionHandler globalExceptionHandler;
	
	@Mock
	private MethodArgumentNotValidException methodArgumentNotValidException;
	
	@Mock
	private ResourceNotFoundException resourceNotFoundException;
	
	@Mock
	private BadRequestException badRequestException;
	
	@Mock
	private DataIntegrityViolationException dataIntegrityViolationException;
	
	@Mock
	private AlreadyExistException alreadyExistException;
	
	@Mock
	private UserNotFoundException userNotFoundException;
	
	@Mock
	private InvalidCredentialException invalidCredentialException;
	
	@Mock
	private FieldError fieldError;
	
	@Test
	void testResourceHandler() {
		String errorMessage = "Resource not found";
		when(resourceNotFoundException.getMessage()).thenReturn("Resource not found");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.resourceNotFoundHandler(resourceNotFoundException);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testBadRequest() {
		String errorMessage = "Bad request exception";
		when(badRequestException.getMessage()).thenReturn("Bad request exception");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.badRequestExceptionHandler(badRequestException);
		assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testDataIntegrity() {
		String errorMessage = "Conflict is there";
		when(dataIntegrityViolationException.getMessage()).thenReturn("Conflict is there");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.dateIntegrityExceptionHandler(dataIntegrityViolationException);
		assertEquals(HttpStatus.CONFLICT, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testUserNotFound() {
		String errorMessage = "User not found";
		when(userNotFoundException.getMessage()).thenReturn("User not found");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.userNotFoundExceptionHandler(userNotFoundException);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testAlreadyExist() {
		String errorMessage = "Content already exists";
		when(alreadyExistException.getMessage()).thenReturn("Content already exists");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.alreadyExistsExceptionHandler(alreadyExistException);
		assertEquals(HttpStatus.CONFLICT, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testInvalidCredentials() {
		String errorMessage = "Invalid credentials is given";
		when(invalidCredentialException.getMessage()).thenReturn("Invalid credentials is given");
		ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.invalidCredentialsExceptionHandler(invalidCredentialException);
		assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());
		assertEquals(errorMessage, responseEntity.getBody().getErrorMessage().get(0));
	}
	
	@Test
	void testMethodArgument() {
		BindingResult bindingResult = mock(BindingResult.class);
		FieldError fieldError = new FieldError("ObjectName", "field1", "First message");
		when(bindingResult.getAllErrors()).thenReturn(Collections.singletonList(fieldError));
		MethodArgumentNotValidException exception = new MethodArgumentNotValidException((MethodParameter) null, bindingResult);
		ResponseEntity<ErrorResponse> response = globalExceptionHandler.methodArgumentHandler(exception);
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}
}
