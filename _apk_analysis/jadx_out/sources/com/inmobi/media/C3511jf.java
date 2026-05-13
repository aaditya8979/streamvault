package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;

/* JADX INFO: renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3511jf implements InterfaceC3397f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImpressionType f27405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSessionContext f27406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f27408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f27409f;

    public C3511jf(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        tn.p.k(str, "mAdSessionType");
        tn.p.k(impressionType, "impressionType");
        this.f27404a = str;
        this.f27405b = impressionType;
        this.f27406c = adSessionContext;
        this.f27407d = z10;
    }

    public static boolean a(byte b10) {
        if (b10 > 0) {
            return true;
        }
        bn.g gVar = P9.f26117a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: 1")));
        return false;
    }

    public static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        bn.g gVar = P9.f26117a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: " + ((int) b11))));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.webkit.WebView r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3511jf.a(android.webkit.WebView, java.util.Map):void");
    }
}
