package com.yandex.div.core.downloader;

import android.view.View;
import cn.p0;
import cn.x;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div2.Div;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.a;
import zn.n;

/* JADX INFO: compiled from: DivPatchManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public class DivPatchManager {

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final a<Div2Builder> divViewCreator;

    public DivPatchManager(@NotNull DivPatchCache divPatchCache, @NotNull a<Div2Builder> aVar) {
        this.divPatchCache = divPatchCache;
        this.divViewCreator = aVar;
    }

    @Nullable
    public List<View> buildViewsForId(@NotNull BindingContext bindingContext, @NotNull String str) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(x.x(patchDivListById, 10));
        Iterator<T> it = patchDivListById.iterator();
        while (it.hasNext()) {
            arrayList.add(this.divViewCreator.get().buildView((Div) it.next(), bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    @Nullable
    public Map<Div, View> createViewsForId(@NotNull BindingContext bindingContext, @NotNull String str) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(p0.f(x.x(patchDivListById, 10)), 16));
        for (Object obj : patchDivListById) {
            linkedHashMap.put(obj, this.divViewCreator.get().createView((Div) obj, bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }
}
