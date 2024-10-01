package tidz.com.danson.post;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerTest {

	@Autowired
	MockMvc mockMvc;

	List<Post> posts = new ArrayList<>();

	@BeforeEach
	void setUp() {
		posts = List.of(new Post(1, 1, "Hello World", "The first post", null),
				new Post(2, 1, "The thing", "The second Post", null));
	}

	@Test
	void shouldFindAllPosts() throws Exception {
		mockMvc.perform(get("/api/posts")).andExpect(status().isOk());
	}

}
