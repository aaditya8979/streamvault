package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4657ah implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f66388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f66389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4956m7 f66390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ib f66391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f66392e;

    public C4657ah(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ib ib2) {
        this.f66388a = advIdWithLimitedAppender;
        this.f66389b = networkTaskForSendingDataParamsAppender;
        this.f66391d = ib2;
    }

    public C4657ah(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ib());
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void a(long j10) {
        this.f66392e = j10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C4941lh c4941lh) {
        builder.path(CrashEvent.f52788e);
        this.f66389b.appendEncryptedData(builder);
        C4956m7 c4956m7 = this.f66390c;
        if (c4956m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c4956m7.f67266a, c4941lh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f66390c.f67267b, c4941lh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f66390c.f67268c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f66390c.f67271f, c4941lh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f66390c.f67273h, c4941lh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f66390c.f67274i, c4941lh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f66390c.f67275j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f66390c.f67269d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f66390c.f67270e);
            a(builder, "app_debuggable", this.f66390c.f67272g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f66390c.f67276k, c4941lh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f66390c.f67277l, c4941lh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f66390c.f67278m, c4941lh.getAppFramework()));
            a(builder, "attribution_id", this.f66390c.f67279n);
        }
        builder.appendQueryParameter("api_key_128", c4941lh.f67224m);
        builder.appendQueryParameter("app_id", c4941lh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c4941lh.getAppPlatform());
        builder.appendQueryParameter("model", c4941lh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c4941lh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c4941lh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c4941lh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c4941lh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c4941lh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c4941lh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c4941lh.f67227p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c4941lh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c4941lh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f66388a;
        this.f66391d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C5009oa.I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f66392e));
    }

    public final void a(@NonNull C4956m7 c4956m7) {
        this.f66390c = c4956m7;
    }
}
