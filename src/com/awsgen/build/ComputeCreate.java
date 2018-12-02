package com.awsgen.build;

public class ComputeCreate implements Stage {

    private int numberOfInstances;

    public ComputeCreate(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    @Override
    public Context run(Context context) {
        System.out.println("ComputeCreate");

        return context;
    }
}
