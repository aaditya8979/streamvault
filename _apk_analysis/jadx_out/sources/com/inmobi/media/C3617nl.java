package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3617nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f27707a;

    public C3617nl(G g10) {
        tn.p.k(g10, "adContext");
        this.f27707a = g10;
    }

    public static void a(HashMap map, List list, C3605n9 c3605n9) {
        tn.p.k(map, "macros");
        tn.p.k(list, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (tn.p.f(((C3809ve) obj).f28365b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C3809ve) it.next()).f28364a;
            tn.p.k(str, "<this>");
            tn.p.k(map, "macros");
            String strS = str;
            for (Map.Entry entry : map.entrySet()) {
                strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            arrayList2.add(strS);
        }
        for (String str2 : arrayList2) {
            C3823w3 c3823w3 = C3823w3.f28406a;
            Ag ag2 = Ag.f25163b;
            tn.p.k(str2, "url");
            tn.p.k(ag2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Dg.a(ag2, new C3599n3(str2, c3605n9, null));
        }
    }
}
