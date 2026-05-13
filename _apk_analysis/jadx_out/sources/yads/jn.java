package yads;

import android.util.Base64;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class jn {
    public static String a(String str) {
        byte[] bytes = str.getBytes(bo.c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] bArr) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Base64.encodeToString(bArr, 2));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            boolean z10 = ad1.f87661a;
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (String) objM7534constructorimpl;
    }
}
