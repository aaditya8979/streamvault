package yads;

import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ya3 {
    public static String a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Uri.parse(b(str)).getHost());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (String) objM7534constructorimpl;
    }

    public static String b(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return "https://" + str;
    }
}
