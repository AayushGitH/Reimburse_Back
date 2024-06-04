package proj.api.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User not found exception class.
 */
@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {
  /**
  * The logger object.
  */
  private final Logger logger = LoggerFactory
  .getLogger(GlobalExceptionHandler.class);
  /**
  * Constructor with the message.
  * @param message Message.
  */
  public UserNotFoundException(final String message) {
    super(message);
    logger.error("User not found exception caught !!");
  }
}
