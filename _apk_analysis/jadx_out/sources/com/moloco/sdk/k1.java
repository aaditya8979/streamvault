package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: MetricsRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k1 extends GeneratedMessageLite<k1, a> implements MessageLiteOrBuilder {
    private static final k1 DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile Parser<k1> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int initStatusCase_ = 0;
    private Object initStatus_;
    private long latencyMs_;

    /* JADX INFO: compiled from: MetricsRequest.java */
    public static final class a extends GeneratedMessageLite.Builder<k1, a> implements MessageLiteOrBuilder {
        public a() {
            super(k1.DEFAULT_INSTANCE);
        }

        public a a(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
            copyOnWrite();
            ((k1) this.instance).f(metricsRequest$SDKInitFailureTrackingRequest);
            return this;
        }

        public a b(long j10) {
            copyOnWrite();
            ((k1) this.instance).g(j10);
            return this;
        }

        public a c(i1 i1Var) {
            copyOnWrite();
            ((k1) this.instance).h(i1Var);
            return this;
        }
    }

    static {
        k1 k1Var = new k1();
        DEFAULT_INSTANCE = k1Var;
        GeneratedMessageLite.registerDefaultInstance(k1.class, k1Var);
    }

    public static a e() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (z0.f51009a[methodToInvoke.ordinal()]) {
            case 1:
                return new k1();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဃ\u0000", new Object[]{"initStatus_", "initStatusCase_", "bitField0_", i1.class, MetricsRequest$SDKInitFailureTrackingRequest.class, "latencyMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<k1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (k1.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void f(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        metricsRequest$SDKInitFailureTrackingRequest.getClass();
        this.initStatus_ = metricsRequest$SDKInitFailureTrackingRequest;
        this.initStatusCase_ = 2;
    }

    public final void g(long j10) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j10;
    }

    public final void h(i1 i1Var) {
        i1Var.getClass();
        this.initStatus_ = i1Var;
        this.initStatusCase_ = 1;
    }
}
