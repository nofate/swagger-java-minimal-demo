package name.nofate.swagger.demo.service;

import name.nofate.swagger.demo.dto.ByteDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/random")
@Produces(MediaType.APPLICATION_JSON)
public class RandomService {

    private static final Random random = new Random();

    @GET
    public ByteDto getRandomByte() {
        return new ByteDto((byte)random.nextInt(), System.currentTimeMillis());
    }
}
