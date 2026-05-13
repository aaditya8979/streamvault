package no;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public static final String a(a aVar, long j10) throws EOFException {
        if (j10 == 0) {
            return "";
        }
        ro.d dVar = ro.d.f78921a;
        m mVarM = aVar.m();
        if (mVarM == null) {
            throw new IllegalStateException("Unreacheable".toString());
        }
        ro.b unused = ro.e.f78922a;
        if (mVarM.j() < j10) {
            return qo.a.b(s.d(aVar, (int) j10), 0, 0, 3, null);
        }
        byte[] bArrB = mVarM.b(true);
        int iF = mVarM.f();
        String strA = qo.a.a(bArrB, iF, Math.min(mVarM.d(), ((int) j10) + iF));
        aVar.skip(j10);
        return strA;
    }

    @NotNull
    public static final String b(@NotNull a aVar) {
        tn.p.k(aVar, "<this>");
        return a(aVar, aVar.n());
    }

    @NotNull
    public static final String c(@NotNull r rVar) {
        tn.p.k(rVar, "<this>");
        rVar.request(Long.MAX_VALUE);
        return a(rVar.getBuffer(), rVar.getBuffer().n());
    }

    @NotNull
    public static final String d(@NotNull r rVar, long j10) {
        tn.p.k(rVar, "<this>");
        rVar.require(j10);
        return a(rVar.getBuffer(), j10);
    }
}
