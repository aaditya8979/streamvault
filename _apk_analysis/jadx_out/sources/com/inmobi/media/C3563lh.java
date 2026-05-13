package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3563lh implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f27574a;

    public C3563lh(AdQualityResult adQualityResult) {
        tn.p.k(adQualityResult, "result");
        this.f27574a = adQualityResult;
    }

    @Override // com.inmobi.media.M0
    public final Object a() throws InterruptedException {
        boolean z10 = true;
        try {
            p000do.h.b(null, new C3538kh(this, null), 1, null);
        } catch (SQLiteException unused) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
