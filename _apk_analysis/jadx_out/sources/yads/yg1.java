package yads;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class yg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg1 f97131a = new wg1();

    public final String a(Context context) {
        Object objM7534constructorimpl;
        String strA;
        try {
            Result.a aVar = Result.Companion;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                tn.p.i(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = ((LocaleManager) systemService).getApplicationLocales();
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    this.f97131a.getClass();
                    strA = wg1.a(locale);
                } else {
                    wg1 wg1Var = this.f97131a;
                    Locale locale2 = applicationLocales.get(0);
                    wg1Var.getClass();
                    strA = wg1.a(locale2);
                }
            } else {
                Locale locale3 = context.getResources().getConfiguration().locale;
                this.f97131a.getClass();
                strA = wg1.a(locale3);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(strA);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (String) objM7534constructorimpl;
    }

    public final List b(Context context) {
        try {
            Result.a aVar = Result.Companion;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            List listC = cn.v.c();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                wg1 wg1Var = this.f97131a;
                Locale locale = locales.get(i10);
                wg1Var.getClass();
                listC.add(wg1.a(locale));
            }
            return cn.v.a(listC);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Object objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            return (List) objM7534constructorimpl;
        }
    }
}
