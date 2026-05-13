package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f19284b = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f19285a;

    public x1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = f19284b;
        }
        w1 w1Var = new w1(r0.f19216a, b2Var);
        Charset charset = l1.f19181a;
        this.f19285a = w1Var;
    }
}
