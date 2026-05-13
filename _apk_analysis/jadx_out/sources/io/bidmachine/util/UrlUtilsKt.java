package io.bidmachine.util;

import android.net.Uri;
import cn.r;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UrlUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a#\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"parseUri", "Landroid/net/Uri;", "", "removeQueryParameters", "parameterNames", "", "(Landroid/net/Uri;[Ljava/lang/String;)Landroid/net/Uri;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UrlUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri parseUri(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "<this>"
            tn.p.k(r8, r1)
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "parse(this)"
            tn.p.j(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r2.getScheme()     // Catch: java.lang.Throwable -> L5d
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L22
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L20
            goto L22
        L20:
            r3 = r5
            goto L23
        L22:
            r3 = r4
        L23:
            if (r3 == 0) goto L5c
            r3 = 2
            boolean r6 = bo.a0.W(r8, r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L5c
            android.net.Uri r8 = io.bidmachine.util.Utils.getValidUri(r8)     // Catch: java.lang.Throwable -> L5d
            if (r8 == 0) goto L5c
            java.lang.String r6 = r8.getScheme()     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L49
            java.lang.String r7 = "scheme"
            tn.p.j(r6, r7)     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L5d
            if (r6 <= 0) goto L45
            r6 = r4
            goto L46
        L45:
            r6 = r5
        L46:
            if (r6 != r4) goto L49
            goto L4a
        L49:
            r4 = r5
        L4a:
            if (r4 != 0) goto L5b
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = "newUri.toString()"
            tn.p.j(r4, r6)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = bo.a0.W(r4, r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5c
        L5b:
            return r8
        L5c:
            return r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.UrlUtilsKt.parseUri(java.lang.String):android.net.Uri");
    }

    @NotNull
    public static final Uri removeQueryParameters(@NotNull Uri uri, @NotNull String... strArr) {
        p.k(uri, "<this>");
        p.k(strArr, "parameterNames");
        if (strArr.length == 0) {
            return uri;
        }
        Set setJ0 = r.J0(strArr);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!setJ0.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        p.j(uriBuild, "builder.build()");
        return uriBuild;
    }
}
