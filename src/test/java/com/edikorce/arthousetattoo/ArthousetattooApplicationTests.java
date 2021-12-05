package com.edikorce.arthousetattoo;

import com.edikorce.arthousetattoo.model.Painting;
import com.edikorce.arthousetattoo.model.Tattoo;
import com.edikorce.arthousetattoo.service.DatabaseService;
import com.edikorce.arthousetattoo.service.PaintingNotFoundExeption;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ArthousetattooApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private DatabaseService service;

	@Test
	public void addNew(){
		String name = "myPaint2";
		String path = "images/piktura2.jpg";

		String weight = "22cm";
		String height = "35cm";

		Painting painting = new Painting(name,path,weight,height);

		Painting p = service.addPainting(painting);

		Assertions.assertThat(p).isNotNull();
		Assertions.assertThat(p.getId()).isGreaterThan(0);
	}

	@Test
	public void delete() throws PaintingNotFoundExeption {

		Optional<Painting> painting = Optional.ofNullable(service.getPaintingById(7));

		Painting painting1 = painting.get();
		service.getPaintingById(painting1.getId());

		service.deleteAllPaintings();
		Assertions.assertThat(painting1.equals(null));

	}

	@Test
	public void addNewTattoo(){
		String name = "birdCage";
		String path = "tattoos/tattoo2.jpeg";

		String madhesia = "Pjesa siperme dores";


		Tattoo tattoo = new Tattoo(name, path, madhesia);

		Tattoo t = service.addTattoo(tattoo);

		Assertions.assertThat(t).isNotNull();
		Assertions.assertThat(t.getId()).isGreaterThan(0);
	}

}
