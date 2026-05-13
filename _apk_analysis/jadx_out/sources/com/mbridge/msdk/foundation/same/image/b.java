package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: CommonImageLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f37762a;

    public b(Context context) {
    }

    public static b a(Context context) {
        if (f37762a == null) {
            f37762a = new b(context);
        }
        return f37762a;
    }

    public void a() {
    }

    public void a(String str) {
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public void b() {
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }
}
