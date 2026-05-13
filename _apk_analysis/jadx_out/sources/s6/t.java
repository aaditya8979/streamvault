package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import f6.u;
import s6.i0;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.a0 f79396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.a f79397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i6.b0 f79399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79407l;

    public t() {
        this(null);
    }

    public t(@Nullable String str) {
        this.f79401f = 0;
        s7.a0 a0Var = new s7.a0(4);
        this.f79396a = a0Var;
        a0Var.d()[0] = -1;
        this.f79397b = new u.a();
        this.f79407l = -9223372036854775807L;
        this.f79398c = str;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79399d);
        while (a0Var.a() > 0) {
            int i10 = this.f79401f;
            if (i10 == 0) {
                c(a0Var);
            } else if (i10 == 1) {
                e(a0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                d(a0Var);
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79400e = dVar.b();
        this.f79399d = mVar.track(dVar.c(), 1);
    }

    public final void c(s7.a0 a0Var) {
        byte[] bArrD = a0Var.d();
        int iF = a0Var.f();
        for (int iE = a0Var.e(); iE < iF; iE++) {
            byte b10 = bArrD[iE];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f79404i && (b10 & 224) == 224;
            this.f79404i = z10;
            if (z11) {
                a0Var.P(iE + 1);
                this.f79404i = false;
                this.f79396a.d()[1] = bArrD[iE];
                this.f79402g = 2;
                this.f79401f = 1;
                return;
            }
        }
        a0Var.P(iF);
    }

    public final void d(s7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), this.f79406k - this.f79402g);
        this.f79399d.e(a0Var, iMin);
        int i10 = this.f79402g + iMin;
        this.f79402g = i10;
        int i11 = this.f79406k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f79407l;
        if (j10 != -9223372036854775807L) {
            this.f79399d.c(j10, 1, i11, 0, null);
            this.f79407l += this.f79405j;
        }
        this.f79402g = 0;
        this.f79401f = 0;
    }

    public final void e(s7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), 4 - this.f79402g);
        a0Var.j(this.f79396a.d(), this.f79402g, iMin);
        int i10 = this.f79402g + iMin;
        this.f79402g = i10;
        if (i10 < 4) {
            return;
        }
        this.f79396a.P(0);
        if (!this.f79397b.a(this.f79396a.n())) {
            this.f79402g = 0;
            this.f79401f = 1;
            return;
        }
        u.a aVar = this.f79397b;
        this.f79406k = aVar.f61551c;
        if (!this.f79403h) {
            this.f79405j = (((long) aVar.f61555g) * 1000000) / ((long) aVar.f61552d);
            this.f79399d.b(new m.b().S(this.f79400e).e0(this.f79397b.f61550b).W(4096).H(this.f79397b.f61553e).f0(this.f79397b.f61552d).V(this.f79398c).E());
            this.f79403h = true;
        }
        this.f79396a.P(0);
        this.f79399d.e(this.f79396a, 4);
        this.f79401f = 2;
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79407l = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79401f = 0;
        this.f79402g = 0;
        this.f79404i = false;
        this.f79407l = -9223372036854775807L;
    }
}
