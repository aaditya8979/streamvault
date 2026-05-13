package s4;

import a6.t;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import k4.g;
import k4.h;
import k4.i;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: RawCcExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f79062a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f79064c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79069h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f79063b = new t(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79065d = 0;

    public a(Format format) {
        this.f79062a = format;
    }

    @Override // k4.g
    public boolean a(h hVar) throws InterruptedException, IOException {
        this.f79063b.G();
        hVar.peekFully(this.f79063b.f3620a, 0, 8);
        return this.f79063b.j() == 1380139777;
    }

    @Override // k4.g
    public void b(i iVar) {
        iVar.c(new s.b(-9223372036854775807L));
        this.f79064c = iVar.track(0, 3);
        iVar.endTracks();
        this.f79064c.d(this.f79062a);
    }

    @Override // k4.g
    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f79065d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    e(hVar);
                    this.f79065d = 1;
                    return 0;
                }
                if (!f(hVar)) {
                    this.f79065d = 0;
                    return -1;
                }
                this.f79065d = 2;
            } else {
                if (!d(hVar)) {
                    return -1;
                }
                this.f79065d = 1;
            }
        }
    }

    public final boolean d(h hVar) throws InterruptedException, IOException {
        this.f79063b.G();
        if (!hVar.readFully(this.f79063b.f3620a, 0, 8, true)) {
            return false;
        }
        if (this.f79063b.j() != 1380139777) {
            throw new IOException("Input not RawCC");
        }
        this.f79066e = this.f79063b.y();
        return true;
    }

    public final void e(h hVar) throws InterruptedException, IOException {
        while (this.f79068g > 0) {
            this.f79063b.G();
            hVar.readFully(this.f79063b.f3620a, 0, 3);
            this.f79064c.a(this.f79063b, 3);
            this.f79069h += 3;
            this.f79068g--;
        }
        int i10 = this.f79069h;
        if (i10 > 0) {
            this.f79064c.c(this.f79067f, 1, i10, 0, null);
        }
    }

    public final boolean f(h hVar) throws InterruptedException, IOException {
        this.f79063b.G();
        int i10 = this.f79066e;
        if (i10 == 0) {
            if (!hVar.readFully(this.f79063b.f3620a, 0, 5, true)) {
                return false;
            }
            this.f79067f = (this.f79063b.A() * 1000) / 45;
        } else {
            if (i10 != 1) {
                throw new ParserException("Unsupported version number: " + this.f79066e);
            }
            if (!hVar.readFully(this.f79063b.f3620a, 0, 9, true)) {
                return false;
            }
            this.f79067f = this.f79063b.r();
        }
        this.f79068g = this.f79063b.y();
        this.f79069h = 0;
        return true;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f79065d = 0;
    }
}
