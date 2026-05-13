package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class RedirectData implements Serializable {
    private static final long serialVersionUID = -2180364199406342143L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f51819a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f51820b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51821c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f51822d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f51823e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f51824f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51825g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51826h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f51828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BrandSafetyEvent.AdFormatType f51829k;

    public RedirectData(String str, BrandSafetyEvent.AdFormatType adFormatType) {
        this.f51827i = str;
        this.f51829k = adFormatType;
    }

    public synchronized void a(String str) {
        if (str != null) {
            if (this.f51826h == null) {
                this.f51826h = str;
            } else if (!this.f51826h.contains(str)) {
                this.f51826h += ImpressionLog.P + str;
            }
        }
    }

    public void a(String str, String str2, String str3) {
        this.f51819a = true;
        this.f51822d = str2;
        this.f51823e = str;
        this.f51824f = str3;
        this.f51828j = System.currentTimeMillis();
    }

    public void b(String str, String str2, String str3) {
        this.f51820b = true;
        this.f51823e = str;
        if (str2 == null) {
            str2 = str;
        }
        this.f51822d = str2;
        this.f51825g = str3;
        this.f51828j = System.currentTimeMillis();
    }
}
