package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.EnumC4144m9;
import com.ironsource.InterfaceC4045h;
import com.ironsource.Lb;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class InlineStoreActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53429c = "InlineStoreActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f53430d = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f53431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53432b = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f53433a = "inline_store_intent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f53434b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4045h f53435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f53436b;

        public b(InterfaceC4045h interfaceC4045h) {
            this.f53435a = interfaceC4045h;
        }

        public Intent a(Context context) {
            Intent intentA = this.f53435a.a(context);
            intentA.putExtra(a.f53433a, this.f53436b);
            return intentA;
        }

        @NotNull
        public b a(Intent intent) {
            this.f53436b = intent;
            return this;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    private void a(Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 1001);
        v vVar = this.f53431a;
        if (vVar != null) {
            vVar.y();
        }
        a(D5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(final D5 d52, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.c
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.a(map, d52);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, D5 d52) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC4144m9.APP_ACTIVITY.b();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + StringUtils.COMMA + obj);
            }
            Lb.U().q().a(new C5(d52, new JSONObject(map2)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    private void b() {
        requestWindowFeature(1);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1001) {
            v vVar = this.f53431a;
            if (vVar != null) {
                vVar.a(i11, this.f53432b);
            }
            Map<String, Object> map = new HashMap<>();
            String str = "resultCode:" + i11;
            if (this.f53432b) {
                str = str + ",destroyCalled:true";
            }
            map.put(IronSourceConstants.EVENTS_EXT1, str);
            a(D5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(f53429c, "onCreate()");
        try {
            this.f53431a = (v) S9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable(a.f53433a));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            v vVar = this.f53431a;
            if (vVar != null) {
                vVar.j(e10.toString());
            }
            a(D5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v vVar = this.f53431a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra(a.f53434b)) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.f53432b = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v vVar = this.f53431a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }
}
