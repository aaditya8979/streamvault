package com.moloco.sdk.internal;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f46083a;

    public i0(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar) {
        tn.p.k(lVar, "persistentHttpRequest");
        this.f46083a = lVar;
    }

    @Override // com.moloco.sdk.internal.h0
    public boolean a(@NotNull String str, long j10, @Nullable c0 c0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVarB;
        tn.p.k(str, "url");
        if (c0Var != null) {
            try {
                cVarB = c0Var.b();
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e10.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVarB = null;
        }
        Uri uriBuild = Uri.parse(b(str, j10, cVarB)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar = this.f46083a;
        String string = uriBuild.toString();
        tn.p.j(string, "toString(...)");
        lVar.a(string);
        return true;
    }

    public final String b(String str, long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String strC;
        if (cVar != null && (strC = com.moloco.sdk.internal.utils.d.c(str, cVar.a())) != null) {
            str = strC;
        }
        return com.moloco.sdk.internal.utils.d.b(str, j10);
    }
}
