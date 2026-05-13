package io.bidmachine.util.appintents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import bn.r;
import bo.d0;
import cn.f0;
import cn.w0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.Executable;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.UrlUtilsKt;
import io.bidmachine.util.Utils;
import io.bidmachine.util.appintents.IntentUtilsKt;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a$\u0010\u000f\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u001a$\u0010\u0013\u001a\u00020\t*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u0015\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u001a\n\u0010\u0016\u001a\u00020\f*\u00020\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"CUSTOM_PARAM_RAW_URL", "", "CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS", "KEY_CUSTOM_PARAMS", "extractBmCustomParams", "", "urlString", "removeBmCustomParams", "findAndSetIntentComponent", "", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "findComponentName", "Landroid/content/ComponentName;", "findEndpointAndOpenUrl", "url", "postMethod", "Lio/bidmachine/util/Executable;", "openRawUrl", "openUrl", "openUrlWithPostback", "toIntent", "Landroid/net/Uri;", "bidmachine-android-util_c_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class IntentUtilsKt {

    @NotNull
    private static final String CUSTOM_PARAM_RAW_URL = "lraw";

    @NotNull
    private static final String CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS = "rcp";

    @NotNull
    private static final String KEY_CUSTOM_PARAMS = "bmcp";

    @NotNull
    public static final Set<String> extractBmCustomParams(@NotNull String str) {
        p.k(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            return w0.f();
        }
        String queryParameter = uri.getQueryParameter(KEY_CUSTOM_PARAMS);
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listU0 = d0.U0(queryParameter, new String[]{"_"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!d0.u0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return f0.l1(arrayList);
    }

    public static final boolean findAndSetIntentComponent(@NotNull Context context, @NotNull Intent intent) {
        p.k(context, "<this>");
        p.k(intent, "intent");
        ComponentName componentNameFindComponentName = findComponentName(context, intent);
        if (componentNameFindComponentName == null) {
            return false;
        }
        intent.setComponent(componentNameFindComponentName);
        return true;
    }

    @Nullable
    public static final ComponentName findComponentName(@NotNull Context context, @NotNull Intent intent) {
        p.k(context, "<this>");
        p.k(intent, "intent");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        p.j(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (!(!listQueryIntentActivities.isEmpty())) {
            return null;
        }
        ComponentName componentNameFindStoreComponentName = IntentUtils.findStoreComponentName(listQueryIntentActivities);
        return componentNameFindStoreComponentName == null ? new ComponentName(listQueryIntentActivities.get(0).activityInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name) : componentNameFindStoreComponentName;
    }

    public static final boolean findEndpointAndOpenUrl(@NotNull Context context, @Nullable String str, @Nullable final Executable<Boolean> executable) {
        p.k(context, "<this>");
        if (str == null || str.length() == 0) {
            if (executable != null) {
                executable.execute(Boolean.FALSE);
            }
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        final String validUrl = Utils.getValidUrl(str);
        if (validUrl == null || validUrl.length() == 0) {
            if (executable != null) {
                executable.execute(Boolean.FALSE);
            }
            return false;
        }
        Set<String> setExtractBmCustomParams = extractBmCustomParams(validUrl);
        if (setExtractBmCustomParams.contains(CUSTOM_PARAM_RAW_URL)) {
            if (setExtractBmCustomParams.contains(CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS)) {
                str = removeBmCustomParams(str);
            }
            return openRawUrl(context, str, executable);
        }
        if (Utils.isHttpUrl(validUrl)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: sk.a
                @Override // java.lang.Runnable
                public final void run() {
                    IntentUtilsKt.findEndpointAndOpenUrl$lambda$0(applicationContext, validUrl, executable);
                }
            });
            return true;
        }
        p.j(applicationContext, "applicationContext");
        return openUrlWithPostback(applicationContext, validUrl, executable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findEndpointAndOpenUrl$lambda$0(Context context, String str, Executable executable) {
        p.j(context, "applicationContext");
        openUrlWithPostback(context, NetworkUtils.findEndpoint$default(str, 0, 2, null), executable);
    }

    public static final boolean openRawUrl(@NotNull Context context, @NotNull String str, @Nullable Executable<Boolean> executable) {
        Object objM7534constructorimpl;
        r rVar;
        p.k(context, "<this>");
        p.k(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            if (executable == null) {
                return false;
            }
            executable.execute(Boolean.FALSE);
            return false;
        }
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, toIntent(uri));
            if (executable != null) {
                executable.execute(Boolean.TRUE);
                rVar = r.f5635a;
            } else {
                rVar = null;
            }
            objM7534constructorimpl = Result.m7534constructorimpl(rVar);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null && executable != null) {
            executable.execute(Boolean.FALSE);
        }
        return Result.m7540isSuccessimpl(objM7534constructorimpl);
    }

    public static final boolean openUrl(@NotNull Context context, @Nullable String str) {
        Boolean bool;
        p.k(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intentUrlToIntent = IntentUtils.urlToIntent(str);
            if (!IntentUtils.findAndSetIntentComponent(context, intentUrlToIntent)) {
                String strDecode = URLDecoder.decode(str, bo.c.f5639b.name());
                p.j(strDecode, "decodedUrl");
                intentUrlToIntent = IntentUtils.urlToIntent(strDecode);
                IntentUtils.findAndSetIntentComponent(context, intentUrlToIntent);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentUrlToIntent);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.f(bool, Boolean.TRUE);
    }

    public static final boolean openUrlWithPostback(@NotNull Context context, @Nullable String str, @Nullable final Executable<Boolean> executable) {
        p.k(context, "<this>");
        final boolean zOpenUrl = openUrl(context, str);
        UiUtils.onUiThread(new Runnable() { // from class: sk.b
            @Override // java.lang.Runnable
            public final void run() {
                IntentUtilsKt.openUrlWithPostback$lambda$3$lambda$2(executable, zOpenUrl);
            }
        });
        return zOpenUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openUrlWithPostback$lambda$3$lambda$2(Executable executable, boolean z10) {
        if (executable != null) {
            executable.execute(Boolean.valueOf(z10));
        }
    }

    @NotNull
    public static final String removeBmCustomParams(@NotNull String str) {
        p.k(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            return str;
        }
        String string = UrlUtilsKt.removeQueryParameters(uri, KEY_CUSTOM_PARAMS).toString();
        p.j(string, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return string;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "io.bidmachine");
        context.startActivity(intent);
    }

    @NotNull
    public static final Intent toIntent(@NotNull Uri uri) {
        p.k(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        return intent;
    }
}
