package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import yads.oj3;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public final class oj3 implements xq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f93237f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f93241e;

    static {
        new wq() { // from class: bt.p7
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return oj3.a(bundle);
            }
        };
    }

    public oj3(int i10, int i11, int i12, float f10) {
        this.f93238b = i10;
        this.f93239c = i11;
        this.f93240d = i12;
        this.f93241e = f10;
    }

    public static oj3 a(Bundle bundle) {
        return new oj3(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3)) {
            return false;
        }
        oj3 oj3Var = (oj3) obj;
        return this.f93238b == oj3Var.f93238b && this.f93239c == oj3Var.f93239c && this.f93240d == oj3Var.f93240d && this.f93241e == oj3Var.f93241e;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f93241e) + ((((((this.f93238b + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.f93239c) * 31) + this.f93240d) * 31);
    }
}
