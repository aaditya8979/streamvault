package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f50975b;

    public b(@NotNull f fVar) {
        tn.p.k(fVar, "delegate");
        this.f50975b = fVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str) {
        tn.p.k(str, "url");
        this.f50975b.a(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str, @NotNull byte[] bArr, @NotNull gl.f fVar, @Nullable String str2) {
        tn.p.k(str, "url");
        tn.p.k(bArr, "body");
        tn.p.k(fVar, "contentType");
        f.a.a(this.f50975b, str, bArr, fVar, null, 8, null);
    }
}
