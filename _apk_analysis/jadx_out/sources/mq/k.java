package mq;

import java.io.IOException;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpInput.java */
/* JADX INFO: loaded from: classes12.dex */
public class k extends zm.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gq.k f74927c;

    public k(b bVar) {
        this.f74926b = bVar;
        this.f74927c = (gq.k) bVar.u();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f74927c.c();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        hq.d dVarF = this.f74927c.f(this.f74926b.s());
        if (dVarF != null) {
            return dVarF.b0(bArr, i10, i11);
        }
        if (this.f74926b.H()) {
            throw new EofException("early EOF");
        }
        return -1;
    }
}
