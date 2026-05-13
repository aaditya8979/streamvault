package mq;

import java.io.IOException;
import java.io.Writer;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpOutput.java */
/* JADX INFO: loaded from: classes12.dex */
public class l extends zm.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f74928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gq.a f74929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hq.h f74931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f74932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Writer f74933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char[] f74934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sq.g f74935j;

    public l(b bVar) {
        this.f74928c = bVar;
        this.f74929d = (gq.a) bVar.q();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74930e = true;
    }

    public int d() {
        return this.f74928c.s();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f74929d.s(d());
    }

    public void h() {
        this.f74930e = false;
    }

    public boolean isClosed() {
        return this.f74930e;
    }

    public final void k(hq.d dVar) throws IOException {
        if (this.f74930e) {
            throw new IOException("Closed");
        }
        if (!this.f74929d.w()) {
            throw new EofException();
        }
        while (this.f74929d.v()) {
            this.f74929d.q(d());
            if (this.f74930e) {
                throw new IOException("Closed");
            }
            if (!this.f74929d.w()) {
                throw new EofException();
            }
        }
        this.f74929d.g(dVar, false);
        if (this.f74929d.k()) {
            flush();
            close();
        } else if (this.f74929d.v()) {
            this.f74928c.i(false);
        }
        while (dVar.length() > 0 && this.f74929d.w()) {
            this.f74929d.q(d());
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        hq.h hVar = this.f74931f;
        if (hVar == null) {
            this.f74931f = new hq.h(1);
        } else {
            hVar.clear();
        }
        this.f74931f.put((byte) i10);
        k(this.f74931f);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        k(new hq.h(bArr));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        k(new hq.h(bArr, i10, i11));
    }
}
