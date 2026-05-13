package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.util.Executable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public interface b {

    public static final class a {
        public static void a(b bVar, Context context, String str, Executable executable) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "url");
            bVar.a(context, UrlHandler.parseUrl(str), executable);
        }
    }

    void a(Context context, Uri uri, Executable executable);

    void a(Context context, String str, Executable executable);

    boolean a(Uri uri);
}
