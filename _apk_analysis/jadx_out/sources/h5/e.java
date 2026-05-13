package h5;

import a6.k0;
import com.google.android.exoplayer.Format;
import e4.f0;
import e5.i0;
import java.io.IOException;

/* JADX INFO: compiled from: EventSampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f62977b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f62979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i5.e f62981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62983h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4.b f62978c = new x4.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62984i = -9223372036854775807L;

    public e(i5.e eVar, Format format, boolean z10) {
        this.f62977b = format;
        this.f62981f = eVar;
        this.f62979d = eVar.f63763b;
        d(eVar, z10);
    }

    public String a() {
        return this.f62981f.a();
    }

    @Override // e5.i0
    public int b(f0 f0Var, i4.e eVar, boolean z10) {
        if (z10 || !this.f62982g) {
            f0Var.f60107c = this.f62977b;
            this.f62982g = true;
            return -5;
        }
        int i10 = this.f62983h;
        if (i10 == this.f62979d.length) {
            if (this.f62980e) {
                return -3;
            }
            eVar.setFlags(4);
            return -4;
        }
        this.f62983h = i10 + 1;
        byte[] bArrA = this.f62978c.a(this.f62981f.f63762a[i10]);
        if (bArrA == null) {
            return -3;
        }
        eVar.b(bArrA.length);
        eVar.f63711c.put(bArrA);
        eVar.f63713e = this.f62979d[i10];
        eVar.setFlags(1);
        return -4;
    }

    public void c(long j10) {
        int iE = k0.e(this.f62979d, j10, true, false);
        this.f62983h = iE;
        if (!(this.f62980e && iE == this.f62979d.length)) {
            j10 = -9223372036854775807L;
        }
        this.f62984i = j10;
    }

    public void d(i5.e eVar, boolean z10) {
        int i10 = this.f62983h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f62979d[i10 - 1];
        this.f62980e = z10;
        this.f62981f = eVar;
        long[] jArr = eVar.f63763b;
        this.f62979d = jArr;
        long j11 = this.f62984i;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f62983h = k0.e(jArr, j10, false, false);
        }
    }

    @Override // e5.i0
    public boolean isReady() {
        return true;
    }

    @Override // e5.i0
    public void maybeThrowError() throws IOException {
    }

    @Override // e5.i0
    public int skipData(long j10) {
        int iMax = Math.max(this.f62983h, k0.e(this.f62979d, j10, true, false));
        int i10 = iMax - this.f62983h;
        this.f62983h = iMax;
        return i10;
    }
}
