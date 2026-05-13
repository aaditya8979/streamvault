package yo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public char[] f97993a = n.f97964c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97994b;

    @Override // yo.g0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f97993a;
        int i10 = this.f97994b;
        this.f97994b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // yo.g0
    public void b(@NotNull String str) {
        tn.p.k(str, "text");
        e(str.length() + 2);
        char[] cArr = this.f97993a;
        int i10 = this.f97994b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < k1.a().length && k1.a()[c10] != 0) {
                d(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f97994b = i12 + 1;
    }

    @Override // yo.g0
    public void c(@NotNull String str) {
        tn.p.k(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(length);
        str.getChars(0, str.length(), this.f97993a, this.f97994b);
        this.f97994b += length;
    }

    public final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= k1.a().length || (b10 = k1.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f97993a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = k1.b()[cCharAt];
                    tn.p.h(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f97993a, iF2);
                    i11 = iF2 + str2.length();
                    this.f97994b = i11;
                } else {
                    char[] cArr = this.f97993a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                    this.f97994b = i11;
                }
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f97993a[iF3] = '\"';
        this.f97994b = iF3 + 1;
    }

    public final void e(int i10) {
        f(this.f97994b, i10);
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f97993a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, zn.n.e(i12, i10 * 2));
            tn.p.j(cArrCopyOf, "copyOf(...)");
            this.f97993a = cArrCopyOf;
        }
        return i10;
    }

    public void g() {
        n.f97964c.c(this.f97993a);
    }

    @NotNull
    public String toString() {
        return new String(this.f97993a, 0, this.f97994b);
    }

    @Override // yo.g0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
