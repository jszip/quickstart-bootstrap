package localhost.quickstart;

import com.sun.jersey.api.core.PackagesResourceConfig;

public class Api extends PackagesResourceConfig {
    public Api() {
        super(Api.class.getPackage().getName());
    }
}
