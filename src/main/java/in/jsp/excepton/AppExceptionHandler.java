package in.jsp.excepton;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e) {
		String erMsg = e.getMessage();

		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(erMsg);
		info.setWhen(LocalDateTime.now());

		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNotFoundException(Exception e) {
		String erMsg = e.getMessage();

		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0001");
		info.setMsg(erMsg);
		info.setWhen(LocalDateTime.now());

		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}
}
