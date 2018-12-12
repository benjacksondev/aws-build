package com.awsgen.workflows;

import com.awsgen.build.ComputeCreate;
import com.awsgen.build.LoadBalancerCreate;
import com.awsgen.build.LoadBalancerAttach;
import com.awsgen.build.CloudfrontCreate;
import com.awsgen.build.OutputIP;
import com.awsgen.build.Setup;
import com.awsgen.build.Context;
import com.awsgen.pipelines.contracts.PipelineContract;

public class Standard extends Workflow {

    public Standard(PipelineContract pipeline) {
        super(pipeline);

        this.pipeline.pipe(new Setup("testName"));
        this.pipeline.pipe(new ComputeCreate(2));
        this.pipeline.pipe(new LoadBalancerCreate());
        this.pipeline.pipe(new LoadBalancerAttach());
        this.pipeline.pipe(new CloudfrontCreate());
        this.pipeline.pipe(new OutputIP());
    }
}
