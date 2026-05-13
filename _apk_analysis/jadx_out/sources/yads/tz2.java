package yads;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class tz2 implements pm1, yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f95443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o30 f95444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r83 f95445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae0 f95446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f95447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i73 f95448g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f95450i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mx0 f95452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f95453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f95454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f95455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f95456o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f95449h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg1 f95451j = new fg1("SingleSampleMediaPeriod");

    public tz2(u30 u30Var, o30 o30Var, r83 r83Var, mx0 mx0Var, long j10, ae0 ae0Var, bn1 bn1Var, boolean z10) {
        this.f95443b = u30Var;
        this.f95444c = o30Var;
        this.f95445d = r83Var;
        this.f95452k = mx0Var;
        this.f95450i = j10;
        this.f95446e = ae0Var;
        this.f95447f = bn1Var;
        this.f95453l = z10;
        this.f95448g = new i73(new h73(mx0Var));
    }

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        return j10;
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < op0VarArr.length; i10++) {
            ns2 ns2Var = ns2VarArr[i10];
            if (ns2Var != null && (op0VarArr[i10] == null || !zArr[i10])) {
                this.f95449h.remove(ns2Var);
                ns2VarArr[i10] = null;
            }
            if (ns2VarArr[i10] == null && op0VarArr[i10] != null) {
                rz2 rz2Var = new rz2(this);
                this.f95449h.add(rz2Var);
                ns2VarArr[i10] = rz2Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zf1 zf1Var;
        Uri uri = ((sz2) bg1Var).f95023b.f94279c;
        vf1 vf1Var = new vf1();
        int i11 = ib3.f90737a;
        this.f95446e.getClass();
        if ((iOException instanceof ob2) || (iOException instanceof FileNotFoundException) || (iOException instanceof p11) || (iOException instanceof eg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = q30.f93872c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f93873b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L || i10 >= this.f95446e.a(1);
        if (this.f95453l && z10) {
            ih1.d("SingleSampleMediaPeriod", ih1.a("Loading failed, treating as end-of-stream.", iOException));
            this.f95454m = true;
            zf1Var = fg1.f89569d;
        } else {
            zf1Var = jMin != -9223372036854775807L ? new zf1(0, jMin) : fg1.f89570e;
        }
        int i13 = zf1Var.f97559a;
        boolean z11 = !(i13 == 0 || i13 == 1);
        bn1 bn1Var = this.f95447f;
        bn1Var.a(vf1Var, new hm1(1, -1, this.f95452k, 0, null, bn1Var.a(0L), bn1Var.a(this.f95450i)), iOException, z11);
        if (z11) {
            this.f95446e.getClass();
        }
        return zf1Var;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        sz2 sz2Var = (sz2) bg1Var;
        this.f95456o = (int) sz2Var.f95023b.f94278b;
        byte[] bArr = sz2Var.f95024c;
        bArr.getClass();
        this.f95455n = bArr;
        this.f95454m = true;
        Uri uri = sz2Var.f95023b.f94279c;
        vf1 vf1Var = new vf1();
        this.f95446e.getClass();
        bn1 bn1Var = this.f95447f;
        bn1Var.b(vf1Var, new hm1(1, -1, this.f95452k, 0, null, bn1Var.a(0L), bn1Var.a(this.f95450i)));
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        Uri uri = ((sz2) bg1Var).f95023b.f94279c;
        vf1 vf1Var = new vf1();
        this.f95446e.getClass();
        bn1 bn1Var = this.f95447f;
        bn1Var.a(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(0L), bn1Var.a(this.f95450i)));
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        om1Var.a((pm1) this);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        if (this.f95454m || this.f95451j.b() || this.f95451j.f89573c != null) {
            return false;
        }
        p30 p30VarCreateDataSource = this.f95444c.createDataSource();
        r83 r83Var = this.f95445d;
        if (r83Var != null) {
            p30VarCreateDataSource.a(r83Var);
        }
        this.f95451j.a(new sz2(p30VarCreateDataSource, this.f95443b), this, this.f95446e.a(1));
        bn1 bn1Var = this.f95447f;
        Uri uri = this.f95443b.f95522a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(1, -1, this.f95452k, 0, null, bn1Var.a(0L), bn1Var.a(this.f95450i)));
        return true;
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        return this.f95454m ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return (this.f95454m || this.f95451j.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f95448g;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f95451j.b();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f95449h.size(); i10++) {
            rz2 rz2Var = (rz2) this.f95449h.get(i10);
            if (rz2Var.f94657b == 2) {
                rz2Var.f94657b = 1;
            }
        }
        return j10;
    }
}
