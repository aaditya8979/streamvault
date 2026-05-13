package yads;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be0 f92360b = new be0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ck3 f92361c = new ck3();

    public mh3(Context context) {
        this.f92359a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f92360b.a((String) it.next(), map));
        }
        this.f92361c.getClass();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!tn.p.f((String) obj, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList2.add(obj);
            }
        }
        for (String str : arrayList2) {
            di3 di3VarA = di3.f88863c.a(this.f92359a);
            di3VarA.f88866b.a(new bd2(di3VarA.f88865a, str, new om3()));
        }
    }
}
