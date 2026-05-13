package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class MaxEvent implements Serializable, Comparable<MaxEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52793a = "event";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52794b = "ts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52795c = "ad_format";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52796d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52797e = "creative_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52798f = "dsp_name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52799g = "MaxEvent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f52800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f52801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f52802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f52803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f52804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f52805m;

    public MaxEvent(String str, long j10, String str2, String str3, String str4, String str5) {
        this.f52800h = str;
        this.f52801i = Long.valueOf(j10);
        this.f52802j = str2;
        this.f52803k = str3;
        this.f52805m = str4;
        this.f52804l = str5;
        Logger.d(f52799g, "New MaxEvent created , event=" + str + ", timestamp=" + j10 + ", adFormat=" + str2 + ", network=" + str3 + ", creativeId=" + str4 + ", dspName=" + str5);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(MaxEvent maxEvent) {
        return this.f52801i.compareTo(maxEvent.f52801i);
    }

    public String a() {
        return this.f52805m;
    }

    public void a(String str) {
        this.f52800h = str;
    }

    public String b() {
        return this.f52800h;
    }

    public long c() {
        return this.f52801i.longValue();
    }

    public String d() {
        return this.f52802j;
    }

    public String e() {
        return this.f52803k;
    }

    public String f() {
        return this.f52804l;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("event", this.f52800h);
        bundle.putLong("ts", this.f52801i.longValue());
        bundle.putString("ad_format", this.f52802j);
        bundle.putString("network", this.f52803k);
        bundle.putString("creative_id", this.f52805m);
        if (this.f52804l != null) {
            bundle.putString("dsp_name", this.f52804l);
        }
        Logger.d(f52799g, "MaxEvent toBundle : " + bundle.toString());
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("event:" + this.f52800h + StringUtils.COMMA);
        sb2.append("ts:" + this.f52801i);
        sb2.append("(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f52801i.longValue() * 1000)) + "),");
        sb2.append("ad_format:" + this.f52802j + StringUtils.COMMA);
        sb2.append("network:" + this.f52803k + StringUtils.COMMA);
        sb2.append("creative_id:" + this.f52805m);
        if (this.f52804l != null) {
            sb2.append(",DSP_NAME:" + this.f52804l);
        }
        return sb2.toString();
    }
}
