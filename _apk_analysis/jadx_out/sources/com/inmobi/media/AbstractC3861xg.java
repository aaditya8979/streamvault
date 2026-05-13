package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3861xg extends Sn {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f28522l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3861xg(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3580m9 interfaceC3580m9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b10, interfaceC3580m9);
        C3603n7 c3603n7 = C3678q7.f27941k;
        tn.p.k(c3603n7, "visibilityChecker");
        tn.p.k(c3603n7, "visibilityChecker");
        this.f28522l = viewabilityConfig;
    }
}
