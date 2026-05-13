package u8;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f85602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k8.c f85603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k8.c f85604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f85605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f85608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85609i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f85601a = sb2.toString();
        this.f85602b = SymbolShapeHint.FORCE_NONE;
        this.f85605e = new StringBuilder(str.length());
        this.f85607g = -1;
    }

    public int a() {
        return this.f85605e.length();
    }

    public StringBuilder b() {
        return this.f85605e;
    }

    public char c() {
        return this.f85601a.charAt(this.f85606f);
    }

    public String d() {
        return this.f85601a;
    }

    public int e() {
        return this.f85607g;
    }

    public int f() {
        return h() - this.f85606f;
    }

    public k g() {
        return this.f85608h;
    }

    public final int h() {
        return this.f85601a.length() - this.f85609i;
    }

    public boolean i() {
        return this.f85606f < h();
    }

    public void j() {
        this.f85607g = -1;
    }

    public void k() {
        this.f85608h = null;
    }

    public void l(k8.c cVar, k8.c cVar2) {
        this.f85603c = cVar;
        this.f85604d = cVar2;
    }

    public void m(int i10) {
        this.f85609i = i10;
    }

    public void n(SymbolShapeHint symbolShapeHint) {
        this.f85602b = symbolShapeHint;
    }

    public void o(int i10) {
        this.f85607g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f85608h;
        if (kVar == null || i10 > kVar.a()) {
            this.f85608h = k.l(i10, this.f85602b, this.f85603c, this.f85604d, true);
        }
    }

    public void r(char c10) {
        this.f85605e.append(c10);
    }

    public void s(String str) {
        this.f85605e.append(str);
    }
}
