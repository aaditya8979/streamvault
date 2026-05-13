package u8;

import java.util.Arrays;

/* JADX INFO: compiled from: DefaultPlacement.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f85597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f85600d;

    public e(CharSequence charSequence, int i10, int i11) {
        this.f85597a = charSequence;
        this.f85599c = i10;
        this.f85598b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f85600d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i10) {
        f(this.f85598b - 1, 0, i10, 1);
        f(this.f85598b - 1, 1, i10, 2);
        f(this.f85598b - 1, 2, i10, 3);
        f(0, this.f85599c - 2, i10, 4);
        f(0, this.f85599c - 1, i10, 5);
        f(1, this.f85599c - 1, i10, 6);
        f(2, this.f85599c - 1, i10, 7);
        f(3, this.f85599c - 1, i10, 8);
    }

    public final void b(int i10) {
        f(this.f85598b - 3, 0, i10, 1);
        f(this.f85598b - 2, 0, i10, 2);
        f(this.f85598b - 1, 0, i10, 3);
        f(0, this.f85599c - 4, i10, 4);
        f(0, this.f85599c - 3, i10, 5);
        f(0, this.f85599c - 2, i10, 6);
        f(0, this.f85599c - 1, i10, 7);
        f(1, this.f85599c - 1, i10, 8);
    }

    public final void c(int i10) {
        f(this.f85598b - 3, 0, i10, 1);
        f(this.f85598b - 2, 0, i10, 2);
        f(this.f85598b - 1, 0, i10, 3);
        f(0, this.f85599c - 2, i10, 4);
        f(0, this.f85599c - 1, i10, 5);
        f(1, this.f85599c - 1, i10, 6);
        f(2, this.f85599c - 1, i10, 7);
        f(3, this.f85599c - 1, i10, 8);
    }

    public final void d(int i10) {
        f(this.f85598b - 1, 0, i10, 1);
        f(this.f85598b - 1, this.f85599c - 1, i10, 2);
        f(0, this.f85599c - 3, i10, 3);
        f(0, this.f85599c - 2, i10, 4);
        f(0, this.f85599c - 1, i10, 5);
        f(1, this.f85599c - 3, i10, 6);
        f(1, this.f85599c - 2, i10, 7);
        f(1, this.f85599c - 1, i10, 8);
    }

    public final boolean e(int i10, int i11) {
        return this.f85600d[(i11 * this.f85599c) + i10] == 1;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f85598b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f85599c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        i(i11, i10, (this.f85597a.charAt(i12) & (1 << (8 - i13))) != 0);
    }

    public final boolean g(int i10, int i11) {
        return this.f85600d[(i11 * this.f85599c) + i10] < 0;
    }

    public final void h() {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (true) {
            if (i14 == this.f85598b && i12 == 0) {
                a(i13);
                i13++;
            }
            if (i14 == this.f85598b - 2 && i12 == 0 && this.f85599c % 4 != 0) {
                b(i13);
                i13++;
            }
            if (i14 == this.f85598b - 2 && i12 == 0 && this.f85599c % 8 == 4) {
                c(i13);
                i13++;
            }
            if (i14 == this.f85598b + 4 && i12 == 2 && this.f85599c % 8 == 0) {
                d(i13);
                i13++;
            }
            do {
                if (i14 < this.f85598b && i12 >= 0 && g(i12, i14)) {
                    j(i14, i12, i13);
                    i13++;
                }
                i14 -= 2;
                i12 += 2;
                if (i14 < 0) {
                    break;
                }
            } while (i12 < this.f85599c);
            int i15 = i14 + 1;
            int i16 = i12 + 3;
            do {
                if (i15 >= 0 && i16 < this.f85599c && g(i16, i15)) {
                    j(i15, i16, i13);
                    i13++;
                }
                i15 += 2;
                i16 -= 2;
                i10 = this.f85598b;
                if (i15 >= i10) {
                    break;
                }
            } while (i16 >= 0);
            i14 = i15 + 3;
            i12 = i16 + 1;
            if (i14 >= i10 && i12 >= (i11 = this.f85599c)) {
                break;
            }
        }
        if (g(i11 - 1, i10 - 1)) {
            i(this.f85599c - 1, this.f85598b - 1, true);
            i(this.f85599c - 2, this.f85598b - 2, true);
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        this.f85600d[(i11 * this.f85599c) + i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final void j(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        f(i13, i14, i12, 1);
        int i15 = i11 - 1;
        f(i13, i15, i12, 2);
        int i16 = i10 - 1;
        f(i16, i14, i12, 3);
        f(i16, i15, i12, 4);
        f(i16, i11, i12, 5);
        f(i10, i14, i12, 6);
        f(i10, i15, i12, 7);
        f(i10, i11, i12, 8);
    }
}
