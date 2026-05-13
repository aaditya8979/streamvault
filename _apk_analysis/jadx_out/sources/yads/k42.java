package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class k42 implements oa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f91484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53 f91485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f91486c;

    public k42(za zaVar, o53 o53Var, lv lvVar) {
        this.f91484a = zaVar;
        this.f91485b = o53Var;
        this.f91486c = lvVar;
    }

    @Override // yads.oa2
    public final void a(String str) {
        za zaVar = this.f91484a;
        o53 o53Var = this.f91485b;
        lv lvVar = this.f91486c;
        zaVar.getClass();
        ah2 ah2Var = new ah2(lvVar, o53Var, new be0());
        Map mapJ = kotlin.collections.a.j();
        if (str.length() > 0) {
            za.f97439d.execute(new ya(str, ah2Var, mapJ));
        }
    }
}
