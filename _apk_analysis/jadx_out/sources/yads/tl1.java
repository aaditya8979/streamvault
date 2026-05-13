package yads;

import android.os.Bundle;
import yads.tl1;
import yads.xq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f95259g = new wq() { // from class: bt.ja
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return tl1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95264f;

    public tl1(sl1 sl1Var) {
        this.f95260b = sl1Var.f94862a;
        this.f95261c = sl1Var.f94863b;
        this.f95262d = sl1Var.f94864c;
        this.f95263e = sl1Var.f94865d;
        this.f95264f = sl1Var.f94866e;
    }

    public static ul1 a(Bundle bundle) {
        sl1 sl1Var = new sl1();
        long j10 = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f94862a = j10;
        long j11 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE && j11 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f94863b = j11;
        sl1Var.f94864c = bundle.getBoolean(Integer.toString(2, 36), false);
        sl1Var.f94865d = bundle.getBoolean(Integer.toString(3, 36), false);
        sl1Var.f94866e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new ul1(sl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return this.f95260b == tl1Var.f95260b && this.f95261c == tl1Var.f95261c && this.f95262d == tl1Var.f95262d && this.f95263e == tl1Var.f95263e && this.f95264f == tl1Var.f95264f;
    }

    public final int hashCode() {
        long j10 = this.f95260b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f95261c;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f95262d ? 1 : 0)) * 31) + (this.f95263e ? 1 : 0)) * 31) + (this.f95264f ? 1 : 0);
    }
}
