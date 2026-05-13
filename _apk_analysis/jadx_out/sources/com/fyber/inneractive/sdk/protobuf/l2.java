package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f19183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f19184b;

    static {
        k2 k2Var = null;
        try {
            k2Var = (k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f19183a = k2Var;
        f19184b = new k2();
    }
}
