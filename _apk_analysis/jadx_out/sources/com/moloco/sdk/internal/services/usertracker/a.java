package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
public final class a implements d {
    @Override // com.moloco.sdk.internal.services.usertracker.d
    @NotNull
    public String a() {
        String string = UUID.randomUUID().toString();
        p.j(string, "toString(...)");
        return string;
    }
}
