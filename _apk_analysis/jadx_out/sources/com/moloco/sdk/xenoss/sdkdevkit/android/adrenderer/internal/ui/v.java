package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<a.AbstractC0696a.c.EnumC0698a, a.AbstractC0696a.c> f49254b = new LinkedHashMap();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        this.f49254b.put(cVar.c(), cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        this.f49254b.remove(enumC0698a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s
    @NotNull
    public List<a.AbstractC0696a.c> p() {
        List listE = cn.r0.E(this.f49254b);
        ArrayList arrayList = new ArrayList(cn.x.x(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add((a.AbstractC0696a.c) ((Pair) it.next()).getSecond());
        }
        return arrayList;
    }
}
