package com.yandex.div.core.view2.divs;

import ah.c9;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivVisibilityAction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivSightExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivSightExtensionsKt {
    @NotNull
    public static final Expression<Long> getDuration(@NotNull c9 c9Var) {
        if (c9Var instanceof DivVisibilityAction) {
            return ((DivVisibilityAction) c9Var).f58248j;
        }
        if (c9Var instanceof DivDisappearAction) {
            return ((DivDisappearAction) c9Var).f55147a;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Trying to get duration field for unsupported DivSightAction class");
        }
        return Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    }
}
