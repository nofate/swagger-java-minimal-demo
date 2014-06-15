package name.nofate.swagger.demo.dto;


import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonValue;

public final class ByteDto {

    @JsonProperty("value")
    public final Byte value;

    @JsonProperty("timestamp")
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
