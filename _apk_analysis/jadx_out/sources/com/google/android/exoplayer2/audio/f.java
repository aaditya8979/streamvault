package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.primitives.Ints;
import s7.m0;

/* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21321g;

    /* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21322a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21323b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21324c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21325d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21326e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21327f = 2;

        public f g() {
            return new f(this);
        }
    }

    public f(a aVar) {
        this.f21316b = aVar.f21322a;
        this.f21317c = aVar.f21323b;
        this.f21318d = aVar.f21324c;
        this.f21319e = aVar.f21325d;
        this.f21320f = aVar.f21326e;
        this.f21321g = aVar.f21327f;
    }

    public static int b(int i10, int i11, int i12) {
        return Ints.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    public static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.e
    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14)) * d10)) + i13) - 1) / i13) * i13;
    }

    public int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i10) {
        return Ints.d((((long) this.f21320f) * ((long) d(i10))) / 1000000);
    }

    public int f(int i10) {
        int i11 = this.f21319e;
        if (i10 == 5) {
            i11 *= this.f21321g;
        }
        return Ints.d((((long) i11) * ((long) d(i10))) / 1000000);
    }

    public int g(int i10, int i11, int i12) {
        return m0.p(i10 * this.f21318d, b(this.f21316b, i11, i12), b(this.f21317c, i11, i12));
    }
}
