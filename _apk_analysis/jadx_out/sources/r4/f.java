package r4;

import a6.t;
import com.google.android.exoplayer.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f78604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f78605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f78611j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f78612k = new t(255);

    public boolean a(k4.h hVar, boolean z10) throws InterruptedException, IOException {
        this.f78612k.G();
        b();
        if (!(hVar.getLength() == -1 || hVar.getLength() - hVar.getPeekPosition() >= 27) || !hVar.peekFully(this.f78612k.f3620a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f78612k.A() != 1332176723) {
            if (z10) {
                return false;
            }
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
        int iY = this.f78612k.y();
        this.f78602a = iY;
        if (iY != 0) {
            if (z10) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.f78603b = this.f78612k.y();
        this.f78604c = this.f78612k.n();
        this.f78605d = this.f78612k.o();
        this.f78606e = this.f78612k.o();
        this.f78607f = this.f78612k.o();
        int iY2 = this.f78612k.y();
        this.f78608g = iY2;
        this.f78609h = iY2 + 27;
        this.f78612k.G();
        hVar.peekFully(this.f78612k.f3620a, 0, this.f78608g);
        for (int i10 = 0; i10 < this.f78608g; i10++) {
            this.f78611j[i10] = this.f78612k.y();
            this.f78610i += this.f78611j[i10];
        }
        return true;
    }

    public void b() {
        this.f78602a = 0;
        this.f78603b = 0;
        this.f78604c = 0L;
        this.f78605d = 0L;
        this.f78606e = 0L;
        this.f78607f = 0L;
        this.f78608g = 0;
        this.f78609h = 0;
        this.f78610i = 0;
    }
}
