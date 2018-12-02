package com.awsgen.pipelines;

import com.awsgen.build.Context;
import com.awsgen.build.Stage;

public interface Pipeline {

    public void pipe(Stage stage);

    public Context process(Context context);
}
