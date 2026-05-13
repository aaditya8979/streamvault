package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public w f47568b;

    public y(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47567a = context;
    }

    @Override // com.moloco.sdk.internal.services.x
    @NotNull
    public w invoke() {
        Object objM7534constructorimpl;
        w wVar = this.f47568b;
        if (wVar != null) {
            return wVar;
        }
        try {
            Result.a aVar = Result.Companion;
            Context context = this.f47567a;
            String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo packageInfoA = a0.a(this.f47567a);
            String str = packageInfoA.packageName;
            tn.p.j(str, HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            String str2 = packageInfoA.versionName;
            tn.p.j(str2, "versionName");
            w wVar2 = new w(string, str, str2);
            this.f47568b = wVar2;
            objM7534constructorimpl = Result.m7534constructorimpl(wVar2);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        w wVar3 = (w) objM7534constructorimpl;
        return wVar3 == null ? new w("", "", "") : wVar3;
    }
}
