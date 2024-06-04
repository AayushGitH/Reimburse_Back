package proj.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

public class ConstantsTest {
	
	@Test
	public void testConstants() {
		Constants constants = new Constants();
		assertEquals("Accepted", constants.ACCEPTED);
		assertEquals("Pending", constants.PENDING);
		assertEquals("Rejected", constants.REJECTED);
		assertEquals("Employee", constants.EMPLOYEE);
		assertEquals("Manager", constants.MANAGER);
		assertEquals("D:\\Reimbursement Back\\"
				  + "Reimbursement_portal_backend\\src\\main\\resources\\images", constants.UPLOAD_DIR);
		assertEquals("/claim", constants.CLAIM_BASE_URL);
		assertEquals("/department", constants.DEPARTMENT_BASE_URL);
		assertEquals("/category", constants.CATEGORY_BASE_URL);
		assertEquals("/employee", constants.EMPLOYEE_BASE_URL);
		assertEquals("Successfully deleted the category...", constants.DELETED_CATEGORY);
		assertEquals("Successfully saved the claim !!", constants.SAVE_CLAIM_MESSAGE);
		assertEquals("Successfully assigned the employee !!", constants.ASSIGNED_EMPLOYEE_MESSAGE);
	}
}
