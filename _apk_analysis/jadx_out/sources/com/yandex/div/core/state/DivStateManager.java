package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import bn.r;
import com.yandex.div.DivDataTag;
import com.yandex.div.state.DivStateCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivStateManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@AnyThread
public final class DivStateManager {

    @NotNull
    private final DivStateCache cache;

    @NotNull
    private final ArrayMap<DivDataTag, DivViewState> states = new ArrayMap<>();

    @NotNull
    private final TemporaryDivStateCache temporaryCache;

    public DivStateManager(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache) {
        this.cache = divStateCache;
        this.temporaryCache = temporaryDivStateCache;
    }

    @Nullable
    public final DivViewState getState(@NotNull DivDataTag divDataTag) {
        DivViewState divViewState;
        synchronized (this.states) {
            divViewState = this.states.get(divDataTag);
            if (divViewState == null) {
                String rootState = this.cache.getRootState(divDataTag.getId());
                divViewState = rootState != null ? new DivViewState(Long.parseLong(rootState)) : null;
                this.states.put(divDataTag, divViewState);
            }
        }
        return divViewState;
    }

    public final void updateState(@NotNull DivDataTag divDataTag, long j10, boolean z10) {
        if (p.f(DivDataTag.INVALID, divDataTag)) {
            return;
        }
        synchronized (this.states) {
            DivViewState state = getState(divDataTag);
            this.states.put(divDataTag, state == null ? new DivViewState(j10) : new DivViewState(j10, state.getBlockStates()));
            this.temporaryCache.putRootState(divDataTag.getId(), String.valueOf(j10));
            if (!z10) {
                this.cache.putRootState(divDataTag.getId(), String.valueOf(j10));
            }
            r rVar = r.f5635a;
        }
    }

    public final void updateStates(@NotNull String str, @NotNull DivStatePath divStatePath, boolean z10) {
        String pathToLastState = divStatePath.getPathToLastState();
        String lastStateId = divStatePath.getLastStateId();
        if (pathToLastState == null || lastStateId == null) {
            return;
        }
        synchronized (this.states) {
            this.temporaryCache.putState(str, pathToLastState, lastStateId);
            if (!z10) {
                this.cache.putState(str, pathToLastState, lastStateId);
            }
            r rVar = r.f5635a;
        }
    }
}
