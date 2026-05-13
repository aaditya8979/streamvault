package yads;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class va3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f96045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f96046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f96047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96048d;

    public va3(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f96045a = strArr;
        this.f96046b = iArr;
        this.f96047c = strArr2;
        this.f96048d = i10;
    }

    public final String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f96048d;
            if (i11 >= i12) {
                sb2.append(this.f96045a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f96045a[i11]);
            int i13 = this.f96046b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f96047c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f96047c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f96047c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }
}
