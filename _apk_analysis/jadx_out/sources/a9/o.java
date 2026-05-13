package a9;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: DecodedNumeric.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3662c;

    public o(int i10, int i11, int i12) throws FormatException {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f3661b = i11;
        this.f3662c = i12;
    }

    public int b() {
        return this.f3661b;
    }

    public int c() {
        return this.f3662c;
    }

    public boolean d() {
        return this.f3661b == 10;
    }

    public boolean e() {
        return this.f3662c == 10;
    }
}
