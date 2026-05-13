package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.deeplinkprocessor.b;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements io.bidmachine.rendering.internal.deeplinkprocessor.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0829a f70371a = new C0829a(null);

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.deeplinkprocessor.a$a, reason: collision with other inner class name */
    public static final class C0829a {
        private C0829a() {
        }

        public /* synthetic */ C0829a(i iVar) {
            this();
        }
    }

    public static final class b implements Executable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f70372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executable f70373b;

        public b(Uri uri, Executable executable) {
            p.k(uri, "baseUri");
            this.f70372a = uri;
            this.f70373b = executable;
        }

        public void a(boolean z10) {
            if (z10) {
                UrlHandler.track$bidmachine_android_rendering_d_2_5_2(this.f70372a.getQueryParameter("fallbackTrackingUrl"));
            }
            UiUtils.onUiThreadWithArgSafely(Boolean.valueOf(z10), this.f70373b);
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ boolean executeSafely(@Nullable Object obj) {
            return super.executeSafely(obj);
        }
    }

    public static final class c implements Executable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f70374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executable f70375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f70376c;

        public c(Context context, Uri uri, Executable executable) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(uri, "baseUri");
            this.f70374a = uri;
            this.f70375b = executable;
            Context applicationContext = context.getApplicationContext();
            p.j(applicationContext, "context.applicationContext");
            this.f70376c = applicationContext;
        }

        public void a(boolean z10) {
            if (z10) {
                UrlHandler.track$bidmachine_android_rendering_d_2_5_2(this.f70374a.getQueryParameter("primaryTrackingUrl"));
                UiUtils.onUiThreadWithArgSafely(Boolean.TRUE, this.f70375b);
                return;
            }
            String queryParameter = this.f70374a.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, this.f70375b);
                return;
            }
            Uri validUri = Utils.getValidUri(queryParameter);
            if (validUri == null) {
                UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, this.f70375b);
            } else {
                UrlHandler.openBrowser(this.f70376c, validUri, new b(this.f70374a, this.f70375b));
            }
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ boolean executeSafely(@Nullable Object obj) {
            return super.executeSafely(obj);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (TextUtils.isEmpty(queryParameter)) {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
            return;
        }
        Uri validUri = Utils.getValidUri(queryParameter);
        if (validUri != null) {
            UrlHandler.openBrowser(context, validUri, new c(context, uri, executable));
        } else {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, String str, Executable executable) {
        b.a.a(this, context, str, executable);
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return p.f("bmlink", uri.getScheme());
    }
}
