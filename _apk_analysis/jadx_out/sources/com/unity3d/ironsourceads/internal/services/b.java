package com.unity3d.ironsourceads.internal.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bn.h;
import com.ironsource.C3978d4;
import com.ironsource.C4108k9;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.EnumC4144m9;
import com.ironsource.InterfaceC4027g;
import com.ironsource.InterfaceC4045h;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.safedk.android.utils.Logger;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4027g f53439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4045h f53440b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53441a;

        static {
            int[] iArr = new int[EnumC4144m9.values().length];
            try {
                iArr[EnumC4144m9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4144m9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53441a = iArr;
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    public b(@NotNull InterfaceC4027g interfaceC4027g, @NotNull InterfaceC4045h interfaceC4045h) {
        p.k(interfaceC4027g, "actionIntentFactory");
        p.k(interfaceC4045h, "activityIntentFactory");
        this.f53439a = interfaceC4027g;
        this.f53440b = interfaceC4045h;
    }

    private final Intent a(C4108k9 c4108k9) throws JSONException {
        Intent intentA = this.f53439a.a();
        intentA.setPackage(c4108k9.f());
        intentA.setData(Uri.parse(c4108k9.h()));
        JSONObject jSONObjectE = c4108k9.e();
        if (jSONObjectE != null) {
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectE.get(next);
                if (obj instanceof String) {
                    intentA.putExtra(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    p.j(obj, "value");
                    intentA.putExtra(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    p.j(obj, "value");
                    intentA.putExtra(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    p.j(obj, "value");
                    intentA.putExtra(next, ((Number) obj).longValue());
                } else if (obj instanceof Float) {
                    p.j(obj, "value");
                    intentA.putExtra(next, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    p.j(obj, "value");
                    intentA.putExtra(next, ((Number) obj).doubleValue());
                } else {
                    intentA.putExtra(next, obj.toString());
                }
            }
        }
        return intentA;
    }

    private final a.AbstractC0711a a(Activity activity, Intent intent) {
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new InlineStoreActivity.b(this.f53440b).a(intent).a(activity));
        a(this, D5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC4144m9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC0711a.b.f53438a;
    }

    private final void a(D5 d52, EnumC4144m9 enumC4144m9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC4144m9.b());
            Lb.f29764s.d().q().a(new C5(d52, new JSONObject(kotlin.collections.a.z(map))));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(b bVar, D5 d52, EnumC4144m9 enumC4144m9, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(d52, enumC4144m9, map);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC0711a b(Activity activity, Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 794006778);
        a(this, D5.INLINE_STORE_LAUNCHED, EnumC4144m9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC0711a.b.f53438a;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        activity.startActivity(intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC0711a a(@NotNull Context context, @NotNull C4108k9 c4108k9) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(c4108k9, AdActivity.REQUEST_KEY_EXTRA);
        try {
            a(this, D5.INLINE_STORE_REQUESTED, c4108k9.g(), null, 4, null);
            if (TextUtils.isEmpty(c4108k9.h())) {
                a(D5.INLINE_STORE_FAILED, c4108k9.g(), kotlin.collections.a.o(h.a("reason", "storeUrl is empty")));
                return new a.AbstractC0711a.C0712a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(D5.INLINE_STORE_FAILED, c4108k9.g(), kotlin.collections.a.o(h.a("reason", "context is not an Activity")));
                return new a.AbstractC0711a.C0712a("context is not an Activity");
            }
            Intent intentA = a(c4108k9);
            if (!a(context, intentA)) {
                a(D5.INLINE_STORE_FAILED, c4108k9.g(), kotlin.collections.a.o(h.a("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC0711a.C0712a("Failed to resolve for packageManager");
            }
            int i10 = a.f53441a[c4108k9.g().ordinal()];
            if (i10 == 1) {
                return b((Activity) context, intentA);
            }
            if (i10 == 2) {
                return a((Activity) context, intentA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            String str = "Failed to open inline store: " + e10.getMessage();
            IronLog.INTERNAL.error(e10.toString());
            a(D5.INLINE_STORE_FAILED, c4108k9.g(), kotlin.collections.a.o(h.a("reason", str)));
            return new a.AbstractC0711a.C0712a(str);
        }
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC0711a a(@NotNull Context context, @NotNull EnumC4144m9 enumC4144m9) {
        Intent intent;
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(enumC4144m9, C3978d4.f.f31283e);
        try {
            a(this, D5.INLINE_STORE_DESTROY_REQUESTED, enumC4144m9, null, 4, null);
            if (!(context instanceof Activity)) {
                a(D5.INLINE_STORE_DESTROY_FAILED, enumC4144m9, kotlin.collections.a.o(h.a("reason", "context is not an Activity")));
                return new a.AbstractC0711a.C0712a("context is not an Activity");
            }
            int i10 = a.f53441a[enumC4144m9.ordinal()];
            if (i10 == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra(InlineStoreActivity.a.f53434b, true);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            a(this, D5.INLINE_STORE_DESTROY_LAUNCHED, enumC4144m9, null, 4, null);
            return a.AbstractC0711a.b.f53438a;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            String str = "Failed to destroy inline store: " + e10.getMessage();
            IronLog.INTERNAL.error(e10.toString());
            a(D5.INLINE_STORE_DESTROY_FAILED, enumC4144m9, kotlin.collections.a.o(h.a("reason", str)));
            return new a.AbstractC0711a.C0712a(str);
        }
    }
}
