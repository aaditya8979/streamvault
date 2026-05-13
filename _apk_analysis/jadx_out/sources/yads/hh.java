package yads;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hh implements StartupParamsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dh f90412a;

    public hh(dh dhVar) {
        this.f90412a = dhVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        ArrayList arrayList;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        dh dhVar = this.f90412a;
        String id2 = null;
        String id3 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id4 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            id2 = startupParamsItem.getId();
        }
        wg wgVar = (wg) dhVar;
        wgVar.getClass();
        boolean z10 = ad1.f87661a;
        wgVar.c();
        ug ugVar = wgVar.f96373a;
        tg tgVar = new tg(id2, id4, id3);
        synchronized (ugVar.f95641a) {
            arrayList = new ArrayList(ugVar.f95642b);
            ugVar.f95642b.clear();
            bn.r rVar = bn.r.f5635a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c31) it.next()).a(tgVar);
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        dh dhVar = this.f90412a;
        ch chVar = tn.p.f(reason, StartupParamsCallback.Reason.NETWORK) ? ch.f88460c : tn.p.f(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ch.f88461d : ch.f88459b;
        wg wgVar = (wg) dhVar;
        wgVar.c();
        wgVar.f96376d.f94434a.getClass();
        String str = (String) sg.f94810a.get(chVar);
        if (str == null) {
            str = "Unknown";
        }
        rg.a(str);
        wgVar.a();
    }
}
