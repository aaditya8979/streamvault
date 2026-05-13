package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: compiled from: RetryUrlRecordData.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f35726k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f35727l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f35730c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35731d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f35732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35737j;

    public b(String str, String str2) {
        this.f35728a = str;
        a(str2);
    }

    public CampaignEx a() {
        return this.f35732e;
    }

    public void a(int i10) {
        this.f35737j = i10;
    }

    public void a(CampaignEx campaignEx) {
        this.f35732e = campaignEx;
    }

    public void a(String str) {
        this.f35729b++;
        this.f35730c.add(str);
    }

    public void a(boolean z10) {
        this.f35735h = z10;
    }

    public HashSet<String> b() {
        return this.f35730c;
    }

    public void b(int i10) {
        this.f35734g = i10;
    }

    public void b(String str) {
        this.f35733f = str;
    }

    public void b(boolean z10) {
        this.f35736i = z10;
    }

    public long c() {
        return this.f35731d;
    }

    public int d() {
        return this.f35737j;
    }

    public int e() {
        return this.f35729b;
    }

    public String f() {
        return this.f35733f;
    }

    public String g() {
        return this.f35728a;
    }

    public int h() {
        return this.f35734g;
    }

    public boolean i() {
        return this.f35735h;
    }

    public boolean j() {
        return this.f35736i;
    }
}
