package com.moloco.sdk.internal;

import android.net.Uri;
import com.ironsource.C4157n2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f46240a;

    public j(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar) {
        tn.p.k(lVar, "persistentHttpRequest");
        this.f46240a = lVar;
    }

    @Override // com.moloco.sdk.internal.i
    public void a(@NotNull String str) {
        tn.p.k(str, C4157n2.f33016y);
        try {
            Uri uri = Uri.parse(str);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar = this.f46240a;
            String string = uri.toString();
            tn.p.j(string, "toString(...)");
            lVar.a(string);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e10.toString(), null, false, 12, null);
        }
    }
}
