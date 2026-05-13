package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4310w1 extends AbstractC4244s3 {
    public C4310w1() {
        this.H = K5.f29723b;
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4244s3
    public int c(@Nullable C5 c52) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4244s3
    public void d() {
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean d(@NotNull C5 c52) {
        tn.p.k(c52, "event");
        int iC = c52.c();
        return iC == D5.FIRST_INSTANCE.b() || iC == D5.INIT_COMPLETE.b() || iC == D5.SDK_INIT_FAILED.b() || iC == D5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4244s3
    @NotNull
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC4244s3
    public void f(@Nullable C5 c52) {
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean h(@Nullable C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean j(@Nullable C5 c52) {
        return false;
    }
}
