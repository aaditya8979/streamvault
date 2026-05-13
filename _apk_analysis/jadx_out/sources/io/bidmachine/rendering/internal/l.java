package io.bidmachine.rendering.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.rendering.internal.l;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import io.bidmachine.util.appintents.IntentUtils;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f70511b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f70512a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public l() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f70512a = executorServiceNewSingleThreadExecutor;
    }

    private final Intent a(Intent intent) {
        Intent flags = Intent.createChooser(intent, "").setFlags(268435456);
        tn.p.j(flags, "createChooser(intent, \"\"…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    private final Intent a(MraidCalendarEvent mraidCalendarEvent) {
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", mraidCalendarEvent.getDescription()).putExtra("beginTime", mraidCalendarEvent.getStart().getTime());
        tn.p.j(intentPutExtra, "Intent(Intent.ACTION_INS…CalendarEvent.start.time)");
        Date end = mraidCalendarEvent.getEnd();
        if (end != null) {
            intentPutExtra.putExtra("endTime", end.getTime());
        }
        String summary = mraidCalendarEvent.getSummary();
        if (summary != null) {
            intentPutExtra.putExtra(UnifiedMediationParams.KEY_DESCRIPTION, summary);
        }
        String location = mraidCalendarEvent.getLocation();
        if (location != null) {
            intentPutExtra.putExtra("eventLocation", location);
        }
        String status = mraidCalendarEvent.getStatus();
        int i10 = 2;
        if (status != null) {
            intentPutExtra.putExtra("eventStatus", tn.p.f(status, "confirmed") ? 1 : tn.p.f(status, "cancelled") ? 2 : 0);
        }
        String transparency = mraidCalendarEvent.getTransparency();
        if (transparency != null) {
            if (tn.p.f(transparency, C3978d4.i.T)) {
                i10 = 1;
            } else if (tn.p.f(transparency, "opaque")) {
                i10 = 0;
            }
            intentPutExtra.putExtra("availability", i10);
        }
        String recurrence = mraidCalendarEvent.getRecurrence();
        if (recurrence != null) {
            intentPutExtra.putExtra("rrule", recurrence);
        }
        return intentPutExtra;
    }

    private final void a(Context context, Intent intent, Executable executable) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            UiUtils.onUiThreadWithArgSafely(Boolean.TRUE, executable);
        } catch (Exception e10) {
            o.b(e10);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l lVar, Context context, Uri uri, Executable executable) {
        tn.p.k(lVar, "this$0");
        tn.p.k(uri, "$uri");
        tn.p.j(context, "applicationContext");
        lVar.c(context, uri, executable);
    }

    private final void b(Context context, final Uri uri, final Executable executable) {
        final Context applicationContext = context.getApplicationContext();
        this.f70512a.execute(new Runnable() { // from class: hk.c
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f63510b, applicationContext, uri, executable);
            }
        });
    }

    private final void b(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        a(context, a(a(mraidCalendarEvent)), executable);
    }

    private final void c(Context context, Uri uri, Executable executable) {
        IntentUtils.findEndpointAndOpenUrl(context, uri.toString(), executable);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "io.bidmachine");
        context.startActivity(intent);
    }

    public final void a(Context context, Uri uri, Executable executable) {
        Boolean boolValueOf;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        if (uri == null) {
            o.a("IntentLauncher", "launch - Uri is null", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        } else {
            if (Utils.isHttpUri(uri)) {
                b(context, uri, executable);
                return;
            }
            if (uri.getScheme() != null) {
                boolValueOf = Boolean.valueOf(IntentUtils.openUrl(context, uri.toString()));
            } else {
                o.a("IntentLauncher", "launch - Invalid uri: %s", uri);
                boolValueOf = Boolean.FALSE;
            }
            UiUtils.onUiThreadWithArgSafely(boolValueOf, executable);
        }
    }

    public final void a(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(mraidCalendarEvent, "mraidCalendarEvent");
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "applicationContext");
        b(applicationContext, mraidCalendarEvent, executable);
    }
}
