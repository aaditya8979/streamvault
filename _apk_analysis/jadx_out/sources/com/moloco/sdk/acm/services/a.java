package com.moloco.sdk.acm.services;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f45883a = new a();

    public final boolean a(@NotNull String str) {
        p.k(str, "key");
        return Boolean.parseBoolean(b(str));
    }

    public final String b(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            p.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) objInvoke;
            try {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return str2;
        } catch (Exception unused2) {
            return null;
        }
    }
}
