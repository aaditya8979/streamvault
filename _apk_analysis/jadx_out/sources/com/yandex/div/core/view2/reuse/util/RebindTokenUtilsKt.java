package com.yandex.div.core.view2.reuse.util;

import com.yandex.div.core.view2.reuse.ExistingToken;
import com.yandex.div.core.view2.reuse.NewToken;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RebindTokenUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RebindTokenUtilsKt {
    @NotNull
    public static final ExistingToken combineTokens(@NotNull ExistingToken existingToken, @NotNull NewToken newToken) {
        return new ExistingToken(newToken.getItem(), newToken.getChildIndex(), existingToken.getView(), existingToken.getParentToken());
    }
}
