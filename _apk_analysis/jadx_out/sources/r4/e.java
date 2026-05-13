package r4;

import a6.t;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78597a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f78598b = new t(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78599c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78601e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f78600d = 0;
        do {
            int i13 = this.f78600d;
            int i14 = i10 + i13;
            f fVar = this.f78597a;
            if (i14 >= fVar.f78608g) {
                break;
            }
            int[] iArr = fVar.f78611j;
            this.f78600d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f78597a;
    }

    public t c() {
        return this.f78598b;
    }

    public boolean d(k4.h hVar) throws InterruptedException, IOException {
        int i10;
        a6.a.f(hVar != null);
        if (this.f78601e) {
            this.f78601e = false;
            this.f78598b.G();
        }
        while (!this.f78601e) {
            if (this.f78599c < 0) {
                if (!this.f78597a.a(hVar, true)) {
                    return false;
                }
                f fVar = this.f78597a;
                int iA = fVar.f78609h;
                if ((fVar.f78603b & 1) == 1 && this.f78598b.d() == 0) {
                    iA += a(0);
                    i10 = this.f78600d + 0;
                } else {
                    i10 = 0;
                }
                hVar.skipFully(iA);
                this.f78599c = i10;
            }
            int iA2 = a(this.f78599c);
            int i11 = this.f78599c + this.f78600d;
            if (iA2 > 0) {
                if (this.f78598b.b() < this.f78598b.d() + iA2) {
                    t tVar = this.f78598b;
                    tVar.f3620a = Arrays.copyOf(tVar.f3620a, tVar.d() + iA2);
                }
                t tVar2 = this.f78598b;
                hVar.readFully(tVar2.f3620a, tVar2.d(), iA2);
                t tVar3 = this.f78598b;
                tVar3.K(tVar3.d() + iA2);
                this.f78601e = this.f78597a.f78611j[i11 + (-1)] != 255;
            }
            if (i11 == this.f78597a.f78608g) {
                i11 = -1;
            }
            this.f78599c = i11;
        }
        return true;
    }

    public void e() {
        this.f78597a.b();
        this.f78598b.G();
        this.f78599c = -1;
        this.f78601e = false;
    }

    public void f() {
        t tVar = this.f78598b;
        byte[] bArr = tVar.f3620a;
        if (bArr.length == 65025) {
            return;
        }
        tVar.f3620a = Arrays.copyOf(bArr, Math.max(65025, tVar.d()));
    }
}
