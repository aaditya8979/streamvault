package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class U7 {
    @NotNull
    public final String a() {
        String str = Gc.f29438f;
        tn.p.j(str, "OMID_LIB_VERSION");
        return str;
    }

    @NotNull
    public final String b() {
        return Gc.f29437e;
    }

    @NotNull
    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        tn.p.j(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
