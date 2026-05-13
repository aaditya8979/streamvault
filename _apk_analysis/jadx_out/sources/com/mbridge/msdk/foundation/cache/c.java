package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CandidateResult.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f37342i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f37343j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f37344k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f37345l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f37346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37348c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37349d = f37343j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f37350e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f37351f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f37352g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f37353h = new ArrayList();

    public String a() {
        ArrayList<String> arrayList = this.f37350e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void a(int i10) {
        this.f37349d = i10;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f37350e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f37346a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f37353h;
        return list == null ? "" : list.toString();
    }

    public void b(String str) {
        try {
            List<String> list = this.f37352g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f37346a;
    }

    public void c(String str) {
        try {
            List<String> list = this.f37351f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        List<String> list = this.f37352g;
        return list == null ? "" : list.toString();
    }

    public void d(String str) {
        this.f37347b = str;
    }

    public String e() {
        return this.f37347b;
    }

    public String f() {
        List<String> list = this.f37351f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f37349d;
    }
}
