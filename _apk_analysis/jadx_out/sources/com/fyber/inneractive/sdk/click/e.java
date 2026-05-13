package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f15919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f15920c;

    public e(g gVar, List list, Uri uri) {
        this.f15920c = gVar;
        this.f15918a = list;
        this.f15919b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f15920c.f15926f) {
            return;
        }
        if (exc != null || cVar == null) {
            String string = this.f15919b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.util.r.f19556b.post(new com.fyber.inneractive.sdk.config.f0(string, null));
            Uri uri = this.f15919b;
            this.f15920c.getClass();
            b bVarA = r.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f15918a;
            if (list != null) {
                list.add(new j(this.f15919b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f15918a;
                bVarA.f15914f.clear();
                bVarA.f15914f.addAll(list2);
            }
            g gVar = this.f15920c;
            f fVar = gVar.f15923c;
            if (fVar != null) {
                fVar.a(bVarA, gVar.f15924d, gVar.f15925e);
                return;
            }
            return;
        }
        if (cVar.f15915a.size() > 0) {
            ArrayList arrayList = cVar.f15915a;
            String str = (String) arrayList.get(arrayList.size() - 1);
            if (this.f15918a != null) {
                for (String str2 : cVar.f15915a) {
                    if (!TextUtils.equals(str2, str)) {
                        this.f15918a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f15918a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.f15920c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.f15918a;
                bVar.f15914f.clear();
                bVar.f15914f.addAll(list4);
                g gVar2 = this.f15920c;
                f fVar2 = gVar2.f15923c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.f15924d, gVar2.f15925e);
                }
            }
            if (str.startsWith("market")) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f19556b.post(new com.fyber.inneractive.sdk.config.f0(strReplace, null));
            } else {
                String str3 = cVar.f15916b;
                IAConfigManager iAConfigManager3 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f19556b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
