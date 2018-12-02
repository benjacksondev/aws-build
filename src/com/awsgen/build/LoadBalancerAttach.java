package com.awsgen.build;

public class LoadBalancerAttach implements Stage {

    @Override
    public Context run(Context context) {
        System.out.println("LoadBalancerAttach");

        return context;
    }
}
