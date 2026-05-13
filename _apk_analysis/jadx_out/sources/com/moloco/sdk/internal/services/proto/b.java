package com.moloco.sdk.internal.services.proto;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class b implements a {
    @Override // com.moloco.sdk.internal.services.proto.a
    @NotNull
    public String a(@NotNull UserIntent$UserAdInteractionExt userIntent$UserAdInteractionExt, int i10) {
        p.k(userIntent$UserAdInteractionExt, "input");
        String strEncodeToString = Base64.encodeToString(userIntent$UserAdInteractionExt.toByteArray(), i10);
        p.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
