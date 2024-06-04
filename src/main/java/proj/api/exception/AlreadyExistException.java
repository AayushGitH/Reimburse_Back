package proj.api.exception;

/**
 * Already exists exception class.
 */
@SuppressWarnings("serial")
public class AlreadyExistException extends RuntimeException {
  /**
  * Constructor with message.
  * @param message Exception message.
  */
  public AlreadyExistException(final String message) {
    super(message);
  }
}
