package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class wl implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yl f96433b;

    public wl(yl ylVar, long j10) {
        this.f96433b = ylVar;
        this.f96432a = j10;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        tw2 tw2VarB = this.f96433b.f97210g[0].b(j10);
        int i10 = 1;
        while (true) {
            iu[] iuVarArr = this.f96433b.f97210g;
            if (i10 >= iuVarArr.length) {
                return tw2VarB;
            }
            tw2 tw2VarB2 = iuVarArr[i10].b(j10);
            if (tw2VarB2.f95410a.f96909b < tw2VarB.f95410a.f96909b) {
                tw2VarB = tw2VarB2;
            }
            i10++;
        }
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f96432a;
    }
}
