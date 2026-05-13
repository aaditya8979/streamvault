package com.google.android.exoplayer.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer.upstream.DataSourceException;
import java.io.IOException;
import y5.h;

/* JADX INFO: compiled from: CacheUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5.d f21108a = new z5.d() { // from class: z5.f
        @Override // z5.d
        public final String a(y5.h hVar) {
            return com.google.android.exoplayer.upstream.cache.d.d(hVar);
        }
    };

    public static String b(Uri uri) {
        return uri.toString();
    }

    public static boolean c(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String d(h hVar) {
        String str = hVar.f87277h;
        return str != null ? str : b(hVar.f87270a);
    }
}
