package com.unity3d.services.core.fid;

import android.content.Context;
import cn.p0;
import com.unity3d.services.core.reflection.GenericBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FIdStaticBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(p0.g(new Pair(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return Constants.Companion.getClassName();
    }

    @Nullable
    public final FIdBridge getInstance(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        Object objCallNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (objCallNonVoidMethod != null) {
            return new FIdBridge(objCallNonVoidMethod);
        }
        return null;
    }
}
