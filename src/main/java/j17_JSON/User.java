package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize : Json으로 표현할때 해당 값을 표시여부(true : 표시, false : 표시 x)
 * deserialize : Object로 표현할때 해당 값 표시 여부(true : 표시, false : 표시 x)
 */

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false)
	private String password;
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
}
