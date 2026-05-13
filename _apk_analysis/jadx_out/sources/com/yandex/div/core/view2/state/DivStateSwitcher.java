package com.yandex.div.core.view2.state;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivStateSwitcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface DivStateSwitcher {
    void switchStates(@NotNull DivData.State state, @NotNull List<DivStatePath> list, @NotNull ExpressionResolver expressionResolver) throws StateConflictException;
}
