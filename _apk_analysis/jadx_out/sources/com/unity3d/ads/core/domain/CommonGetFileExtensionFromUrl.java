package com.unity3d.ads.core.domain;

import bo.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonGetFileExtensionFromUrl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {

    @NotNull
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(@NotNull RemoveUrlQuery removeUrlQuery) {
        p.k(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    @NotNull
    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    @Nullable
    public String invoke(@NotNull String str) {
        p.k(str, "url");
        String strInvoke = this.removeUrlQuery.invoke(str);
        if (strInvoke == null) {
            return null;
        }
        String strH1 = d0.h1(strInvoke, '/', null, 2, null);
        if (!d0.b0(strH1, '.', false, 2, null)) {
            return null;
        }
        String strH12 = d0.h1(strH1, '.', null, 2, null);
        if (strH12.length() == 0) {
            return null;
        }
        return strH12;
    }
}
