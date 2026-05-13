package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.ec2;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class ec2 extends ql2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wq f89207d = new wq() { // from class: bt.g1
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return ec2.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f89208c;

    public ec2() {
        this.f89208c = -1.0f;
    }

    public ec2(float f10) {
        ni.a("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f89208c = f10;
    }

    public static ec2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new ec2() : new ec2(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ec2) && this.f89208c == ((ec2) obj).f89208c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f89208c)});
    }
}
