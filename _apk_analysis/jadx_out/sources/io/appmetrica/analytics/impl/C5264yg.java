package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5264yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4737dj f68042c;

    public C5264yg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C4737dj(eCommerceReferrer.getScreen()));
    }

    public C5264yg(String str, String str2, C4737dj c4737dj) {
        this.f68040a = str;
        this.f68041b = str2;
        this.f68042c = c4737dj;
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f68040a + "', identifier='" + this.f68041b + "', screen=" + this.f68042c + '}';
    }
}
