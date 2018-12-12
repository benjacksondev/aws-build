package com.awsgen.pipelines.contracts;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.build.contracts.Stage;

public interface PipelineContract {

    public void pipe(Stage stage);

    public ContextContract process(ContextContract context);
}
