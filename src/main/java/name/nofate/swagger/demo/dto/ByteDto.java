package name.nofate.swagger.demo.dto;


import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonValue;

@ApiModel
public final class ByteDto {

    @JsonProperty("value")
    @ApiModelProperty
    public final Byte value;

    @JsonProperty("timestamp")
    @ApiModelProperty
    public final Long timestamp;

    public ByteDto(Byte value, Long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public Byte getValue() {
        return value;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
