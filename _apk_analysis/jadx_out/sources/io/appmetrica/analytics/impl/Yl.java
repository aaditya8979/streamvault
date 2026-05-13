package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3996e4;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Yl implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4835he f66272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5037pd f66273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ib f66274c = new Ib();

    public Yl(@NonNull C4835he c4835he, @NonNull InterfaceC5037pd interfaceC5037pd) {
        this.f66272a = c4835he;
        this.f66273b = interfaceC5037pd;
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull Ib ib2) {
        ib2.getClass();
        AdvertisingIdsHolder identifiers = C5009oa.I.c().getIdentifiers();
        if (identifiers == null || dataSendingRestrictionController.isRestrictedForSdk()) {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.ADV_ID), "");
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.HUAWEI_OAID), "");
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.YANDEX_ADV_ID), "");
            return;
        }
        AdTrackingInfoResult google = identifiers.getGoogle();
        if (google.isValid()) {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
        } else {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.ADV_ID), "");
        }
        AdTrackingInfoResult huawei = identifiers.getHuawei();
        if (huawei.isValid()) {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
        } else {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.HUAWEI_OAID), "");
        }
        AdTrackingInfoResult yandex = identifiers.getYandex();
        if (yandex.isValid()) {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
        } else {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.YANDEX_ADV_ID), "");
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C4714cm c4714cm) {
        C5015og c5015og;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.DEVICE_ID), c4714cm.getDeviceId());
        a(builder, C5009oa.I.h(), this.f66274c);
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.APP_SET_ID), c4714cm.getAppSetId());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.APP_SET_ID_SCOPE), c4714cm.getAppSetIdScope());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.APP_PLATFORM), c4714cm.getAppPlatform());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.PROTOCOL_VERSION), c4714cm.getProtocolVersion());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c4714cm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f66272a.a("model"), c4714cm.getModel());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.MANUFACTURER), c4714cm.getManufacturer());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.OS_VERSION), c4714cm.getOsVersion());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c4714cm.getScreenWidth()));
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c4714cm.getScreenHeight()));
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c4714cm.getScreenDpi()));
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c4714cm.getScaleFactor()));
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.LOCALE), c4714cm.getLocale());
        builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.DEVICE_TYPE), c4714cm.getDeviceType());
        builder.appendQueryParameter(this.f66272a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("query_hosts"), String.valueOf(2));
        String strA = this.f66272a.a("features");
        List<String> listH = ((C5268yk) this.f66273b).h();
        String[] strArr = {this.f66272a.a("permissions_collecting"), this.f66272a.a("features_collecting"), this.f66272a.a("google_aid"), this.f66272a.a("huawei_oaid"), this.f66272a.a("sim_info"), this.f66272a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f66272a.a("app_id"), c4714cm.getPackageName());
        builder.appendQueryParameter(this.f66272a.a("app_debuggable"), ((O5) c4714cm).f65684a);
        if (c4714cm.f66555l) {
            String str = c4714cm.f66556m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f66272a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f66272a.a("detect_locale"), String.valueOf(1));
        }
        C5101s3 c5101s3 = c4714cm.f66552i;
        if (!mo.a(c5101s3.f67660a)) {
            builder.appendQueryParameter(this.f66272a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f66272a.a("clids_set"), Gm.a(c5101s3.f67660a));
            int iOrdinal = c5101s3.f67661b.ordinal();
            builder.appendQueryParameter(this.f66272a.a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c4714cm.f66549f;
            String str3 = c4714cm.f66550g;
            if (TextUtils.isEmpty(str2) && (c5015og = c4714cm.f66558o.f67297b) != null) {
                str2 = c5015og.f67460a;
                str3 = c5015og.f67463d.f67368a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f66272a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f66272a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c4714cm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f66272a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f66272a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("app_system_flag"), ((O5) c4714cm).f65685b);
        builder.appendQueryParameter(this.f66272a.a(C3996e4.f31525c), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f66272a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((C5268yk) this.f66273b).d();
        for (String str4 : mapD.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapD.get(str4)));
        }
    }
}
