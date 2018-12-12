package com.awsgen.build;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.build.contracts.Stage;

public class Setup implements Stage {

    private String name;

    public Setup(String name) {

        this.name = name;
    }

    @Override
    public ContextContract run(ContextContract context) {
        System.out.println("Setup");

        return null;
    }
}
