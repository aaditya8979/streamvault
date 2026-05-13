package io.bidmachine.rendering.internal;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.Background;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {
    public static final z a(Background background, Context context, io.bidmachine.rendering.internal.repository.a aVar) {
        tn.p.k(background, "<this>");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "repository");
        return new z(context, aVar, background);
    }
}
