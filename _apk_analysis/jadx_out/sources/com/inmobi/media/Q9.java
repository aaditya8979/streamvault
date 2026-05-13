package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class Q9 extends AbstractC3474i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26175f;

    /* JADX WARN: Illegal instructions before constructor call */
    public Q9(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this(string, str, str2, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(String str, String str2, String str3, String str4) {
        super(str3, str4);
        tn.p.k(str, "eventId");
        tn.p.k(str2, "componentType");
        tn.p.k(str3, "eventType");
        this.f26174e = str;
        this.f26175f = str2;
    }

    public final String toString() {
        return this.f27324a + "@" + this.f26175f + com.ironsource.Z7.f30794r;
    }
}
