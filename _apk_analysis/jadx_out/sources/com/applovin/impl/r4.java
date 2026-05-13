package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* JADX INFO: loaded from: classes7.dex */
public class r4 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p0.a f9770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f9771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f9772p;

    public r4(p0.a aVar, boolean z10, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f9770n = aVar;
        this.f9771o = context;
        this.f9698c = new SpannedString(aVar.a());
        this.f9772p = z10;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f9770n.a(this.f9771o));
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f9770n.b(this.f9771o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f9772p));
        }
        return false;
    }
}
