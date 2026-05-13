package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3526k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27448c;

    public C3526k5(Context context, ArrayList arrayList, int i10) {
        tn.p.k("com.im_11.1.0.db", "name");
        tn.p.k(arrayList, "tableInfos");
        this.f27446a = context;
        this.f27447b = arrayList;
        this.f27448c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3526k5)) {
            return false;
        }
        C3526k5 c3526k5 = (C3526k5) obj;
        return tn.p.f(this.f27446a, c3526k5.f27446a) && tn.p.f("com.im_11.1.0.db", "com.im_11.1.0.db") && tn.p.f(this.f27447b, c3526k5.f27447b) && this.f27448c == c3526k5.f27448c && tn.p.f(null, null);
    }

    public final int hashCode() {
        return AbstractC3414fi.a(this.f27448c, (this.f27447b.hashCode() + AbstractC3414fi.a(1, (((this.f27446a == null ? 0 : r0.hashCode()) * 31) - 2016312295) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f27446a + ", name=com.im_11.1.0.db, version=1, tableInfos=" + this.f27447b + ", journalMode=" + this.f27448c + ", transactionExecutor=" + ((Object) null) + ")";
    }
}
