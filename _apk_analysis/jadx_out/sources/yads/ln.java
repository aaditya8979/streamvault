package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ln f92037a = new ln();

    public static final byte[] a(String str) {
        Object objM7534constructorimpl;
        ByteArrayInputStream byteArrayInputStream;
        try {
            Result.a aVar = Result.Companion;
            if (str == null) {
                str = "";
            }
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArrC = on.a.c(gZIPInputStream);
                on.b.a(gZIPInputStream, null);
                on.b.a(byteArrayInputStream, null);
                objM7534constructorimpl = Result.m7534constructorimpl(bArrC);
                if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
                    objM7534constructorimpl = new byte[0];
                }
                return (byte[]) objM7534constructorimpl;
            } finally {
            }
        } finally {
        }
    }

    public static final String b(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(new String(a(str), bo.c.f5639b));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            objM7534constructorimpl = "";
        }
        return (String) objM7534constructorimpl;
    }
}
