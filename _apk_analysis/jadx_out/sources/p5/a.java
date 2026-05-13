package p5;

import a6.t;
import java.util.List;
import n5.e;

/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends n5.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f76994o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        t tVar = new t(list.get(0));
        this.f76994o = new b(tVar.E(), tVar.E());
    }

    @Override // n5.c
    public e v(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f76994o.r();
        }
        return new c(this.f76994o.b(bArr, i10));
    }
}
