package com.awsgen;

import com.awsgen.build.Context;
import com.awsgen.pipelines.PipelineManager;
import com.awsgen.workflows.Workflow;

public class Main {

    public static void main(String[] args) {
        String workflowType = "Standard"; //todo read stdin for workflow type

        PipelineManager manager = new PipelineManager(workflowType);
        Workflow workflow = manager.make();

        workflow.run(new Context());
    }
}
