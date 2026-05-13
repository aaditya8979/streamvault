package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CandidateEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f37332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f37333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37341j;

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f37332a;
    }

    public void a(int i10) {
        this.f37336e = i10;
    }

    public void a(long j10) {
        this.f37341j = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f37333b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f37332a = copyOnWriteArrayList;
    }

    public double b() {
        return this.f37333b;
    }

    public void b(int i10) {
        this.f37338g = i10;
    }

    public void b(long j10) {
        this.f37337f = j10;
    }

    public void b(String str) {
        this.f37334c = str;
    }

    public long c() {
        return this.f37341j;
    }

    public void c(long j10) {
        this.f37339h = j10;
    }

    public void c(String str) {
        this.f37335d = str;
    }

    public String d() {
        return this.f37334c;
    }

    public void d(String str) {
        this.f37340i = str;
    }

    public String e() {
        return this.f37335d;
    }

    public int f() {
        return this.f37336e;
    }

    public int g() {
        return this.f37338g;
    }

    public long h() {
        return this.f37339h;
    }
}
