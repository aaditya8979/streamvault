package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class td3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg3 f95165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ip3 f95166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f95167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f95168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f95169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f95170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f95171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ol3 f95172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f95173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f95174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f95175l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f95176m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f95177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public de3 f95178o;

    public td3(boolean z10, kg3 kg3Var) {
        this.f95164a = z10;
        this.f95165b = kg3Var;
        kotlin.collections.a.j();
        this.f95177n = new LinkedHashMap();
        this.f95178o = new de3();
    }

    public final td3 a(Map map) {
        if (map == null) {
            map = kotlin.collections.a.j();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List listM = (List) entry.getValue();
            if (listM == null) {
                listM = cn.w.m();
            }
            for (String str2 : cn.f0.q0(listM)) {
                LinkedHashMap linkedHashMap = this.f95177n;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(str2);
            }
        }
        return this;
    }

    public final ud3 a() {
        kg3 kg3Var = this.f95165b;
        Map mapC = this.f95177n;
        ol3 ol3Var = this.f95172i;
        kg3Var.getClass();
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(kg3Var.f91592a);
        if (nt2VarA == null || !nt2VarA.f92958l) {
            mapC = kotlin.collections.a.C(mapC);
            List list = ol3Var != null ? ol3Var.f93280a : null;
            List list2 = (List) mapC.get("impression");
            if (list != null) {
                mapC.put("impression", list);
            } else {
                mapC.remove("impression");
            }
            if (list2 != null) {
                mapC.put("render_impression", list2);
            } else {
                mapC.remove("render_impression");
            }
        }
        return new ud3(this.f95164a, this.f95175l, this.f95177n, this.f95178o, this.f95167d, this.f95168e, this.f95169f, this.f95170g, this.f95171h, this.f95172i, this.f95173j, this.f95174k, this.f95166c, this.f95176m, mapC);
    }
}
