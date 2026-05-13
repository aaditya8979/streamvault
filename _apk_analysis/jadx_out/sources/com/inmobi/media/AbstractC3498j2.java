package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3498j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27375a;

    public AbstractC3498j2(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f27375a = context;
    }

    public abstract Object a(FrameLayout frameLayout, C3533kc c3533kc);

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract void a();

    public abstract void a(go.l lVar);

    public abstract void b();
}
