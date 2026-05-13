package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3336ch extends AbstractC3387eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26934b;

    public C3336ch(String str, int i10) {
        tn.p.k(str, "message");
        this.f26933a = i10;
        this.f26934b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3336ch)) {
            return false;
        }
        C3336ch c3336ch = (C3336ch) obj;
        return this.f26933a == c3336ch.f26933a && tn.p.f(this.f26934b, c3336ch.f26934b);
    }

    public final int hashCode() {
        return this.f26934b.hashCode() + (Integer.hashCode(this.f26933a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f26933a + ", message=" + this.f26934b + ")";
    }
}
