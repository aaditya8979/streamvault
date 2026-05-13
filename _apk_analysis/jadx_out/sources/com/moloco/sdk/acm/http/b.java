package com.moloco.sdk.acm.http;

import bn.r;
import gl.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final r a(String str, String str2, String str3, String str4, String str5, String str6, n nVar) {
        p.k(nVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("AppBundle/" + str + ';');
        }
        if (str2 != null) {
            sb2.append("AppVersion/" + str2 + ';');
        }
        if (str3 != null) {
            sb2.append("AppKey/" + str3 + ';');
        }
        String string = sb2.toString();
        p.j(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        if (str4 != null) {
            sb3.append("SdkVersion/" + str4 + ';');
        }
        if (str5 != null) {
            sb3.append("Mediator/" + str5 + ';');
        }
        String string2 = sb3.toString();
        p.j(string2, "toString(...)");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("OS/Android;");
        if (str6 != null) {
            sb4.append("osv/" + str6 + ';');
        }
        String string3 = sb4.toString();
        p.j(string3, "toString(...)");
        nVar.e("X-Moloco-App-Info", string);
        nVar.e("X-Moloco-Device-Info", string3);
        nVar.e("X-Moloco-SDK-Info", string2);
        return r.f5635a;
    }

    @NotNull
    public final l<n, r> b(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6) {
        return new l() { // from class: com.moloco.sdk.acm.http.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b.a(str4, str5, str3, str, str6, str2, (n) obj);
            }
        };
    }
}
