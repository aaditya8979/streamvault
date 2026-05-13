package io.bidmachine.rendering.internal.adform.progress;

import android.content.Context;
import android.view.View;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.view.c;
import io.bidmachine.rendering.model.AdElementParams;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f70059r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, io.bidmachine.rendering.internal.adform.c cVar, b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "repository");
        p.k(adElementParams, "adElementParams");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        this.f70059r = new c(context);
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.s
    public void a(long j10, long j11, float f10) {
        this.f70059r.a(j10, j11, f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f70059r;
    }
}
