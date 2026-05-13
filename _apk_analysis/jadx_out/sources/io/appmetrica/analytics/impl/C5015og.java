package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5015og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC4990ng f67463d;

    public C5015og(String str, long j10, long j11, EnumC4990ng enumC4990ng) {
        this.f67460a = str;
        this.f67461b = j10;
        this.f67462c = j11;
        this.f67463d = enumC4990ng;
    }

    public C5015og(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C5040pg c5040pgA = C5040pg.a(bArr);
        this.f67460a = c5040pgA.f67529a;
        this.f67461b = c5040pgA.f67531c;
        this.f67462c = c5040pgA.f67530b;
        this.f67463d = a(c5040pgA.f67532d);
    }

    public static EnumC4990ng a(int i10) {
        return i10 != 1 ? i10 != 2 ? EnumC4990ng.f67364b : EnumC4990ng.f67366d : EnumC4990ng.f67365c;
    }

    public final byte[] a() {
        C5040pg c5040pg = new C5040pg();
        c5040pg.f67529a = this.f67460a;
        c5040pg.f67531c = this.f67461b;
        c5040pg.f67530b = this.f67462c;
        int iOrdinal = this.f67463d.ordinal();
        int i10 = 2;
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal != 2) {
            i10 = 0;
        }
        c5040pg.f67532d = i10;
        return MessageNano.toByteArray(c5040pg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5015og.class != obj.getClass()) {
            return false;
        }
        C5015og c5015og = (C5015og) obj;
        return this.f67461b == c5015og.f67461b && this.f67462c == c5015og.f67462c && this.f67460a.equals(c5015og.f67460a) && this.f67463d == c5015og.f67463d;
    }

    public final int hashCode() {
        int iHashCode = this.f67460a.hashCode() * 31;
        long j10 = this.f67461b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f67462c;
        return this.f67463d.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f67460a + "', referrerClickTimestampSeconds=" + this.f67461b + ", installBeginTimestampSeconds=" + this.f67462c + ", source=" + this.f67463d + '}';
    }
}
