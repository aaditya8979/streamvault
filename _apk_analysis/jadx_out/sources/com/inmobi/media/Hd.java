package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class Hd implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Jd f25604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fo.m f25605b;

    public Hd(Jd jd2, fo.m mVar) {
        this.f25604a = jd2;
        this.f25605b = mVar;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        AbstractC3305bc abstractC3305bc = (AbstractC3305bc) obj;
        if (abstractC3305bc instanceof Xm) {
            Jd jd2 = this.f25604a;
            Xm xm2 = (Xm) abstractC3305bc;
            fo.m mVar = this.f25605b;
            if (!jd2.f25723c) {
                Long l10 = jd2.f25724d;
                if (l10 != null) {
                    if (xm2.f26602a >= l10.longValue() + jd2.f25721a.f26055b && kotlinx.coroutines.channels.a.i(mVar.i(bn.r.f5635a))) {
                        jd2.f25723c = true;
                        jd2.f25724d = null;
                        jd2.f25722b.set(false);
                    }
                } else {
                    jd2.f25724d = Long.valueOf(xm2.f26602a);
                    jd2.f25722b.set(true);
                }
            }
        } else if ((abstractC3305bc instanceof C3544kn) || (abstractC3305bc instanceof Om)) {
            Jd jd3 = this.f25604a;
            jd3.f25724d = null;
            jd3.f25722b.set(false);
        }
        return bn.r.f5635a;
    }
}
