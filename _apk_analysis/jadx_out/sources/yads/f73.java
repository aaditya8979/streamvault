package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class f73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l73 f89503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89505e;

    public f73(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        ni.a((bArr2 == null) ^ (i10 == 0));
        this.f89501a = z10;
        this.f89502b = str;
        this.f89504d = i10;
        this.f89505e = bArr2;
        this.f89503c = new l73(a(str), i11, i12, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
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
                ih1.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
