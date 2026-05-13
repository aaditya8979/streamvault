package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3376e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27093b;

    public C3376e6(String str, ArrayList arrayList) {
        tn.p.k(arrayList, "eventIDs");
        tn.p.k(str, "payload");
        this.f27092a = arrayList;
        this.f27093b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3376e6)) {
            return false;
        }
        C3376e6 c3376e6 = (C3376e6) obj;
        return tn.p.f(this.f27092a, c3376e6.f27092a) && tn.p.f(this.f27093b, c3376e6.f27093b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f27093b.hashCode() + (this.f27092a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f27092a + ", payload=" + this.f27093b + ", shouldFlushOnFailure=false)";
    }
}
