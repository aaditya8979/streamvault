package e4;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f60200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f60201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f60202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object f60204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f60205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f60206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f60207h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60208i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f60209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f60210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f60212m;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
        void e(o0 o0Var);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException;
    }

    public o0(a aVar, b bVar, v0 v0Var, int i10, Handler handler) {
        this.f60201b = aVar;
        this.f60200a = bVar;
        this.f60202c = v0Var;
        this.f60205f = handler;
        this.f60206g = i10;
    }

    public synchronized boolean a() throws InterruptedException {
        a6.a.f(this.f60209j);
        a6.a.f(this.f60205f.getLooper().getThread() != Thread.currentThread());
        while (!this.f60211l) {
            wait();
        }
        return this.f60210k;
    }

    public boolean b() {
        return this.f60208i;
    }

    public Handler c() {
        return this.f60205f;
    }

    @Nullable
    public Object d() {
        return this.f60204e;
    }

    public long e() {
        return this.f60207h;
    }

    public b f() {
        return this.f60200a;
    }

    public v0 g() {
        return this.f60202c;
    }

    public int getType() {
        return this.f60203d;
    }

    public int h() {
        return this.f60206g;
    }

    public synchronized boolean i() {
        return this.f60212m;
    }

    public synchronized void j(boolean z10) {
        this.f60210k = z10 | this.f60210k;
        this.f60211l = true;
        notifyAll();
    }

    public o0 k() {
        a6.a.f(!this.f60209j);
        if (this.f60207h == -9223372036854775807L) {
            a6.a.a(this.f60208i);
        }
        this.f60209j = true;
        this.f60201b.e(this);
        return this;
    }

    public o0 l(@Nullable Object obj) {
        a6.a.f(!this.f60209j);
        this.f60204e = obj;
        return this;
    }

    public o0 m(int i10) {
        a6.a.f(!this.f60209j);
        this.f60203d = i10;
        return this;
    }
}
