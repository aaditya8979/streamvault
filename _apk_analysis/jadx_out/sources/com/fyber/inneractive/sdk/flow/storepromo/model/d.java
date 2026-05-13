package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16628c;

    public d(String str, String str2, String str3) {
        String str4;
        this.f16628c = "";
        this.f16626a = str;
        this.f16627b = str2;
        h hVar = new h(str3);
        if (hVar.f19531a == null) {
            str4 = "N/A";
        } else {
            double dLongValue = r11.longValue() / 1024.0d;
            double d10 = dLongValue / 1024.0d;
            double d11 = d10 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(hVar.f19531a) + " bytes";
            if (d10 > 850.0d) {
                str4 = decimalFormat.format(d11) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d10) + " MB";
            } else if (hVar.f19531a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f16628c = str4;
    }
}
