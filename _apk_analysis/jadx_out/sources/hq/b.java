package hq;

import java.io.IOException;

/* JADX INFO: compiled from: AbstractConnection.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vq.c f63587d = vq.b.a(b.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f63589c;

    public b(k kVar) {
        this.f63589c = kVar;
        this.f63588b = System.currentTimeMillis();
    }

    public b(k kVar, long j10) {
        this.f63589c = kVar;
        this.f63588b = j10;
    }

    @Override // hq.j
    public void a(long j10) {
        try {
            f63587d.h("onIdleExpired {}ms {} {}", Long.valueOf(j10), this, this.f63589c);
            if (this.f63589c.z() || this.f63589c.x()) {
                this.f63589c.close();
            } else {
                this.f63589c.p();
            }
        } catch (IOException e10) {
            f63587d.g(e10);
            try {
                this.f63589c.close();
            } catch (IOException e11) {
                f63587d.g(e11);
            }
        }
    }

    @Override // hq.j
    public long d() {
        return this.f63588b;
    }

    public k f() {
        return this.f63589c;
    }

    public String toString() {
        return String.format("%s@%x", getClass().getSimpleName(), Integer.valueOf(hashCode()));
    }
}
