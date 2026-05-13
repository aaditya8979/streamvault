package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f25483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f25485c;

    public Fn(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "container");
        this.f25483a = gestureDetectorOnGestureListenerC3337ci;
        this.f25485c = gestureDetectorOnGestureListenerC3337ci.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public abstract View c();

    public abstract void d();
}
