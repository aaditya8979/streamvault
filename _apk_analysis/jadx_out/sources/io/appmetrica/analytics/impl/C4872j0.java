package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4872j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gc f67000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5119sl f67003d;

    public C4872j0(String str, long j10, C5119sl c5119sl) {
        this.f67001b = j10;
        try {
            this.f67000a = new Gc(str);
        } catch (Throwable unused) {
            this.f67000a = new Gc();
        }
        this.f67003d = c5119sl;
    }

    public final synchronized C4847i0 a() {
        if (this.f67002c) {
            this.f67001b++;
            this.f67002c = false;
        }
        return new C4847i0(AbstractC4832hb.b(this.f67000a), this.f67001b);
    }

    public final synchronized void a(Pair pair) {
        if (this.f67003d.b(this.f67000a, (String) pair.first, (String) pair.second)) {
            this.f67002c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f67000a.size() + ". Is changed " + this.f67002c + ". Current revision " + this.f67001b;
    }
}
