package a9;

/* JADX INFO: compiled from: AI01320xDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {
    public b(o8.a aVar) {
        super(aVar);
    }

    @Override // a9.i
    public void h(StringBuilder sb2, int i10) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // a9.i
    public int i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}
