package i7;

import g7.h;
import g7.i;
import java.util.List;
import s7.a0;

/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f63949o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f63949o = new b(a0Var.J(), a0Var.J());
    }

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f63949o.r();
        }
        return new c(this.f63949o.b(bArr, i10));
    }
}
