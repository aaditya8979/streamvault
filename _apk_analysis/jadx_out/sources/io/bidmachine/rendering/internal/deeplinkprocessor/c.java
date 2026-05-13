package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.deeplinkprocessor.b;
import io.bidmachine.rendering.internal.l;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70377c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidNativeFeatureUrlParser f70378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f70379b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public c(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, l lVar) {
        p.k(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        p.k(lVar, "intentLauncher");
        this.f70378a = mraidNativeFeatureUrlParser;
        this.f70379b = lVar;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        MraidCalendarEvent calendarEvent = this.f70378a.parseCalendarEvent(uri);
        if (calendarEvent != null) {
            this.f70379b.a(context, calendarEvent, executable);
        } else {
            CommonLog.e("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
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
        return p.f("calendar", uri.getScheme());
    }
}
