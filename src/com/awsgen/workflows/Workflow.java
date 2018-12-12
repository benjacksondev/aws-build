package com.awsgen.workflows;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.pipelines.contracts.PipelineContract;

public class Workflow {

    protected PipelineContract pipeline;

    public Workflow(PipelineContract pipeline) {

        this.pipeline = pipeline;
    }

    public void run(ContextContract context) {
        this.pipeline.process(context);
    }
}
