package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f16798d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16799a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16800b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f16801c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f16801c;
            }
            g gVar = (g) this.f16799a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f16799a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f16801c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f16800b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f16800b.put(str, iVar);
        return iVar;
    }
}
