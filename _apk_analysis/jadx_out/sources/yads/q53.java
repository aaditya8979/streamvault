package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class q53 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f93897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30 f93898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f93900d;

    public q53(p30 p30Var, pr prVar) {
        this.f93897a = (p30) ni.a(p30Var);
        this.f93898b = (n30) ni.a(prVar);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws or {
        long jA = this.f93897a.a(u30Var);
        this.f93900d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (u30Var.f95528g == -1 && jA != -1) {
            u30Var = u30Var.a(0L, jA);
        }
        this.f93899c = true;
        pr prVar = (pr) this.f93898b;
        prVar.getClass();
        u30Var.f95529h.getClass();
        if (u30Var.f95528g == -1 && (u30Var.f95530i & 2) == 2) {
            prVar.f93727d = null;
        } else {
            prVar.f93727d = u30Var;
            prVar.f93728e = (u30Var.f95530i & 4) == 4 ? prVar.f93725b : Long.MAX_VALUE;
            prVar.f93732i = 0L;
            try {
                prVar.a(u30Var);
            } catch (IOException e10) {
                throw new or(e10);
            }
        }
        return this.f93900d;
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f93897a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() throws or {
        try {
            this.f93897a.close();
            if (this.f93899c) {
                this.f93899c = false;
                pr prVar = (pr) this.f93898b;
                if (prVar.f93727d == null) {
                    return;
                }
                try {
                    prVar.a();
                } catch (IOException e10) {
                    throw new or(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f93899c) {
                this.f93899c = false;
                pr prVar2 = (pr) this.f93898b;
                if (prVar2.f93727d != null) {
                    try {
                        prVar2.a();
                    } catch (IOException e11) {
                        throw new or(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f93897a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f93897a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws or {
        if (this.f93900d == 0) {
            return -1;
        }
        int i12 = this.f93897a.read(bArr, i10, i11);
        if (i12 > 0) {
            pr prVar = (pr) this.f93898b;
            u30 u30Var = prVar.f93727d;
            if (u30Var != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (prVar.f93731h == prVar.f93728e) {
                            prVar.a();
                            prVar.a(u30Var);
                        }
                        int iMin = (int) Math.min(i12 - i13, prVar.f93728e - prVar.f93731h);
                        OutputStream outputStream = prVar.f93730g;
                        int i14 = ib3.f90737a;
                        outputStream.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        prVar.f93731h += j10;
                        prVar.f93732i += j10;
                    } catch (IOException e10) {
                        throw new or(e10);
                    }
                }
            }
            long j11 = this.f93900d;
            if (j11 != -1) {
                this.f93900d = j11 - ((long) i12);
            }
        }
        return i12;
    }
}
