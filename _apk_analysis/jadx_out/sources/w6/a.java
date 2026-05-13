package w6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s7.z;
import v6.e;
import y7.c;

/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends e {
    @Nullable
    public static Metadata c(z zVar) {
        zVar.r(12);
        int iD = (zVar.d() + zVar.h(12)) - 4;
        zVar.r(44);
        zVar.s(zVar.h(12));
        zVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (zVar.d() >= iD) {
                break;
            }
            zVar.r(48);
            int iH = zVar.h(8);
            zVar.r(4);
            int iD2 = zVar.d() + zVar.h(12);
            String strL2 = null;
            while (zVar.d() < iD2) {
                int iH2 = zVar.h(8);
                int iH3 = zVar.h(8);
                int iD3 = zVar.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = zVar.h(16);
                    zVar.r(8);
                    if (iH4 == 3) {
                        while (zVar.d() < iD3) {
                            strL = zVar.l(zVar.h(8), c.f87335a);
                            int iH5 = zVar.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                zVar.s(zVar.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = zVar.l(iH3, c.f87335a);
                }
                zVar.p(iD3 * 8);
            }
            zVar.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new AppInfoTable(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // v6.e
    @Nullable
    public Metadata b(v6.c cVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
