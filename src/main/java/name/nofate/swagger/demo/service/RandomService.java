package name.nofate.swagger.demo.service;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import name.nofate.swagger.demo.dto.ByteDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/random")
@Produces(MediaType.APPLICATION_JSON)
@Api("RandomService")
public class RandomService {

    private static final Random random = new Random();

    @GET
    @ApiOperation(value = "getRandomByte", response = ByteDto.class)
    public ByteDto getRandomByte() {
        return new ByteDto((byte)random.nextInt(), System.currentTimeMillis());
    }
}
