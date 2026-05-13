package com.yandex.div.core.timer;

import cn.x;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTimerEventDispatcherProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivTimerEventDispatcherProvider {
    private final Map<String, DivTimerEventDispatcher> controllers = Collections.synchronizedMap(new LinkedHashMap());

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivTimerEventDispatcherProvider(@NotNull DivActionBinder divActionBinder, @NotNull ErrorCollectors errorCollectors) {
        this.divActionBinder = divActionBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void invalidateTimersSet(DivTimerEventDispatcher divTimerEventDispatcher, List<DivTimer> list, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        for (DivTimer divTimer : list) {
            if (!(divTimerEventDispatcher.getTimerController(divTimer.f57964c) != null)) {
                divTimerEventDispatcher.addTimerController(toTimerController(divTimer, errorCollector, expressionResolver));
            }
        }
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivTimer) it.next()).f57964c);
        }
        divTimerEventDispatcher.setActiveTimerIds(arrayList);
    }

    private final TimerController toTimerController(DivTimer divTimer, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        return new TimerController(divTimer, this.divActionBinder, errorCollector, expressionResolver);
    }

    @Nullable
    public final DivTimerEventDispatcher getOrCreate$div_release(@NotNull DivDataTag divDataTag, @NotNull DivData divData, @NotNull ExpressionResolver expressionResolver) {
        List<DivTimer> list = divData.f55083d;
        if (list == null) {
            return null;
        }
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divDataTag, divData);
        Map<String, DivTimerEventDispatcher> map = this.controllers;
        String id2 = divDataTag.getId();
        DivTimerEventDispatcher divTimerEventDispatcher = map.get(id2);
        if (divTimerEventDispatcher == null) {
            divTimerEventDispatcher = new DivTimerEventDispatcher(orCreate);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divTimerEventDispatcher.addTimerController(toTimerController((DivTimer) it.next(), orCreate, expressionResolver));
            }
            map.put(id2, divTimerEventDispatcher);
        }
        DivTimerEventDispatcher divTimerEventDispatcher2 = divTimerEventDispatcher;
        invalidateTimersSet(divTimerEventDispatcher2, list, orCreate, expressionResolver);
        return divTimerEventDispatcher2;
    }
}
