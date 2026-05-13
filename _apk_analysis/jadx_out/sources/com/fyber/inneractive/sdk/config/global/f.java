package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16036b;

    public f(boolean z10, String str) {
        this.f16035a = str;
        this.f16036b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f16035a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f16036b : this.f16036b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f16035a + " include: " + this.f16036b;
    }
}
