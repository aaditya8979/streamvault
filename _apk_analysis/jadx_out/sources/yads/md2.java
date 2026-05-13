package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class md2 {

    @NotNull
    public static final ld2 Companion = new ld2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f92323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f92324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f92325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f92326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f92327e;

    public /* synthetic */ md2(int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i10 & 1) == 0) {
            this.f92323a = null;
        } else {
            this.f92323a = num;
        }
        if ((i10 & 2) == 0) {
            this.f92324b = null;
        } else {
            this.f92324b = num2;
        }
        if ((i10 & 4) == 0) {
            this.f92325c = null;
        } else {
            this.f92325c = num3;
        }
        if ((i10 & 8) == 0) {
            this.f92326d = null;
        } else {
            this.f92326d = num4;
        }
        if ((i10 & 16) == 0) {
            this.f92327e = null;
        } else {
            this.f92327e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return tn.p.f(this.f92323a, md2Var.f92323a) && tn.p.f(this.f92324b, md2Var.f92324b) && tn.p.f(this.f92325c, md2Var.f92325c) && tn.p.f(this.f92326d, md2Var.f92326d) && tn.p.f(this.f92327e, md2Var.f92327e);
    }

    public final int hashCode() {
        Integer num = this.f92323a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f92324b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f92325c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f92326d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f92327e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "PlayBackOptimizationConfig(minBufferMs=" + this.f92323a + ", maxBufferMs=" + this.f92324b + ", bufferForPlaybackMs=" + this.f92325c + ", bufferForPlaybackAfterRebufferMs=" + this.f92326d + ", targetBufferBytes=" + this.f92327e + ")";
    }
}
