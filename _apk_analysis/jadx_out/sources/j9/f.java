package j9;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: compiled from: QRCode.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f72364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f72365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h9.f f72366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72367d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f72368e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f72368e;
    }

    public void c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f72365b = errorCorrectionLevel;
    }

    public void d(int i10) {
        this.f72367d = i10;
    }

    public void e(b bVar) {
        this.f72368e = bVar;
    }

    public void f(Mode mode) {
        this.f72364a = mode;
    }

    public void g(h9.f fVar) {
        this.f72366c = fVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f72364a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f72365b);
        sb2.append("\n version: ");
        sb2.append(this.f72366c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f72367d);
        if (this.f72368e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f72368e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
