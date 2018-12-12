package com.awsgen.build;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.build.contracts.Stage;

public class ComputeCreate implements Stage {

    private int numberOfInstances;

    public ComputeCreate(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    @Override
    public ContextContract run(ContextContract context) {
        System.out.println("ComputeCreate");

        return context;
    }
}
