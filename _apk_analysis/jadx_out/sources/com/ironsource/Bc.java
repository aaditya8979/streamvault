package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(@NotNull Activity activity, @NotNull O9 o92, @NotNull Map<String, String> map) throws Exception {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(map, "showParams");
        IronSourceNetwork.showAd(activity, o92, map);
    }

    @Override // com.ironsource.Ac
    public boolean a(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        return IronSourceNetwork.isAdAvailableForInstance(o92);
    }
}
