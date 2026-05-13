package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5280z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ja f68057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f68058b = "";

    public C5280z7(Ja ja2) {
        this.f68057a = ja2;
    }

    public final void a(String str, boolean z10) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || tn.p.f(this.f68058b, str)) {
                return;
            }
            this.f68058b = str;
            this.f68057a.a(str, z10);
        }
    }
}
