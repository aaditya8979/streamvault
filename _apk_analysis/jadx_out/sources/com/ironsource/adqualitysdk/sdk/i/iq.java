package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class iq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2607;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2608;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2609;

    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2610;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2611;

        public d(int i10, String str) {
            this.f2610 = i10;
            this.f2611 = str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final int m6593() {
            return this.f2610;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final String m6594() {
            return this.f2611;
        }
    }

    public iq(String str, int i10, String str2, long j10) {
        this.f2608 = str;
        this.f2609 = j10;
        this.f2607 = new d(i10, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m6589() throws JSONException {
        return !TextUtils.isEmpty(this.f2608) ? IronSourceVideoBridge.jsonObjectInit(this.f2608) : IronSourceVideoBridge.jsonObjectInit();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final d m6590() {
        return this.f2607;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final long m6591() {
        return this.f2609;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6592() {
        return this.f2608;
    }
}
