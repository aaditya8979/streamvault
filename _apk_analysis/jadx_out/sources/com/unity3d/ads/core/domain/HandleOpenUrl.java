package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import hn.c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandleOpenUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface HandleOpenUrl {

    /* JADX INFO: compiled from: HandleOpenUrl.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z10, c cVar, int i10, Object obj) {
            if (obj == null) {
                return handleOpenUrl.invoke(adObject, str, str2, (i10 & 8) != 0 ? "android.intent.action.VIEW" : str3, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? false : z10, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z10, @NotNull c<? super Boolean> cVar);
}
