package com.inmobi.media;

import android.os.HandlerThread;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class H6 {
    public static final void a(HandlerThread handlerThread, String str) {
        tn.p.k(handlerThread, "<this>");
        tn.p.k(str, "name");
        try {
            handlerThread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }

    public static final void a(kotlinx.coroutines.g gVar) {
        if (gVar == null || !gVar.isActive()) {
            return;
        }
        g.a.a(gVar, null, 1, null);
    }

    public static final boolean a(String str) {
        return str == null || bo.d0.s1(str).toString().length() == 0 || !(bo.a0.W(str, "http://", false, 2, null) || bo.a0.W(str, "https://", false, 2, null));
    }
}
