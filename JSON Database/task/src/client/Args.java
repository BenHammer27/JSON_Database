package client;
import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = "-t", description = "Type of request")
    String type;
    @Parameter(names = "-k", description = "key")
    String key;
    @Parameter(names = "-v", description = "value")
    String value;
}
