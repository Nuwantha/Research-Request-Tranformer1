package research;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import research.resources.Tem;

public class Research_Request_TransferApplication extends Application<Research_Request_TransferConfiguration> {

    public static void main(final String[] args) throws Exception {
        new Research_Request_TransferApplication().run(args);
    }

    @Override
    public String getName() {
        return "Research_Request_Transfer";
    }

    @Override
    public void initialize(final Bootstrap<Research_Request_TransferConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Research_Request_TransferConfiguration configuration,
                    final Environment environment) {

       final Tem tem = new Tem();
        environment.jersey().register(tem);

        // TODO: implement application
    }

}
