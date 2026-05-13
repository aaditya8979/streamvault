package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class oc0 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f93173b;

    public oc0(Context context, o30 o30Var) {
        this.f93172a = context.getApplicationContext();
        this.f93173b = o30Var;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new pc0(this.f93172a, this.f93173b.createDataSource());
    }
}
