package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33617b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.s f33618a;

    public b(v.s sVar) {
        this.f33618a = sVar;
    }

    public void a(String str) {
        v.s sVar = this.f33618a;
        if (sVar != null) {
            sVar.c(str);
        }
    }

    public synchronized void a(String str, String str2) throws Exception {
        if (this.f33618a == null) {
            Logger.e(f33617b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f33618a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }

    public void b(String str) {
        v.s sVar = this.f33618a;
        if (sVar != null) {
            sVar.d(str);
        }
    }
}
