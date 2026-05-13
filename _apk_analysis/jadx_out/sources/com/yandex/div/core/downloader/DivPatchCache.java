package com.yandex.div.core.downloader;

import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div2.Div;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivPatchCache.kt */
/* JADX INFO: loaded from: classes11.dex */
public class DivPatchCache {

    @NotNull
    private final ArrayMap<DivDataTag, DivPatchMap> patches = new ArrayMap<>();

    @Nullable
    public DivPatchMap getPatch(@NotNull DivDataTag divDataTag) {
        return this.patches.get(divDataTag);
    }

    @Nullable
    public List<Div> getPatchDivListById(@NotNull DivDataTag divDataTag, @NotNull String str) {
        DivPatchMap divPatchMap = this.patches.get(divDataTag);
        if (divPatchMap == null) {
            return null;
        }
        return divPatchMap.getPatches().get(str);
    }
}
