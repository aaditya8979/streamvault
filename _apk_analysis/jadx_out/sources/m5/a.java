package m5;

import a6.k0;
import android.net.Uri;

/* JADX INFO: compiled from: SsUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static Uri a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return (lastPathSegment == null || !k0.K0(lastPathSegment).matches("manifest(\\(.+\\))?")) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }
}
