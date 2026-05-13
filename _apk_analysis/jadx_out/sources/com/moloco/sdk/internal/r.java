package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MediationInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final void a(@NotNull gl.n nVar, @Nullable String str, @Nullable String str2, @Nullable MediationInfo mediationInfo) {
        tn.p.k(nVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb2.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb2.append("Android/" + str2 + ';');
        }
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        nVar.e("X-Moloco-User-Agent", string);
    }

    public static /* synthetic */ void b(gl.n nVar, String str, String str2, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mediationInfo = null;
        }
        a(nVar, str, str2, mediationInfo);
    }
}
