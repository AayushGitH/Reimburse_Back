package proj.api.in.dto;

/**
 * Assign Employee API Request class.
 */
public class AssignEmployeeInDto {
  /**
  * Employee email.
  */
  private String employeeEmail;
  /**
   * Manager email.
   */
  private String managerEmail;
  /**
   * Getter of employee email.
   * @return Employee email.
   */
  public String getEmployeeEmail() {
    return employeeEmail;
  }
  /**
   * Setter of employee email.
   * @param employeeEmailValue Employee email.
   */
  public void setEmployeeEmail(final String employeeEmailValue) {
    this.employeeEmail = employeeEmailValue;
  }
  /**
  * Getter of manager email.
  * @return Manager email.
  */
  public String getManagerEmail() {
    return managerEmail;
  }
  /**
  * Setter of manager email.
  * @param managerEmailValue Manager email.
  */
  public void setManagerEmail(final String managerEmailValue) {
    this.managerEmail = managerEmailValue;
  }
  /**
  * No args constructor.
  */
  public AssignEmployeeInDto() {
  }
}
