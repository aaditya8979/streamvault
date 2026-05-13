package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Pf f30178a = new Pf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f30179b = ",";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f30180c = "[";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f30181d = "]";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f30182e = 118;

    private Pf() {
    }

    private final int a(Context context, int i10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i10 * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }

    private final String a(Object obj) {
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        return "'" + obj + "'";
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f30178a.a(it.next()) + ",";
        }
        return ((Object) bo.d0.M0(str, ",")) + "]";
    }

    @NotNull
    public final ViewGroup.LayoutParams a(@Nullable Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    @NotNull
    public final AdInfo a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "<this>");
        return new AdInfo(new Z8(levelPlayAdInfo), null);
    }

    @NotNull
    public final IronSourceError a(@NotNull LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @NotNull
    public final List<Object> a(@NotNull Object... objArr) {
        tn.p.k(objArr, "items");
        return cn.w.p(Arrays.copyOf(objArr, objArr.length));
    }

    @NotNull
    public final String b(@NotNull List<? extends Object> list) {
        tn.p.k(list, "methodArgs");
        String str = new String();
        for (Object obj : list) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f30178a.a((List<?>) obj) : f30178a.a(obj)))) + ",";
        }
        return bo.d0.M0(str, ",");
    }
}
