package in.jsp.excepton;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {

	private String code;
	private String msg;
	private LocalDateTime when;
}
