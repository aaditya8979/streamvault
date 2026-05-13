package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4986nc extends AbstractC4768f {
    public C4986nc(Context context, Cg cg2) {
        super(context, cg2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4768f
    public final void b(@NonNull Q5 q52, @NonNull C5053q4 c5053q4) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(c5053q4.f67560b.f67491b, Boolean.FALSE)).booleanValue();
        Lb lbM = C5009oa.I.m();
        lbM.a(zBooleanValue);
        lbM.a(c5053q4.f67560b.f67492c);
        Boolean bool = c5053q4.f67560b.f67503n;
        if (bool != null) {
            C5009oa.I.c().b(bool.booleanValue());
        }
        this.f66718b.a(q52, c5053q4);
    }
}
