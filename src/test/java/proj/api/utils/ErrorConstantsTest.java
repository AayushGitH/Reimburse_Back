package proj.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ErrorConstantsTest {

	@Test
	public void testErrorConstants() {		
		ErrorConstants errorConstants = new ErrorConstants();
		assertEquals("Not valid credentials", errorConstants.NOT_VALID_CREDENTIALS);
		assertEquals("Password is not correct", errorConstants.NOT_VALID_PASSWORD);
		assertEquals("Invalid request", errorConstants.INVALID_REQUEST);
		assertEquals("User does not exist", errorConstants.USER_NOT_FOUND);
		assertEquals("Manager not found", errorConstants.MANAGER_NOT_FOUND);
		assertEquals("Email already exists, try with another email !!", errorConstants.EMAIL_ALREADY_EXISTS);
		assertEquals("Email doesn't exist !!", errorConstants.EMAIL_DOESNT_EXIST);
		assertEquals("Category already exists, give another category !!", errorConstants.CATEGORY_ALREADY_EXISTS);
		assertEquals("Category limit cannot be null !!", errorConstants.CATEGORY_LIMIT_NULL);
		assertEquals("Department already exists, give another department !!", errorConstants.DEPARTMENT_ALREADY_EXISTS);
		assertEquals("Department not found !!", errorConstants.DEPARTMENT_NOT_FOUND);
		assertEquals("List is null !!", errorConstants.LIST_IS_NULL);
		assertEquals("Role is invalid", errorConstants.ROLE_IS_INVALID);
		assertEquals("Expense type is required", errorConstants.EXPENSE_TYPE_REQUIRED);
		assertEquals("Amount is required", errorConstants.AMOUNT_TYPE_REQUIRED);
		assertEquals("Comment is required", errorConstants.COMMENT_TYPE_REQUIRED);
	}
}
