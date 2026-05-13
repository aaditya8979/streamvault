package com.fyber.inneractive.sdk.nativead;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.f;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f16935f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f16937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16938c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f16939d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16940e = new a(this);

    public static File a(b bVar) {
        String externalStorageState;
        File externalCacheDir;
        String externalStorageState2 = "";
        Context context = bVar.f16936a;
        if (context != null && !TextUtils.isEmpty("assets")) {
            if (o.f19548a != null && o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    externalStorageState = "";
                }
                if ("mounted".equals(externalStorageState)) {
                    try {
                        externalStorageState2 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 41943040) {
                        return new File(context.getExternalCacheDir(), "assets");
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 41943040) {
                return new File(context.getCacheDir(), "assets");
            }
        }
        return null;
    }

    public final void a() {
        boolean z10;
        g gVar = this.f16937b;
        if (gVar != null) {
            synchronized (gVar) {
                z10 = gVar.f17118i == null;
            }
            if (!z10) {
                try {
                    this.f16937b.close();
                    this.f16938c = false;
                    return;
                } catch (Throwable th2) {
                    IAlog.f("%s: destroy: Error closing cache: %s", "NativeCache", th2);
                    return;
                }
            }
        }
        IAlog.c("%s: destroy: cache already closed or not exists", "NativeCache");
    }

    @Override // com.fyber.inneractive.sdk.player.cache.f
    public final boolean a(String str) {
        Iterator it = this.f16939d.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
