package com.yandex.div.core.expression;

import com.yandex.div2.DivVariable;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeStoreProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeStoreProviderKt {
    @NotNull
    public static final String getName(@NotNull DivVariable divVariable) {
        if (divVariable instanceof DivVariable.b) {
            return ((DivVariable.b) divVariable).c().f54042a;
        }
        if (divVariable instanceof DivVariable.f) {
            return ((DivVariable.f) divVariable).c().f58300a;
        }
        if (divVariable instanceof DivVariable.g) {
            return ((DivVariable.g) divVariable).c().f58621a;
        }
        if (divVariable instanceof DivVariable.i) {
            return ((DivVariable.i) divVariable).c().f58672a;
        }
        if (divVariable instanceof DivVariable.c) {
            return ((DivVariable.c) divVariable).c().f54058a;
        }
        if (divVariable instanceof DivVariable.j) {
            return ((DivVariable.j) divVariable).c().f58688a;
        }
        if (divVariable instanceof DivVariable.e) {
            return ((DivVariable.e) divVariable).c().f54088a;
        }
        if (divVariable instanceof DivVariable.a) {
            return ((DivVariable.a) divVariable).c().f54026a;
        }
        if (divVariable instanceof DivVariable.h) {
            return ((DivVariable.h) divVariable).c().f58639b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
