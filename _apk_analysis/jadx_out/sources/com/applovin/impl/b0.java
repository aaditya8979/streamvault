package com.applovin.impl;

import com.applovin.impl.s5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class b0 implements u5.b, s5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f7807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7808d;

    public interface a {
        void a(b bVar, String str);

        void a(z zVar, String str);
    }

    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public b0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f7805a = kVar;
        this.f7806b = aVar;
    }

    public static List a(z zVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            List list2 = (List) zVar.a().get(a0Var.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((a0) it2.next()).a(a0Var)) {
                        break;
                    }
                }
            }
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    public void a() {
        z zVar = this.f7807c;
        if (zVar != null) {
            this.f7806b.a(zVar, this.f7808d);
        } else {
            this.f7805a.q0().a(new u5(this.f7805a, this));
        }
    }

    @Override // com.applovin.impl.u5.b
    public void a(b bVar) {
        this.f7806b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.s5.b
    public void a(b bVar, String str) {
        this.f7806b.a(bVar, str);
    }

    @Override // com.applovin.impl.u5.b
    public void a(String str) {
        this.f7805a.q0().a(new s5(this.f7805a, str, this));
    }

    @Override // com.applovin.impl.s5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                a0 a0Var = new a0(strTrim, i10);
                if (a0Var.h()) {
                    String strB = a0Var.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(a0Var);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(a0Var);
                }
            }
            i10++;
        }
        this.f7807c = new z(map, arrayList);
        this.f7808d = str2;
        this.f7805a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7805a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f7807c);
        }
        this.f7806b.a(this.f7807c, str2);
    }
}
