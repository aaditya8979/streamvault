package q6;

import androidx.annotation.Nullable;
import i6.b0;

/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f77970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.a f77971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f77973e;

    public p(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        s7.a.a((bArr2 == null) ^ (i10 == 0));
        this.f77969a = z10;
        this.f77970b = str;
        this.f77972d = i10;
        this.f77973e = bArr2;
        this.f77971c = new b0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                s7.q.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
