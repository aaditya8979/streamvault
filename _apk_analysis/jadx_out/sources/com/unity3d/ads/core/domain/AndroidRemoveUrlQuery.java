package com.unity3d.ads.core.domain;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidRemoveUrlQuery.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    @NotNull
    public String invoke(@NotNull String str) {
        p.k(str, "url");
        String string = Uri.parse(str).buildUpon().clearQuery().build().toString();
        p.j(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
