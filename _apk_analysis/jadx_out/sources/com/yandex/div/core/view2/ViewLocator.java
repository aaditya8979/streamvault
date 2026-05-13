package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import cn.f0;
import cn.w;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ViewLocator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewLocator {

    @NotNull
    public static final ViewLocator INSTANCE = new ViewLocator();

    private ViewLocator() {
    }

    @Nullable
    public static final View findSingleViewWithTag(@NotNull Div2View div2View, @NotNull String str) {
        List<View> listFindViewsWithTag = findViewsWithTag(div2View, str);
        if (listFindViewsWithTag.isEmpty()) {
            return null;
        }
        if (listFindViewsWithTag.size() <= 1) {
            return (View) f0.t0(listFindViewsWithTag);
        }
        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Ambiguous scope id. There are " + listFindViewsWithTag.size() + " divs with id '" + str + '\''));
        return null;
    }

    private final List<View> findViewsWithTag(View view, Object obj) {
        if (obj == null) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        findViewsWithTagTraversal(view, obj, arrayList);
        return arrayList;
    }

    @NotNull
    public static final List<View> findViewsWithTag(@NotNull Div2View div2View, @NotNull String str) {
        return INSTANCE.findViewsWithTag((View) div2View.getView(), (Object) str);
    }

    private final List<View> findViewsWithTagTraversal(View view, Object obj, List<View> list) {
        if (p.f(obj, view.getTag())) {
            list.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                findViewsWithTagTraversal(viewGroup.getChildAt(i10), obj, list);
            }
        }
        return list;
    }
}
