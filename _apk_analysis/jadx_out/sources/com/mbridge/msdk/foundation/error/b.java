package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: MBFailureReason.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f37637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f37638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f37639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37643j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f37644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f37645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f37648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f37649p;

    public b(int i10) {
        this.f37634a = i10;
        this.f37635b = a.b(i10);
    }

    public b(int i10, String str) {
        this.f37634a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f37636c = str;
        this.f37635b = a.b(i10);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f37645l;
        if (map != null && map.containsKey(obj)) {
            return this.f37645l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f37643j = i10;
    }

    public void a(CampaignEx campaignEx) {
        this.f37638e = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f37639f = mBridgeIds;
    }

    public void a(Object obj, Object obj2) {
        if (this.f37645l == null) {
            this.f37645l = new HashMap<>();
        }
        this.f37645l.put(obj, obj2);
    }

    public void a(String str) {
        this.f37649p = str;
    }

    public void a(Throwable th2) {
        this.f37637d = th2;
    }

    public void a(boolean z10) {
        this.f37642i = z10;
    }

    public void b(String str) {
        this.f37641h = str;
    }

    public void c(String str) {
        this.f37636c = str;
    }

    public CampaignEx d() {
        return this.f37638e;
    }

    public void d(String str) {
        this.f37644k = str;
    }

    public int g() {
        return this.f37634a;
    }

    public int h() {
        return this.f37635b;
    }

    public String i() {
        return this.f37649p;
    }

    public MBridgeIds j() {
        if (this.f37639f == null) {
            this.f37639f = new MBridgeIds();
        }
        return this.f37639f;
    }

    public String k() {
        return this.f37641h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f37636c) ? this.f37636c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f37634a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f37637d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f37644k;
    }

    public int n() {
        return this.f37643j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f37634a + ", errorSubType=" + this.f37635b + ", message='" + this.f37636c + "', cause=" + this.f37637d + ", campaign=" + this.f37638e + ", ids=" + this.f37639f + ", requestId='" + this.f37640g + "', localRequestId='" + this.f37641h + "', isHeaderBidding=" + this.f37642i + ", typeD=" + this.f37643j + ", reasonD='" + this.f37644k + "', extraMap=" + this.f37645l + ", serverErrorCode=" + this.f37646m + ", errorUrl='" + this.f37647n + "', serverErrorResponse='" + this.f37648o + "'}";
    }
}
