package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3871y1 extends AbstractC3750t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityManager f28561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ea f28562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3871y1(Context context, C3775u5 c3775u5, long j10, int i10) {
        super(c3775u5);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3775u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f28558b = context;
        this.f28559c = j10;
        this.f28560d = i10;
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f28561e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        this.f28562f = Da.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void a() {
        AbstractC3492il.a(new C3846x1(this, null));
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void b() {
    }
}
