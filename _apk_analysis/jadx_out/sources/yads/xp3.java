package yads;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.common.Creative;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xp3 {
    public static AdInfo a(c00 c00Var) {
        la laVar = c00Var.f88256b;
        AdSize adSize = laVar != null ? new AdSize(laVar.f91916a, laVar.f91917b) : null;
        List<k00> list = c00Var.f88258d;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        for (k00 k00Var : list) {
            arrayList.add(new Creative(k00Var.f91437a, k00Var.f91438b));
        }
        return new AdInfo(c00Var.f88255a, adSize, c00Var.f88257c, arrayList);
    }
}
