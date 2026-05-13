package i6;

import androidx.annotation.Nullable;
import i6.b0;
import java.io.IOException;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f63850a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f63853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63856g;

    public void a(b0 b0Var, @Nullable b0.a aVar) {
        if (this.f63852c > 0) {
            b0Var.c(this.f63853d, this.f63854e, this.f63855f, this.f63856g, aVar);
            this.f63852c = 0;
        }
    }

    public void b() {
        this.f63851b = false;
        this.f63852c = 0;
    }

    public void c(b0 b0Var, long j10, int i10, int i11, int i12, @Nullable b0.a aVar) {
        s7.a.h(this.f63856g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f63851b) {
            int i13 = this.f63852c;
            int i14 = i13 + 1;
            this.f63852c = i14;
            if (i13 == 0) {
                this.f63853d = j10;
                this.f63854e = i10;
                this.f63855f = 0;
            }
            this.f63855f += i11;
            this.f63856g = i12;
            if (i14 >= 16) {
                a(b0Var, aVar);
            }
        }
    }

    public void d(l lVar) throws IOException {
        if (this.f63851b) {
            return;
        }
        lVar.peekFully(this.f63850a, 0, 10);
        lVar.resetPeekPosition();
        if (f6.b.i(this.f63850a) == 0) {
            return;
        }
        this.f63851b = true;
    }
}
