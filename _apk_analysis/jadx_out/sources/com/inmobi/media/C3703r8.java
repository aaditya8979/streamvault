package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3703r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28048e;

    public C3703r8(ArrayList arrayList, Map map, String str, String str2, boolean z10) {
        tn.p.k(arrayList, "omidTrackers");
        tn.p.k(map, "macros");
        tn.p.k(str, "customReferenceData");
        this.f28044a = arrayList;
        this.f28045b = map;
        this.f28046c = str;
        this.f28047d = str2;
        this.f28048e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3703r8)) {
            return false;
        }
        C3703r8 c3703r8 = (C3703r8) obj;
        return tn.p.f(this.f28044a, c3703r8.f28044a) && tn.p.f(this.f28045b, c3703r8.f28045b) && tn.p.f(this.f28046c, c3703r8.f28046c) && tn.p.f(this.f28047d, c3703r8.f28047d) && this.f28048e == c3703r8.f28048e;
    }

    public final int hashCode() {
        int iHashCode = (this.f28046c.hashCode() + ((this.f28045b.hashCode() + (this.f28044a.hashCode() * 31)) * 31)) * 31;
        String str = this.f28047d;
        return Boolean.hashCode(this.f28048e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f28044a + ", macros=" + this.f28045b + ", customReferenceData=" + this.f28046c + ", contentUrl=" + this.f28047d + ", isolateVerificationScripts=" + this.f28048e + ")";
    }
}
