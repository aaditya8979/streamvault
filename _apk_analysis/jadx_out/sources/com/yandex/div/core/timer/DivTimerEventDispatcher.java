package com.yandex.div.core.timer;

import bn.r;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTimerEventDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivTimerEventDispatcher {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, TimerController> timerControllers = new LinkedHashMap();

    @NotNull
    private final Set<String> activeTimerIds = new LinkedHashSet();

    public DivTimerEventDispatcher(@NotNull ErrorCollector errorCollector) {
        this.errorCollector = errorCollector;
    }

    public final void addTimerController(@NotNull TimerController timerController) {
        String str = timerController.getDivTimer().f57964c;
        if (this.timerControllers.containsKey(str)) {
            return;
        }
        this.timerControllers.put(str, timerController);
    }

    public final void changeState(@NotNull String str, @NotNull String str2) {
        r rVar;
        TimerController timerController = getTimerController(str);
        if (timerController != null) {
            timerController.applyCommand(str2);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.errorCollector.logError(new IllegalArgumentException("Timer with id '" + str + "' does not exist!"));
        }
    }

    @Nullable
    public final TimerController getTimerController(@NotNull String str) {
        if (this.activeTimerIds.contains(str)) {
            return this.timerControllers.get(str);
        }
        return null;
    }

    public final void onAttach(@NotNull Div2View div2View) {
        Iterator<T> it = this.activeTimerIds.iterator();
        while (it.hasNext()) {
            TimerController timerController = this.timerControllers.get((String) it.next());
            if (timerController != null && !timerController.isAttachedToView(div2View)) {
                timerController.onAttach(div2View);
            }
        }
    }

    public final void onDetach(@NotNull Div2View div2View) {
        Iterator<T> it = this.timerControllers.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).onDetach(div2View);
        }
    }

    public final void setActiveTimerIds(@NotNull List<String> list) {
        Map<String, TimerController> map = this.timerControllers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TimerController> entry : map.entrySet()) {
            if (!list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).reset();
        }
        this.activeTimerIds.clear();
        this.activeTimerIds.addAll(list);
    }
}
