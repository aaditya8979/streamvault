package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import s7.m0;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f21265h = new e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f.a<a> f21266i = new f.a() { // from class: f6.d
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.audio.a.d(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d f21272g;

    /* JADX INFO: compiled from: AudioAttributes.java */
    @RequiresApi(29)
    public static final class b {
        @DoNotInline
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    @RequiresApi(32)
    public static final class c {
        @DoNotInline
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    @RequiresApi(21)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f21273a;

        public d(a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(aVar.f21267b).setFlags(aVar.f21268c).setUsage(aVar.f21269d);
            int i10 = m0.f79487a;
            if (i10 >= 29) {
                b.a(usage, aVar.f21270e);
            }
            if (i10 >= 32) {
                c.a(usage, aVar.f21271f);
            }
            this.f21273a = usage.build();
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21274a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21275b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21276c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21277d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21278e = 0;

        public a a() {
            return new a(this.f21274a, this.f21275b, this.f21276c, this.f21277d, this.f21278e);
        }

        public e b(int i10) {
            this.f21277d = i10;
            return this;
        }

        public e c(int i10) {
            this.f21274a = i10;
            return this;
        }

        public e d(int i10) {
            this.f21275b = i10;
            return this;
        }

        public e e(int i10) {
            this.f21278e = i10;
            return this;
        }

        public e f(int i10) {
            this.f21276c = i10;
            return this;
        }
    }

    public a(int i10, int i11, int i12, int i13, int i14) {
        this.f21267b = i10;
        this.f21268c = i11;
        this.f21269d = i12;
        this.f21270e = i13;
        this.f21271f = i14;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ a d(Bundle bundle) {
        e eVar = new e();
        if (bundle.containsKey(c(0))) {
            eVar.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            eVar.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            eVar.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            eVar.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            eVar.e(bundle.getInt(c(4)));
        }
        return eVar.a();
    }

    @RequiresApi(21)
    public d b() {
        if (this.f21272g == null) {
            this.f21272g = new d();
        }
        return this.f21272g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21267b == aVar.f21267b && this.f21268c == aVar.f21268c && this.f21269d == aVar.f21269d && this.f21270e == aVar.f21270e && this.f21271f == aVar.f21271f;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21267b) * 31) + this.f21268c) * 31) + this.f21269d) * 31) + this.f21270e) * 31) + this.f21271f;
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), this.f21267b);
        bundle.putInt(c(1), this.f21268c);
        bundle.putInt(c(2), this.f21269d);
        bundle.putInt(c(3), this.f21270e);
        bundle.putInt(c(4), this.f21271f);
        return bundle;
    }
}
