package com.inmobi.media;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3678q7 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3603n7 f27941k = new C3603n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3580m9 f27947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J8 f27948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T7 f27949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f27950i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3628o7 f27951j = new C3628o7(this);

    public C3678q7(byte b10, String str, int i10, int i11, int i12, InterfaceC3580m9 interfaceC3580m9) {
        this.f27942a = b10;
        this.f27943b = str;
        this.f27944c = i10;
        this.f27945d = i11;
        this.f27946e = i12;
        this.f27947f = interfaceC3580m9;
    }

    public final J8 a(byte b10, AdConfig.ViewabilityConfig viewabilityConfig) {
        J8 j82 = this.f27948g;
        if (j82 != null) {
            return j82;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f27947f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b10));
        }
        T7 t72 = new T7(viewabilityConfig, b10, this.f27947f);
        InterfaceC3580m9 interfaceC3580m92 = this.f27947f;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b10));
        }
        J8 j83 = new J8(viewabilityConfig, t72, this.f27951j);
        this.f27948g = j83;
        return j83;
    }

    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27947f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "onActivityStarted");
        }
        J8 j82 = this.f27948g;
        if (j82 != null) {
            tn.p.j(j82.f25703d, "TAG");
            for (Map.Entry entry : j82.f25700a.entrySet()) {
                View view = (View) entry.getKey();
                H8 h82 = (H8) entry.getValue();
                T7 t72 = j82.f25702c;
                View view2 = h82.f25584a;
                int i10 = h82.f25585b;
                t72.getClass();
                tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                t72.a(view, view, view2, i10);
            }
            if (!j82.f25704e.hasMessages(0)) {
                j82.f25704e.postDelayed(j82.f25705f, j82.f25706g);
            }
            j82.f25702c.e();
        }
        T7 t73 = this.f27949h;
        if (t73 != null) {
            t73.e();
        }
    }

    public final void a(View view) {
        J8 j82;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f27947f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (tn.p.f(this.f27943b, "video") || tn.p.f(this.f27943b, "audio") || (j82 = this.f27948g) == null) {
            return;
        }
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        j82.f25700a.remove(view);
        j82.f25701b.remove(view);
        j82.f25702c.a(view);
        if (j82.f25700a.isEmpty()) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27947f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            J8 j83 = this.f27948g;
            if (j83 != null) {
                j83.f25700a.clear();
                j83.f25701b.clear();
                j83.f25702c.a();
                j83.f25704e.removeMessages(0);
                j83.f25702c.b();
            }
            this.f27948g = null;
        }
    }

    public final void a(View view, View view2, Ln ln2, AdConfig.ViewabilityConfig viewabilityConfig, boolean z10) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(view2, "token");
        tn.p.k(ln2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(viewabilityConfig, "config");
        InterfaceC3580m9 interfaceC3580m9 = this.f27947f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        T7 s32 = this.f27949h;
        if (s32 == null) {
            s32 = z10 ? new S3(viewabilityConfig, this.f27947f) : new T7(viewabilityConfig, (byte) 1, this.f27947f);
            this.f27949h = s32;
        }
        C3653p7 c3653p7 = new C3653p7(this);
        InterfaceC3580m9 interfaceC3580m92 = s32.f26331d;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).c(VisibilityTracker.TAG, "setVisibilityTrackerListener logger");
        }
        s32.f26335h = c3653p7;
        this.f27950i.put(view, ln2);
        int companionVisibilityMinPercentageViewed = z10 ? viewabilityConfig.getCompanionVisibilityMinPercentageViewed() : this.f27946e;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        s32.a(view, view, view2, companionVisibilityMinPercentageViewed);
    }

    public final void b(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f27947f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        T7 t72 = this.f27949h;
        if (t72 != null) {
            t72.a(view);
            if (t72.f26328a.isEmpty()) {
                InterfaceC3580m9 interfaceC3580m92 = this.f27947f;
                if (interfaceC3580m92 != null) {
                    ((C3605n9) interfaceC3580m92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                T7 t73 = this.f27949h;
                if (t73 != null) {
                    t73.b();
                }
                this.f27949h = null;
            }
        }
        this.f27950i.remove(view);
    }
}
