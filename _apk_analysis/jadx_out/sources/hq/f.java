package hq;

import java.util.Locale;

/* JADX INFO: compiled from: BufferDateCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends sq.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f63595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f63596q;

    public f(String str, Locale locale) {
        super(str, locale);
    }

    public synchronized d g(long j10) {
        String strA = super.a(j10);
        if (strA == this.f63596q) {
            return this.f63595p;
        }
        this.f63596q = strA;
        h hVar = new h(strA);
        this.f63595p = hVar;
        return hVar;
    }
}
