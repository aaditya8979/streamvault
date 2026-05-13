package yads;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class yn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj2 f97256a;

    public yn3(cj2 cj2Var) {
        this.f97256a = cj2Var;
    }

    public final void a() {
        String strA = this.f97256a.a();
        String strC1 = strA != null ? bo.d0.c1(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (strC1 == null || strC1.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strC1);
        } catch (Throwable unused) {
        }
    }
}
