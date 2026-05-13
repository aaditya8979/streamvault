package com.ironsource;

import com.ironsource.AbstractC4244s3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes8.dex */
public class J9 extends AbstractC4244s3 {
    private static J9 R;
    private String P;
    private final P8 Q = Lb.U().s();

    private J9() {
        this.H = K5.f29722a;
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized J9 i() {
        if (R == null) {
            J9 j92 = new J9();
            R = j92;
            j92.e();
        }
        return R;
    }

    @Override // com.ironsource.AbstractC4244s3
    public int c(C5 c52) {
        int iF = f(c52.c());
        return iF == AbstractC4244s3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : iF == AbstractC4244s3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4244s3
    public void d() {
        this.J.add(Integer.valueOf(D5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(D5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(D5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(D5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_SHOW.b()));
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean d(C5 c52) {
        int iC = c52.c();
        return iC == D5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == D5.IS_INSTANCE_OPENED.b() || iC == D5.IS_INSTANCE_CLOSED.b() || iC == D5.IS_AUCTION_SUCCESS.b() || iC == D5.IS_AUCTION_FAILED.b() || iC == D5.BN_INSTANCE_SHOW.b() || iC == D5.BN_AUCTION_SUCCESS.b() || iC == D5.BN_AUCTION_FAILED.b() || iC == D5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == D5.NT_INSTANCE_SHOW.b() || iC == D5.NT_AUCTION_SUCCESS.b() || iC == D5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC4244s3
    public String e(int i10) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4244s3
    public void f(C5 c52) {
        this.P = c52.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean j(C5 c52) {
        return false;
    }
}
