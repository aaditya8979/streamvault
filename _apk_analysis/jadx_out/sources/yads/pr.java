package yads;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public final class pr implements n30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f93724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93725b = 5242880;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93726c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f93727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f93728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f93729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f93730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f93731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f93732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iq2 f93733j;

    public pr(nr nrVar) {
        this.f93724a = (nr) ni.a(nrVar);
    }

    public final void a() {
        OutputStream outputStream = this.f93730g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            ib3.a((Closeable) this.f93730g);
            this.f93730g = null;
            File file = this.f93729f;
            this.f93729f = null;
            nr nrVar = this.f93724a;
            long j10 = this.f93731h;
            vy2 vy2Var = (vy2) nrVar;
            synchronized (vy2Var) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    yy2 yy2VarA = yy2.a(file, j10, -9223372036854775807L, vy2Var.f96230c);
                    yy2VarA.getClass();
                    ls lsVar = vy2Var.f96230c;
                    hs hsVar = (hs) lsVar.f92075a.get(yy2VarA.f97751b);
                    hsVar.getClass();
                    if (!hsVar.c(yy2VarA.f97752c, yy2VarA.f97753d)) {
                        throw new IllegalStateException();
                    }
                    long jA = qz.a(hsVar.f90524e);
                    if (jA != -1 && yy2VarA.f97752c + yy2VarA.f97753d > jA) {
                        throw new IllegalStateException();
                    }
                    if (vy2Var.f96231d == null) {
                        vy2Var.a(yy2VarA);
                        vy2Var.f96230c.a();
                        vy2Var.notifyAll();
                        return;
                    }
                    try {
                        vy2Var.f96231d.a(file.getName(), yy2VarA.f97753d, yy2VarA.f97756g);
                        vy2Var.a(yy2VarA);
                        try {
                            vy2Var.f96230c.a();
                            vy2Var.notifyAll();
                            return;
                        } finally {
                            kr krVar = new kr(e);
                        }
                    } catch (IOException e10) {
                        throw new kr(e10);
                    }
                }
            }
        } catch (Throwable th2) {
            ib3.a((Closeable) this.f93730g);
            this.f93730g = null;
            File file2 = this.f93729f;
            this.f93729f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void a(u30 u30Var) {
        File file;
        long j10 = u30Var.f95528g;
        long jMin = j10 == -1 ? -1L : Math.min(j10 - this.f93732i, this.f93728e);
        nr nrVar = this.f93724a;
        String str = u30Var.f95529h;
        int i10 = ib3.f90737a;
        long j11 = u30Var.f95527f + this.f93732i;
        vy2 vy2Var = (vy2) nrVar;
        synchronized (vy2Var) {
            vy2Var.a();
            hs hsVar = (hs) vy2Var.f96230c.f92075a.get(str);
            hsVar.getClass();
            if (!hsVar.c(j11, jMin)) {
                throw new IllegalStateException();
            }
            if (!vy2Var.f96228a.exists()) {
                vy2.a(vy2Var.f96228a);
                vy2Var.c();
            }
            bf1 bf1Var = (bf1) vy2Var.f96229b;
            if (jMin != -1) {
                bf1Var.a(vy2Var, jMin);
            } else {
                bf1Var.getClass();
            }
            File file2 = new File(vy2Var.f96228a, Integer.toString(vy2Var.f96233f.nextInt(10)));
            if (!file2.exists()) {
                vy2.a(file2);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i11 = hsVar.f90520a;
            Pattern pattern = yy2.f97331h;
            file = new File(file2, i11 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
        }
        this.f93729f = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f93729f);
        if (this.f93726c > 0) {
            iq2 iq2Var = this.f93733j;
            if (iq2Var == null) {
                this.f93733j = new iq2(fileOutputStream, this.f93726c);
            } else {
                iq2Var.a(fileOutputStream);
            }
            this.f93730g = this.f93733j;
        } else {
            this.f93730g = fileOutputStream;
        }
        this.f93731h = 0L;
    }
}
