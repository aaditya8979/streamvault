package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f19175a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f19176b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f19176b = j0Var;
    }
}
