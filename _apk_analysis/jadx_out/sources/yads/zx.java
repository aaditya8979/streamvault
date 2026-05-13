package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class zx extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy f97820d;

    public zx(cy cyVar, int i10) {
        this.f97820d = cyVar;
        this.f97818b = cyVar.b(i10);
        this.f97819c = i10;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f97818b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map mapA = this.f97820d.a();
        if (mapA != null) {
            return mapA.get(this.f97818b);
        }
        int i10 = this.f97819c;
        if (i10 == -1 || i10 >= this.f97820d.size() || !l92.a(this.f97818b, this.f97820d.b(this.f97819c))) {
            this.f97819c = this.f97820d.a(this.f97818b);
        }
        int i11 = this.f97819c;
        if (i11 == -1) {
            return null;
        }
        return this.f97820d.c(i11);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapA = this.f97820d.a();
        if (mapA != null) {
            return mapA.put(this.f97818b, obj);
        }
        int i10 = this.f97819c;
        if (i10 == -1 || i10 >= this.f97820d.size() || !l92.a(this.f97818b, this.f97820d.b(this.f97819c))) {
            this.f97819c = this.f97820d.a(this.f97818b);
        }
        int i11 = this.f97819c;
        if (i11 == -1) {
            this.f97820d.put(this.f97818b, obj);
            return null;
        }
        Object objC = this.f97820d.c(i11);
        this.f97820d.a(this.f97819c, obj);
        return objC;
    }
}
