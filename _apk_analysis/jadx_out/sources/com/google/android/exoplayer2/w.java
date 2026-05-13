package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes9.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.d f23000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f23001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Object f23003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f23004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23006i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23007j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23011n;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
        void b(w wVar);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException;
    }

    public w(a aVar, b bVar, c0 c0Var, int i10, s7.d dVar, Looper looper) {
        this.f22999b = aVar;
        this.f22998a = bVar;
        this.f23001d = c0Var;
        this.f23004g = looper;
        this.f23000c = dVar;
        this.f23005h = i10;
    }

    public synchronized boolean a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        s7.a.g(this.f23008k);
        s7.a.g(this.f23004g.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.f23000c.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f23010m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f23000c.onThreadBlocked();
            wait(j10);
            j10 = jElapsedRealtime - this.f23000c.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f23009l;
    }

    public boolean b() {
        return this.f23007j;
    }

    public Looper c() {
        return this.f23004g;
    }

    public int d() {
        return this.f23005h;
    }

    @Nullable
    public Object e() {
        return this.f23003f;
    }

    public long f() {
        return this.f23006i;
    }

    public b g() {
        return this.f22998a;
    }

    public int getType() {
        return this.f23002e;
    }

    public c0 h() {
        return this.f23001d;
    }

    public synchronized boolean i() {
        return this.f23011n;
    }

    public synchronized void j(boolean z10) {
        this.f23009l = z10 | this.f23009l;
        this.f23010m = true;
        notifyAll();
    }

    public w k() {
        s7.a.g(!this.f23008k);
        if (this.f23006i == -9223372036854775807L) {
            s7.a.a(this.f23007j);
        }
        this.f23008k = true;
        this.f22999b.b(this);
        return this;
    }

    public w l(@Nullable Object obj) {
        s7.a.g(!this.f23008k);
        this.f23003f = obj;
        return this;
    }

    public w m(int i10) {
        s7.a.g(!this.f23008k);
        this.f23002e = i10;
        return this;
    }
}
