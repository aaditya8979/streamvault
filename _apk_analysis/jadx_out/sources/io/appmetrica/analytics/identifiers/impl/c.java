package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f64843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f64844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64845c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f64843a = identifierStatus;
        this.f64844b = aVar;
        this.f64845c = str;
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i10) {
        this(identifierStatus, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f64843a == cVar.f64843a && tn.p.f(this.f64844b, cVar.f64844b) && tn.p.f(this.f64845c, cVar.f64845c);
    }

    public final int hashCode() {
        int iHashCode = this.f64843a.hashCode() * 31;
        a aVar = this.f64844b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f64845c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f64843a + ", advIdInfo=" + this.f64844b + ", errorExplanation=" + this.f64845c + ')';
    }
}
