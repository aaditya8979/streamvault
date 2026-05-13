package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class y91 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y91 f97046b = new y91();

    public y91() {
        super(0);
    }

    @Override // sn.a
    public final Object invoke() {
        bn.g gVar = z91.f97436a;
        List listU0 = bo.d0.U0("adsdk.yandex.ru,yandex.ru", new String[]{StringUtils.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!bo.d0.u0((String) obj)) {
                arrayList.add(obj);
            }
        }
        bn.g gVar2 = z91.f97436a;
        return cn.f0.P0(arrayList, "yandex.com/ads");
    }
}
