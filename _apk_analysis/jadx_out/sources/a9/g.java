package a9;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI01AndOtherAIs.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {
    public g(o8.a aVar) {
        super(aVar);
    }

    @Override // a9.j
    public String d() throws NotFoundException, FormatException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(b().f(4, 4));
        g(sb2, 8, length);
        return b().a(sb2, 48);
    }
}
