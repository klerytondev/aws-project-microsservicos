package com.myorg;


import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;


public class AwsKsmSdkStack extends Stack {
    public AwsKsmSdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsKsmSdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

    }
}
