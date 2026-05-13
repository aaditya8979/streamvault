package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private double f74;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f75;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final long f76;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final AtomicBoolean f77;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f78;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f79;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f80;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f81;

    public static class Builder {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f88;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f90;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private double f87 = 999999.99d;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f89 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f86 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private AtomicBoolean f84 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private long f85 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private double f82 = -1.0d;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private Map<String, String> f83 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f88, this.f89, this.f90, this.f86, this.f84, this.f82, this.f85, new HashMap(this.f83), (byte) 0);
        }

        public Builder setAge(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 <= 0 || i10 > 199) {
                StringBuilder sb2 = new StringBuilder("setAge( ");
                sb2.append(i10);
                sb2.append(" ) age must be between 1-199");
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            } else {
                this.f89 = i10;
            }
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f83.size() >= 5) {
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    k.m6890("ISAdQualitySegment Builder", sb2.toString());
                } else if (kc.m6947(str) && kc.m6947(str2) && kc.m6938(str, 32) && kc.m6938(str2, 32)) {
                    this.f83.put("sgct_".concat(String.valueOf(str)), str2);
                } else {
                    StringBuilder sb3 = new StringBuilder("setCustomData( ");
                    sb3.append(str);
                    sb3.append(" , ");
                    sb3.append(str2);
                    sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                    k.m6890("ISAdQualitySegment Builder", sb3.toString());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.f32880b) || str.toLowerCase(locale).equals(IronSourceConstants.a.f32881c)) {
                this.f90 = str.toLowerCase(locale);
            } else {
                StringBuilder sb2 = new StringBuilder("setGender( ");
                sb2.append(str);
                sb2.append(" ) is invalid");
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            }
            return this;
        }

        public Builder setInAppPurchasesTotal(double d10) {
            if (d10 < 0.0d || d10 >= this.f87) {
                StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
                sb2.append(d10);
                sb2.append(" ) iapt must be between 0-");
                sb2.append(this.f87);
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            } else {
                this.f82 = Math.floor(d10 * 100.0d) / 100.0d;
            }
            return this;
        }

        public Builder setIsPaying(boolean z10) {
            if (this.f84 == null) {
                this.f84 = new AtomicBoolean();
            }
            this.f84.set(z10);
            return this;
        }

        public Builder setLevel(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 <= 0 || i10 >= 999999) {
                StringBuilder sb2 = new StringBuilder("setLevel( ");
                sb2.append(i10);
                sb2.append(" ) level must be between 1-999999");
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            } else {
                this.f86 = i10;
            }
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kc.m6947(str) && kc.m6938(str, 32)) {
                this.f88 = str;
            } else {
                StringBuilder sb2 = new StringBuilder("setSegmentName( ");
                sb2.append(str);
                sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            }
            return this;
        }

        public Builder setUserCreationDate(long j10) {
            if (j10 == 0) {
                return this;
            }
            if (j10 > 0) {
                this.f85 = j10;
            } else {
                StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
                sb2.append(j10);
                sb2.append(" ) is an invalid timestamp");
                k.m6890("ISAdQualitySegment Builder", sb2.toString());
            }
            return this;
        }
    }

    private ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map<String, String> map) {
        this.f78 = str;
        this.f81 = i10;
        this.f80 = str2;
        this.f79 = i11;
        this.f77 = atomicBoolean;
        this.f74 = d10;
        this.f76 = j10;
        this.f75 = map;
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map map, byte b10) {
        this(str, i10, str2, i11, atomicBoolean, d10, j10, map);
    }

    public int getAge() {
        return this.f81;
    }

    public Map<String, String> getCustomData() {
        return this.f75;
    }

    public String getGender() {
        return this.f80;
    }

    public double getInAppPurchasesTotal() {
        return this.f74;
    }

    public AtomicBoolean getIsPaying() {
        return this.f77;
    }

    public int getLevel() {
        return this.f79;
    }

    public String getName() {
        return this.f78;
    }

    public long getUserCreationDate() {
        return this.f76;
    }
}
