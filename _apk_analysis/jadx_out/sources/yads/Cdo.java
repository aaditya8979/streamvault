package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: yads.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cdo implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zk f88921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zk f88922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk f88923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f88924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f88925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f88926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88927h;

    public Cdo() {
        ByteBuffer byteBuffer = bl.f88040a;
        this.f88925f = byteBuffer;
        this.f88926g = byteBuffer;
        zk zkVar = zk.f97640e;
        this.f88923d = zkVar;
        this.f88924e = zkVar;
        this.f88921b = zkVar;
        this.f88922c = zkVar;
    }

    @Override // yads.bl
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f88926g;
        this.f88926g = bl.f88040a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i10) {
        if (this.f88925f.capacity() < i10) {
            this.f88925f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f88925f.clear();
        }
        ByteBuffer byteBuffer = this.f88925f;
        this.f88926g = byteBuffer;
        return byteBuffer;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) {
        this.f88923d = zkVar;
        this.f88924e = b(zkVar);
        return isActive() ? this.f88924e : zk.f97640e;
    }

    public abstract zk b(zk zkVar);

    @Override // yads.bl
    public final void b() {
        this.f88927h = true;
        d();
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    @Override // yads.bl
    public final void flush() {
        this.f88926g = bl.f88040a;
        this.f88927h = false;
        this.f88921b = this.f88923d;
        this.f88922c = this.f88924e;
        c();
    }

    @Override // yads.bl
    public boolean isActive() {
        return this.f88924e != zk.f97640e;
    }

    @Override // yads.bl
    public boolean isEnded() {
        return this.f88927h && this.f88926g == bl.f88040a;
    }

    @Override // yads.bl
    public final void reset() {
        flush();
        this.f88925f = bl.f88040a;
        zk zkVar = zk.f97640e;
        this.f88923d = zkVar;
        this.f88924e = zkVar;
        this.f88921b = zkVar;
        this.f88922c = zkVar;
        e();
    }
}
