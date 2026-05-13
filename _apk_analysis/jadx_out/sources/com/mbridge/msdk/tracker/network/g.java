package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C3978d4;

/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40983b;

    public g(String str, String str2) {
        this.f40982a = str;
        this.f40983b = str2;
    }

    public final String a() {
        return this.f40982a;
    }

    public final String b() {
        return this.f40983b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f40982a, gVar.f40982a) && TextUtils.equals(this.f40983b, gVar.f40983b);
    }

    public int hashCode() {
        return (this.f40982a.hashCode() * 31) + this.f40983b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f40982a + ",value=" + this.f40983b + C3978d4.j.f31385e;
    }
}
