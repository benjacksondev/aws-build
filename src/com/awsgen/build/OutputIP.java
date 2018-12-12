package com.awsgen.build;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.build.contracts.Stage;

public class OutputIP implements Stage {

    @Override
    public ContextContract run(ContextContract context) {
        System.out.println("OutputIP");

        return context;
    }
}
