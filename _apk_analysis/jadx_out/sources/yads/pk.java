package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import yads.pk;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class pk implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pk f93612h = new pk(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok f93618g;

    static {
        new wq() { // from class: bt.h8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return pk.a(bundle);
            }
        };
    }

    public pk(int i10, int i11, int i12, int i13, int i14) {
        this.f93613b = i10;
        this.f93614c = i11;
        this.f93615d = i12;
        this.f93616e = i13;
        this.f93617f = i14;
    }

    public static pk a(Bundle bundle) {
        return new pk(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pk.class != obj.getClass()) {
            return false;
        }
        pk pkVar = (pk) obj;
        return this.f93613b == pkVar.f93613b && this.f93614c == pkVar.f93614c && this.f93615d == pkVar.f93615d && this.f93616e == pkVar.f93616e && this.f93617f == pkVar.f93617f;
    }

    public final int hashCode() {
        return ((((((((this.f93613b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f93614c) * 31) + this.f93615d) * 31) + this.f93616e) * 31) + this.f93617f;
    }
}
