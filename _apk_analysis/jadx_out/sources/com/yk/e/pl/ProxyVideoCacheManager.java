package com.yk.e.pl;

import android.content.Context;
import z0.f;
import z0.p;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyVideoCacheManager {
    private static f sharedProxy;

    private ProxyVideoCacheManager() {
    }

    public static boolean clearAllCache(Context context) {
        getProxy(context);
        return p.b(sharedProxy.h());
    }

    public static boolean clearDefaultCache(Context context, String str) {
        getProxy(context);
        return p.a(sharedProxy.m(str).getAbsolutePath()) && p.a(sharedProxy.g(str).getAbsolutePath());
    }

    public static f getProxy(Context context) {
        f fVar = sharedProxy;
        if (fVar != null) {
            return fVar;
        }
        f fVarNewProxy = newProxy(context);
        sharedProxy = fVarNewProxy;
        return fVarNewProxy;
    }

    private static f newProxy(Context context) {
        return new f.b(context).c(536870912L).a();
    }
}
