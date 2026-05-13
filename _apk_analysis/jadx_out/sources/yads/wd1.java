package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class wd1 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f96355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ og2 f96356e;

    public wd1(Iterator it, og2 og2Var) {
        this.f96355d = it;
        this.f96356e = og2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.f96355d.hasNext()) {
            Object next = this.f96355d.next();
            if (this.f96356e.apply(next)) {
                return next;
            }
        }
        this.f89741b = 3;
        return null;
    }
}
