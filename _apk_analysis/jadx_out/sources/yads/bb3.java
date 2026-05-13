package yads;

import java.net.URI;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class bb3 {
    public static boolean a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            new URI(str);
            objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = bool;
        }
        return ((Boolean) objM7534constructorimpl).booleanValue();
    }
}
