package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f26257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3440gi f26258k;

    public Rf(String str, String str2, Map map, boolean z10, String str3, boolean z11, int i10, String str4, long j10, Long l10, C3440gi c3440gi) {
        tn.p.k(str, "url");
        tn.p.k(str2, "id");
        tn.p.k(map, "headers");
        tn.p.k(str3, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        tn.p.k(str4, "ownerId");
        this.f26248a = str;
        this.f26249b = str2;
        this.f26250c = map;
        this.f26251d = z10;
        this.f26252e = str3;
        this.f26253f = z11;
        this.f26254g = i10;
        this.f26255h = str4;
        this.f26256i = j10;
        this.f26257j = l10;
        this.f26258k = c3440gi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        Rf rf2 = (Rf) obj;
        return tn.p.f(this.f26248a, rf2.f26248a) && tn.p.f(this.f26249b, rf2.f26249b) && tn.p.f(this.f26250c, rf2.f26250c) && this.f26251d == rf2.f26251d && tn.p.f(this.f26252e, rf2.f26252e) && this.f26253f == rf2.f26253f && this.f26254g == rf2.f26254g && tn.p.f(this.f26255h, rf2.f26255h) && this.f26256i == rf2.f26256i && tn.p.f(this.f26257j, rf2.f26257j) && tn.p.f(this.f26258k, rf2.f26258k);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f26256i) + ((this.f26255h.hashCode() + AbstractC3414fi.a(this.f26254g, (Boolean.hashCode(this.f26253f) + ((this.f26252e.hashCode() + ((Boolean.hashCode(this.f26251d) + ((this.f26250c.hashCode() + ((this.f26249b.hashCode() + (this.f26248a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l10 = this.f26257j;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        C3440gi c3440gi = this.f26258k;
        return iHashCode2 + (c3440gi != null ? c3440gi.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f26248a + ", id=" + this.f26249b + ", headers=" + this.f26250c + ", allowRedirects=" + this.f26251d + ", priority=" + this.f26252e + ", ackRequired=" + this.f26253f + ", retryCount=" + this.f26254g + ", ownerId=" + this.f26255h + ", createdAt=" + this.f26256i + ", retryAfterTimestamp=" + this.f26257j + ", telemetryData=" + this.f26258k + ")";
    }
}
