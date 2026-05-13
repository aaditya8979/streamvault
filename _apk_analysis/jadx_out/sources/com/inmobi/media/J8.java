package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f25700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f25701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f25702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f25704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I8 f25705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3628o7 f25707h;

    public J8(AdConfig.ViewabilityConfig viewabilityConfig, T7 t72, C3628o7 c3628o7) {
        tn.p.k(viewabilityConfig, "viewabilityConfig");
        tn.p.k(t72, "visibilityTracker");
        tn.p.k(c3628o7, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f25700a = weakHashMap;
        this.f25701b = weakHashMap2;
        this.f25702c = t72;
        this.f25703d = J8.class.getSimpleName();
        this.f25706g = viewabilityConfig.getImpressionPollIntervalMillis();
        G8 g82 = new G8(this);
        InterfaceC3580m9 interfaceC3580m9 = t72.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "setVisibilityTrackerListener logger");
        }
        t72.f26335h = g82;
        this.f25704e = handler;
        this.f25705f = new I8(this);
        this.f25707h = c3628o7;
    }

    public final void a(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f25700a.remove(view);
        this.f25701b.remove(view);
        this.f25702c.a(view);
    }
}
