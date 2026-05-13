package yads;

import java.net.URI;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xa3 {
    public static String a(String str) {
        Object objM7534constructorimpl;
        String str2;
        try {
            Result.a aVar = Result.Companion;
            boolean zC0 = bo.d0.c0(str, "://", false, 2, null);
            if (!zC0) {
                str = b(str);
            }
            URI uri = new URI(str);
            if (zC0) {
                str2 = uri.getScheme() + "://";
            } else {
                str2 = "";
            }
            objM7534constructorimpl = Result.m7534constructorimpl(str2 + uri.getHost());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = "bad_url";
        }
        return (String) objM7534constructorimpl;
    }

    public static String b(String str) {
        return "stub://" + str;
    }
}
