package iq;

import hq.d;
import hq.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: StreamEndPoint.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f71752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OutputStream f71753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f71755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f71756f;

    public b(InputStream inputStream, OutputStream outputStream) {
        this.f71752b = inputStream;
        this.f71753c = outputStream;
    }

    public InputStream A() {
        return this.f71752b;
    }

    public void B() throws IOException {
        InputStream inputStream = this.f71752b;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final boolean C() {
        return !isOpen();
    }

    @Override // hq.k
    public int c() {
        return 0;
    }

    @Override // hq.k
    public void close() throws IOException {
        InputStream inputStream = this.f71752b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f71752b = null;
        OutputStream outputStream = this.f71753c;
        if (outputStream != null) {
            outputStream.close();
        }
        this.f71753c = null;
    }

    @Override // hq.k
    public int d() {
        return this.f71754d;
    }

    @Override // hq.k
    public String f() {
        return null;
    }

    @Override // hq.k
    public void flush() throws IOException {
        OutputStream outputStream = this.f71753c;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // hq.k
    public boolean g() {
        return true;
    }

    @Override // hq.k
    public String h() {
        return null;
    }

    @Override // hq.k
    public boolean i(long j10) throws IOException {
        return true;
    }

    @Override // hq.k
    public boolean isOpen() {
        return this.f71752b != null;
    }

    @Override // hq.k
    public int j(d dVar) throws IOException {
        if (this.f71755e) {
            return -1;
        }
        if (this.f71752b == null) {
            return 0;
        }
        int iL = dVar.L();
        if (iL <= 0) {
            if (dVar.hasContent()) {
                return 0;
            }
            throw new IOException("FULL");
        }
        try {
            int iK = dVar.K(this.f71752b, iL);
            if (iK < 0) {
                l();
            }
            return iK;
        } catch (SocketTimeoutException unused) {
            B();
            return -1;
        }
    }

    @Override // hq.k
    public int k(d dVar) throws IOException {
        if (this.f71756f) {
            return -1;
        }
        if (this.f71753c == null) {
            return 0;
        }
        int length = dVar.length();
        if (length > 0) {
            dVar.writeTo(this.f71753c);
        }
        if (!dVar.Z()) {
            dVar.clear();
        }
        return length;
    }

    @Override // hq.k
    public void l() throws IOException {
        InputStream inputStream;
        this.f71755e = true;
        if (!this.f71756f || (inputStream = this.f71752b) == null) {
            return;
        }
        inputStream.close();
    }

    @Override // hq.k
    public boolean m(long j10) throws IOException {
        return true;
    }

    @Override // hq.k
    public void p() throws IOException {
        OutputStream outputStream;
        this.f71756f = true;
        if (!this.f71755e || (outputStream = this.f71753c) == null) {
            return;
        }
        outputStream.close();
    }

    @Override // hq.k
    public int r(d dVar, d dVar2, d dVar3) throws IOException {
        int iK;
        int length;
        int length2;
        if (dVar == null || (length2 = dVar.length()) <= 0) {
            iK = 0;
        } else {
            iK = k(dVar);
            if (iK < length2) {
                return iK;
            }
        }
        if (dVar2 != null && (length = dVar2.length()) > 0) {
            int iK2 = k(dVar2);
            if (iK2 < 0) {
                return iK > 0 ? iK : iK2;
            }
            iK += iK2;
            if (iK2 < length) {
                return iK;
            }
        }
        if (dVar3 == null || dVar3.length() <= 0) {
            return iK;
        }
        int iK3 = k(dVar3);
        return iK3 < 0 ? iK > 0 ? iK : iK3 : iK + iK3;
    }

    @Override // hq.k
    public void u(int i10) throws IOException {
        this.f71754d = i10;
    }

    @Override // hq.k
    public String v() {
        return null;
    }

    @Override // hq.k
    public boolean x() {
        return this.f71756f;
    }

    @Override // hq.k
    public boolean z() {
        return this.f71755e;
    }
}
