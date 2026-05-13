package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: TCStringManager.java */
/* JADX INFO: loaded from: classes12.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37417a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37418b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37419c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37420d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37421e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37422f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f37428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SharedPreferences f37429m;

    /* JADX INFO: compiled from: TCStringManager.java */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f37429m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f37429m;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            a(this.f37429m.getInt("IABTCF_gdprApplies", 0));
            c(this.f37429m.getString("IABTCF_PurposeConsents", ""));
            e(this.f37429m.getString("IABTCF_VendorConsents", ""));
            b(this.f37429m.getString("IABTCF_AddtlConsent", ""));
        }
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }

    public void a(int i10) {
        this.f37421e = i10;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f37428l = aVar;
        }
    }

    public void a(boolean z10) {
        this.f37422f = z10;
    }

    public String b() {
        return this.f37417a;
    }

    public void b(String str) {
        this.f37420d = str;
        if (TextUtils.isEmpty(str)) {
            this.f37426j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f37427k = false;
            return;
        }
        this.f37427k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f37426j = false;
                } else {
                    this.f37426j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public void c(String str) {
        this.f37423g = a(str, 1);
        this.f37424h = a(str, 2);
        this.f37418b = str;
    }

    public boolean c() {
        if (this.f37421e == 0) {
            a(true);
            return this.f37422f;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f37425i || (this.f37427k && this.f37426j)) && this.f37423g && this.f37424h);
        } else {
            a(this.f37425i && this.f37423g && this.f37424h);
        }
        return this.f37422f;
    }

    public void d(String str) {
        this.f37417a = str;
    }

    public void e(String str) {
        this.f37425i = a(str, 867);
        this.f37419c = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            byte b10 = -1;
            switch (str.hashCode()) {
                case -2004976699:
                    if (str.equals("IABTCF_PurposeConsents")) {
                        b10 = 2;
                    }
                    break;
                case 83641339:
                    if (str.equals("IABTCF_gdprApplies")) {
                        b10 = 1;
                    }
                    break;
                case 1218895378:
                    if (str.equals("IABTCF_TCString")) {
                        b10 = 0;
                    }
                    break;
                case 1342914771:
                    if (str.equals("IABTCF_AddtlConsent")) {
                        b10 = 4;
                    }
                    break;
                case 1450203731:
                    if (str.equals("IABTCF_VendorConsents")) {
                        b10 = 3;
                    }
                    break;
            }
            if (b10 == 0) {
                d(sharedPreferences.getString("IABTCF_TCString", ""));
            } else if (b10 == 1) {
                a(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
            } else if (b10 == 2) {
                c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
            } else if (b10 == 3) {
                e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
            } else if (b10 == 4) {
                b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
            }
            a aVar = this.f37428l;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }
}
