package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5020ol implements InterfaceC5121sn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f67467d = TimeUnit.SECONDS.toMillis(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f67469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f67470c;

    public C5020ol(Context context) {
        long j10 = f67467d;
        this.f67470c = new CachedDataProvider.CachedData(j10, j10, "sim-info");
        this.f67468a = context;
        this.f67469b = C5009oa.k().j();
    }

    public final C4893jl b() {
        return new C4893jl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f67468a, "phone", "getting SimMcc", "TelephonyManager", new C4919kl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f67468a, "phone", "getting SimMnc", "TelephonyManager", new C4945ll()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f67468a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C4995nl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f67468a, "phone", "getting SimOperatorName", "TelephonyManager", new C4970ml()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5121sn
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C4893jl> a() {
        List<C4893jl> list;
        List<C4893jl> list2 = (List) this.f67470c.getData();
        if (list2 != null) {
            boolean zIsEmpty = list2.isEmpty();
            list = list2;
            if (zIsEmpty) {
                list = list2;
                if (this.f67470c.shouldUpdateData()) {
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (C5009oa.I.f67438u.b().f66859n.f67259d) {
            if (AndroidUtils.isApiAchieved(23)) {
                if (this.f67469b.hasPermission(this.f67468a, "android.permission.READ_PHONE_STATE")) {
                    arrayList.addAll(C5045pl.a(this.f67468a));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(b());
                }
            } else {
                arrayList.add(b());
            }
        }
        this.f67470c.setData(arrayList);
        list = arrayList;
        return list;
    }
}
