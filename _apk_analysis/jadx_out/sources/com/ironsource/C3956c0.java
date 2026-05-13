package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3956c0 implements InterfaceC3938b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ac f31086a;

    public C3956c0(@NotNull Ac ac2) {
        tn.p.k(ac2, "networkShowApi");
        this.f31086a = ac2;
    }

    @Override // com.ironsource.InterfaceC3938b0
    public void a(@NotNull Activity activity, @NotNull O9 o92) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(o92, C3978d4.i.f31356p0);
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + o92.g() + " adInstanceId=" + o92.e());
        this.f31086a.a(activity, o92, new HashMap());
    }

    @Override // com.ironsource.InterfaceC3938b0
    public boolean a(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        return this.f31086a.a(o92);
    }
}
