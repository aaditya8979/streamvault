package com.moloco.sdk.internal.ortb;

import cn.x;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.ortb.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f46261a = new Regex("\\$\\{AUCTION_PRICE\\}");

    @NotNull
    public static final g a(@NotNull g gVar) {
        p.k(gVar, "<this>");
        List<B> listC = gVar.c();
        ArrayList arrayList = new ArrayList(x.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            List<C4381e> listC2 = ((B) it.next()).c();
            ArrayList arrayList2 = new ArrayList(x.x(listC2, 10));
            for (C4381e c4381e : listC2) {
                float fG = c4381e.g();
                String strE = c4381e.e();
                String strB = b(c4381e.a(), Float.valueOf(fG));
                String strD = c4381e.d();
                arrayList2.add(new C4381e(strB, fG, strD != null ? b(strD, Float.valueOf(fG)) : null, c4381e.f(), strE, c4381e.c()));
            }
            arrayList.add(new B(arrayList2));
        }
        return new g(arrayList);
    }

    @NotNull
    public static final String b(@NotNull String str, @Nullable Float f10) {
        String string;
        p.k(str, "<this>");
        Regex regex = f46261a;
        if (f10 == null || (string = f10.toString()) == null) {
            string = "";
        }
        return regex.replace(str, string);
    }
}
