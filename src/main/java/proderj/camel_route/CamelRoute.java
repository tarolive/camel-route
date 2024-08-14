import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:foo?period=1000").log("Hello World, Camel Route!");
    }
}
