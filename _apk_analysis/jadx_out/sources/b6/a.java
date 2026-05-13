package b6;

import a6.q;
import a6.t;
import com.google.android.exoplayer.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f5404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5408e;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.f5404a = list;
        this.f5405b = i10;
        this.f5406c = i11;
        this.f5407d = i12;
        this.f5408e = f10;
    }

    public static byte[] a(t tVar) {
        int iE = tVar.E();
        int iC = tVar.c();
        tVar.M(iE);
        return a6.d.d(tVar.f3620a, iC, iE);
    }

    public static a b(t tVar) throws ParserException {
        float f10;
        int i10;
        int i11;
        try {
            tVar.M(4);
            int iY = (tVar.y() & 3) + 1;
            if (iY == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iY2 = tVar.y() & 31;
            for (int i12 = 0; i12 < iY2; i12++) {
                arrayList.add(a(tVar));
            }
            int iY3 = tVar.y();
            for (int i13 = 0; i13 < iY3; i13++) {
                arrayList.add(a(tVar));
            }
            if (iY2 > 0) {
                q.b bVarI = a6.q.i((byte[]) arrayList.get(0), iY, ((byte[]) arrayList.get(0)).length);
                int i14 = bVarI.f3607e;
                int i15 = bVarI.f3608f;
                f10 = bVarI.f3609g;
                i10 = i14;
                i11 = i15;
            } else {
                f10 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iY, i10, i11, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ParserException("Error parsing AVC config", e10);
        }
    }
}
