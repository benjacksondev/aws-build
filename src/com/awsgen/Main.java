package com.awsgen;

import com.awsgen.pipelines.AWSPipeline;
import com.awsgen.build.ComputeCreate;
import com.awsgen.build.LoadBalancerCreate;
import com.awsgen.build.LoadBalancerAttach;
import com.awsgen.build.CloudfrontCreate;
import com.awsgen.build.OutputIP;
import com.awsgen.build.Context;

/**
 *
 * @author benjaminjackson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AWSPipeline pipeline = new AWSPipeline();

        int numberOfInstances = 2;

        pipeline.pipe(new ComputeCreate(numberOfInstances));
        pipeline.pipe(new LoadBalancerCreate());
        pipeline.pipe(new LoadBalancerAttach());
        pipeline.pipe(new CloudfrontCreate());
        pipeline.pipe(new OutputIP());

        Context context = new Context();
        pipeline.process(context);
    }
}
