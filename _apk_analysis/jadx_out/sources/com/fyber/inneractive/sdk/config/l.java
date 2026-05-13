package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16078a = new HashMap();

    public final boolean a() {
        try {
            if (this.f16078a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f16078a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
