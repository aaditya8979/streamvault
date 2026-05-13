package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f16054a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer a(String str) {
        n nVar = this.f16054a;
        if (nVar == null || nVar.a() == null || this.f16054a.a().size() <= 0) {
            return null;
        }
        return this.f16054a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.f16054a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        n nVar = this.f16054a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String b(String str) {
        n nVar = this.f16054a;
        if (nVar == null || nVar.a() == null || this.f16054a.a().size() <= 0) {
            return null;
        }
        return this.f16054a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean c(String str) {
        n nVar = this.f16054a;
        if (nVar == null || nVar.a() == null || this.f16054a.a().size() <= 0) {
            return null;
        }
        return this.f16054a.c(str);
    }
}
