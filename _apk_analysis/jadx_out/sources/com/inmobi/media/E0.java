package com.inmobi.media;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.E0;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static A0 f25353b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p000do.l0 f25356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p000do.l0 f25357f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f25352a = kotlin.b.b(new sn.a() { // from class: n9.v
        @Override // sn.a
        public final Object invoke() {
            return E0.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bn.g f25354c = kotlin.b.b(new sn.a() { // from class: n9.w
        @Override // sn.a
        public final Object invoke() {
            return E0.b();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f25355d = new B0();

    public static final H0 a() {
        return new H0(AbstractC3456h9.b());
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        tn.p.k(str, "url");
        tn.p.k(jSONObject, "extras");
        tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        gestureDetectorOnGestureListenerC3337ci.getAdQualityManager().a(activity, str, z10, jSONObject, qh2);
        A0 a02 = f25353b;
        if (a02 == null) {
            tn.p.C("executor");
            a02 = null;
        }
        a02.getClass();
        tn.p.k(str, "beaconUrl");
        tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        a02.f25127c.put(str, new WeakReference(qh2));
        String creativeID = gestureDetectorOnGestureListenerC3337ci.getCreativeID();
        if (creativeID.length() > 0) {
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f26611a.a(AdConfig.class);
            bn.g gVar = f25354c;
            if (((CopyOnWriteArrayList) gVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) gVar.getValue()).add(creativeID);
            }
        }
    }

    public static void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "adView");
        tn.p.k(gestureDetectorOnGestureListenerC3337ci2, "renderView");
        tn.p.k(str, "url");
        tn.p.k(jSONObject, "extras");
        tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        gestureDetectorOnGestureListenerC3337ci2.getAdQualityManager().a(gestureDetectorOnGestureListenerC3337ci, str, z10, jSONObject, qh2);
        A0 a02 = f25353b;
        if (a02 == null) {
            tn.p.C("executor");
            a02 = null;
        }
        a02.getClass();
        tn.p.k(str, "beaconUrl");
        tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        a02.f25127c.put(str, new WeakReference(qh2));
        String creativeID = gestureDetectorOnGestureListenerC3337ci2.getCreativeID();
        if (creativeID.length() > 0) {
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f26611a.a(AdConfig.class);
            bn.g gVar = f25354c;
            if (((CopyOnWriteArrayList) gVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) gVar.getValue()).add(creativeID);
            }
        }
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }
}
