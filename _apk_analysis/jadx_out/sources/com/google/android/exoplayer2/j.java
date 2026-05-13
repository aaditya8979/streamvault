package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.source.i;
import d6.b1;
import d6.w1;
import d6.x1;
import s7.m0;

/* JADX INFO: compiled from: ExoPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends v {

    /* JADX INFO: compiled from: ExoPlayer.java */
    public interface a {
        default void f(boolean z10) {
        }

        default void l(boolean z10) {
        }
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    public static final class b {
        public boolean A;
        public boolean B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s7.d f21607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f21608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y7.p<w1> f21609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public y7.p<i.a> f21610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public y7.p<q7.a0> f21611f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public y7.p<b1> f21612g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public y7.p<r7.d> f21613h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public y7.e<s7.d, e6.a> f21614i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Looper f21615j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public s7.c0 f21616k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.google.android.exoplayer2.audio.a f21617l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f21618m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f21619n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f21620o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f21621p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f21622q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f21623r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f21624s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public x1 f21625t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f21626u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f21627v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public o f21628w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f21629x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f21630y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f21631z;

        public b(final Context context) {
            this(context, new y7.p() { // from class: d6.h
                @Override // y7.p
                public final Object get() {
                    return j.b.f(context);
                }
            }, new y7.p() { // from class: d6.i
                @Override // y7.p
                public final Object get() {
                    return j.b.g(context);
                }
            });
        }

        public b(final Context context, y7.p<w1> pVar, y7.p<i.a> pVar2) {
            this(context, pVar, pVar2, new y7.p() { // from class: d6.j
                @Override // y7.p
                public final Object get() {
                    return j.b.h(context);
                }
            }, new y7.p() { // from class: d6.k
                @Override // y7.p
                public final Object get() {
                    return new d();
                }
            }, new y7.p() { // from class: d6.l
                @Override // y7.p
                public final Object get() {
                    return r7.n.k(context);
                }
            }, new y7.e() { // from class: d6.m
                @Override // y7.e
                public final Object apply(Object obj) {
                    return new e6.n1((s7.d) obj);
                }
            });
        }

        public b(Context context, y7.p<w1> pVar, y7.p<i.a> pVar2, y7.p<q7.a0> pVar3, y7.p<b1> pVar4, y7.p<r7.d> pVar5, y7.e<s7.d, e6.a> eVar) {
            this.f21606a = (Context) s7.a.e(context);
            this.f21609d = pVar;
            this.f21610e = pVar2;
            this.f21611f = pVar3;
            this.f21612g = pVar4;
            this.f21613h = pVar5;
            this.f21614i = eVar;
            this.f21615j = m0.K();
            this.f21617l = com.google.android.exoplayer2.audio.a.f21265h;
            this.f21619n = 0;
            this.f21622q = 1;
            this.f21623r = 0;
            this.f21624s = true;
            this.f21625t = x1.f59718g;
            this.f21626u = 5000L;
            this.f21627v = 15000L;
            this.f21628w = new g.b().a();
            this.f21607b = s7.d.f79450a;
            this.f21629x = 500L;
            this.f21630y = 2000L;
            this.A = true;
        }

        public static /* synthetic */ w1 f(Context context) {
            return new d6.e(context);
        }

        public static /* synthetic */ i.a g(Context context) {
            return new com.google.android.exoplayer2.source.d(context, new i6.h());
        }

        public static /* synthetic */ q7.a0 h(Context context) {
            return new q7.m(context);
        }

        public j e() {
            s7.a.g(!this.B);
            this.B = true;
            return new k(this, null);
        }

        public b j(Looper looper) {
            s7.a.g(!this.B);
            s7.a.e(looper);
            this.f21615j = looper;
            return this;
        }

        public b k(boolean z10) {
            s7.a.g(!this.B);
            this.f21631z = z10;
            return this;
        }
    }

    void a(com.google.android.exoplayer2.source.i iVar);
}
