package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes6.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f65906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f65907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f65908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f65909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f65910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f65911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f65912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f65913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f65914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f65915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f65916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f65917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f65918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final W9 f65919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f65920o;

    public T3(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j10, long j11, W9 w92, Bundle bundle) {
        this.f65906a = identifiersResult;
        this.f65907b = identifiersResult2;
        this.f65908c = identifiersResult3;
        this.f65909d = identifiersResult4;
        this.f65910e = identifiersResult5;
        this.f65911f = identifiersResult6;
        this.f65912g = identifiersResult7;
        this.f65913h = identifiersResult8;
        this.f65914i = identifiersResult9;
        this.f65915j = identifiersResult10;
        this.f65916k = identifiersResult11;
        this.f65917l = j10;
        this.f65918m = j11;
        this.f65919n = w92;
        this.f65920o = bundle;
    }

    public static W9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = W9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        W9 w92 = (W9) parcelable;
        return w92 == null ? new W9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : w92;
    }

    public static W9 a(Boolean bool) {
        boolean z10 = bool != null;
        return new W9(bool, z10 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z10 ? null : "no identifier in startup state");
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f65906a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f65907b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f65908c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f65909d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f65910e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f65911f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f65912g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f65913h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle(IronSourceConstants.TYPE_GAID, bundle9);
        IdentifiersResult identifiersResult9 = this.f65914i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f65915j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f65916k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f65917l);
        bundle.putLong("NextStartupTime", this.f65918m);
        W9 w92 = this.f65919n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", w92);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C5009oa.I.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f65906a + ", mDeviceIdData=" + this.f65907b + ", mDeviceIdHashData=" + this.f65908c + ", mReportAdUrlData=" + this.f65909d + ", mGetAdUrlData=" + this.f65910e + ", mResponseClidsData=" + this.f65911f + ", mClientClidsForRequestData=" + this.f65912g + ", mGaidData=" + this.f65913h + ", mHoaidData=" + this.f65914i + ", yandexAdvIdData=" + this.f65915j + ", customSdkHostsData=" + this.f65916k + ", mServerTimeOffset=" + this.f65917l + ", nextStartupTime=" + this.f65918m + ", features=" + this.f65919n + ", modulesConfig=" + this.f65920o + '}';
    }
}
