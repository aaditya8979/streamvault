package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cn.f0;
import com.yandex.div2.Div;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: ReusableTokenList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReusableTokenList {

    @NotNull
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();

    @NotNull
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final void add(@NotNull ExistingToken existingToken) {
        int divHash = existingToken.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> map = this.reusable;
        Integer numValueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = map.get(numValueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            map.put(numValueOf, linkedList);
        }
        linkedList.add(existingToken);
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }

    @Nullable
    public final View getUniqueViewForDiv(@NotNull Div div) {
        ExistingToken existingToken;
        int iPropertiesHash = div.propertiesHash();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer numValueOf = Integer.valueOf(iPropertiesHash);
        Integer num = map.get(numValueOf);
        if (num == null) {
            num = 0;
            map.put(numValueOf, num);
        }
        int iIntValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(iPropertiesHash));
        if (linkedList == null || (existingToken = (ExistingToken) f0.w0(linkedList, iIntValue)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(iPropertiesHash), Integer.valueOf(iIntValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    @Nullable
    public final ExistingToken pop(int i10) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(i10));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken existingTokenPop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(i10));
        if (linkedList2 == null || linkedList2.isEmpty()) {
            this.reusable.remove(Integer.valueOf(i10));
        }
        return existingTokenPop;
    }

    @Nullable
    public final ExistingToken pop(@NotNull Div div) {
        return pop(div.propertiesHash());
    }

    public final boolean remove(@NotNull ExistingToken existingToken) {
        Object next;
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(existingToken.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (p.f(((ExistingToken) next).getView(), existingToken.getView())) {
                break;
            }
        }
        return y.a(linkedList).remove(next);
    }
}
