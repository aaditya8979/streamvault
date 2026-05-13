package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Rf {
    public static final String a(C4778f9 c4778f9) {
        String string;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i10 = c4778f9.f66751c;
        String str = c4778f9.f66752d;
        byte[] bArr = c4778f9.f66753e;
        if (i10 == 1) {
            string = "Attribution";
        } else if (i10 == 2) {
            string = "Session start";
        } else if (i10 == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, bo.c.f5639b);
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(" with value ");
                    sb3.append(str2);
                }
            }
            string = sb3.toString();
        } else if (i10 == 5) {
            string = "Referrer";
        } else if (i10 == 7) {
            string = "Session heartbeat";
        } else if (i10 == 13) {
            string = "The very first event";
        } else if (i10 == 35) {
            string = "E-Commerce";
        } else if (i10 == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i10 == 42) {
            string = "External attribution";
        } else if (i10 == 16) {
            string = "Open";
        } else if (i10 == 17) {
            string = "Update";
        } else if (i10 == 20) {
            string = "User profile update";
        } else if (i10 != 21) {
            switch (i10) {
                case 25:
                    string = com.ironsource.Z7.f30787k;
                    break;
                case 26:
                    string = "Crash: " + str;
                    break;
                case 27:
                    string = "Error: " + str;
                    break;
                default:
                    string = "type=" + i10;
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static final String a(String str, EnumC4703cb enumC4703cb, String str2, String str3) {
        if (!AbstractC5232x9.f67936d.contains(EnumC4703cb.a(enumC4703cb.f66524a))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        sb2.append(enumC4703cb.name());
        if (AbstractC5232x9.f67938f.contains(enumC4703cb) && !TextUtils.isEmpty(str2)) {
            sb2.append(" with name ");
            sb2.append(str2);
        }
        if (AbstractC5232x9.f67937e.contains(enumC4703cb) && !TextUtils.isEmpty(str3)) {
            sb2.append(" with value ");
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
