package yads;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class te2 implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms2 f95183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx0 f95184b = new nx0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ws1 f95185c = new ws1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95186d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2 f95187e;

    public te2(ue2 ue2Var, qe qeVar) {
        this.f95187e = ue2Var;
        this.f95183a = ms2.a(qeVar);
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) {
        return this.f95183a.b(l30Var, i10, z10);
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        this.f95183a.b(i10, jb2Var);
    }

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
        long jA;
        ws1 ws1Var;
        long jF;
        this.f95183a.a(j10, i10, i11, i12, l73Var);
        while (this.f95183a.a(false)) {
            this.f95185c.b();
            if (this.f95183a.a(this.f95184b, (sa0) this.f95185c, 0, false) == -4) {
                this.f95185c.c();
                ws1Var = this.f95185c;
            } else {
                ws1Var = null;
            }
            if (ws1Var != null) {
                long j11 = ws1Var.f94751f;
                ts1 ts1VarA = this.f95187e.f95627d.a(ws1Var);
                if (ts1VarA != null) {
                    wm0 wm0Var = (wm0) ts1VarA.f95344b[0];
                    String str = wm0Var.f96446b;
                    String str2 = wm0Var.f96447c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || ExifInterface.GPS_MEASUREMENT_3D.equals(str2))) {
                        try {
                            jF = ib3.f(ib3.a(wm0Var.f96450f));
                        } catch (ob2 unused) {
                            jF = -9223372036854775807L;
                        }
                        if (jF != -9223372036854775807L) {
                            re2 re2Var = new re2(j11, jF);
                            Handler handler = this.f95187e.f95628e;
                            handler.sendMessage(handler.obtainMessage(1, re2Var));
                        }
                    }
                }
            }
        }
        ms2 ms2Var = this.f95183a;
        is2 is2Var = ms2Var.f92531a;
        synchronized (ms2Var) {
            int i13 = ms2Var.f92549s;
            jA = i13 == 0 ? -1L : ms2Var.a(i13);
        }
        is2Var.a(jA);
    }

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
        this.f95183a.a(mx0Var);
    }
}
