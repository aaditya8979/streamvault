package r6;

import i6.l;
import i6.n;
import java.io.IOException;
import java.util.Arrays;
import s7.a0;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78687a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f78688b = new a0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78689c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78691e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f78690d = 0;
        do {
            int i13 = this.f78690d;
            int i14 = i10 + i13;
            f fVar = this.f78687a;
            if (i14 >= fVar.f78698g) {
                break;
            }
            int[] iArr = fVar.f78701j;
            this.f78690d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f78687a;
    }

    public a0 c() {
        return this.f78688b;
    }

    public boolean d(l lVar) throws IOException {
        int i10;
        s7.a.g(lVar != null);
        if (this.f78691e) {
            this.f78691e = false;
            this.f78688b.L(0);
        }
        while (!this.f78691e) {
            if (this.f78689c < 0) {
                if (!this.f78687a.c(lVar) || !this.f78687a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f78687a;
                int iA = fVar.f78699h;
                if ((fVar.f78693b & 1) == 1 && this.f78688b.f() == 0) {
                    iA += a(0);
                    i10 = this.f78690d + 0;
                } else {
                    i10 = 0;
                }
                if (!n.e(lVar, iA)) {
                    return false;
                }
                this.f78689c = i10;
            }
            int iA2 = a(this.f78689c);
            int i11 = this.f78689c + this.f78690d;
            if (iA2 > 0) {
                a0 a0Var = this.f78688b;
                a0Var.c(a0Var.f() + iA2);
                if (!n.d(lVar, this.f78688b.d(), this.f78688b.f(), iA2)) {
                    return false;
                }
                a0 a0Var2 = this.f78688b;
                a0Var2.O(a0Var2.f() + iA2);
                this.f78691e = this.f78687a.f78701j[i11 + (-1)] != 255;
            }
            if (i11 == this.f78687a.f78698g) {
                i11 = -1;
            }
            this.f78689c = i11;
        }
        return true;
    }

    public void e() {
        this.f78687a.b();
        this.f78688b.L(0);
        this.f78689c = -1;
        this.f78691e = false;
    }

    public void f() {
        if (this.f78688b.d().length == 65025) {
            return;
        }
        a0 a0Var = this.f78688b;
        a0Var.N(Arrays.copyOf(a0Var.d(), Math.max(65025, this.f78688b.f())), this.f78688b.f());
    }
}
