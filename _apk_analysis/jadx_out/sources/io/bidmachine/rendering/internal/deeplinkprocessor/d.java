package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.deeplinkprocessor.b;
import io.bidmachine.rendering.internal.r;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70380c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidNativeFeatureUrlParser f70381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f70382b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, r rVar) {
        p.k(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        p.k(rVar, "pictureDownloader");
        this.f70381a = mraidNativeFeatureUrlParser;
        this.f70382b = rVar;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Uri storePictureUri = this.f70381a.parseStorePictureUri(uri);
        if (storePictureUri == null) {
            CommonLog.e("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        } else {
            r rVar = this.f70382b;
            Context applicationContext = context.getApplicationContext();
            p.j(applicationContext, "context.applicationContext");
            rVar.a(applicationContext, storePictureUri, executable);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, String str, Executable executable) {
        b.a.a(this, context, str, executable);
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return p.f("storePicture", uri.getScheme());
    }
}
