package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import com.inmobi.ads.R;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class R2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2 f26218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ya f26219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3375e5 f26221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f26222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3401f5 f26223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f26225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f26226j;

    public R2(String str, P2 p22, Context context, Rh rh2, InterfaceC3613nh interfaceC3613nh, Ya ya2, String str2) {
        tn.p.k(str, "urlToLoad");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(interfaceC3613nh, "redirectionValidator");
        tn.p.k(str2, "api");
        this.f26217a = str;
        this.f26218b = p22;
        this.f26219c = ya2;
        this.f26220d = str2;
        C3375e5 c3375e5 = new C3375e5();
        this.f26221e = c3375e5;
        this.f26223g = new C3401f5(rh2, ya2);
        this.f26225i = new WeakReference(rh2);
        this.f26226j = new WeakReference(interfaceC3613nh);
        tn.p.k(this, "connectionCallback");
        c3375e5.f27090c = this;
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        this.f26222f = applicationContext;
        Ji.a(context, this);
    }

    public final CustomTabsIntent.Builder a(P2 p22) {
        Bitmap bitmap;
        C3375e5 c3375e5 = this.f26221e;
        CustomTabsSession customTabsSessionNewSession = c3375e5.f27091d;
        if (customTabsSessionNewSession == null) {
            CustomTabsClient customTabsClient = c3375e5.f27088a;
            customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C3350d5(c3375e5)) : null;
            c3375e5.f27091d = customTabsSessionNewSession;
        }
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder(customTabsSessionNewSession).setCloseButtonPosition(2);
        tn.p.j(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            tn.p.h(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (Error e10) {
            e10.getMessage();
        }
        if (p22.f26107b) {
            Context context = this.f26222f;
            int i10 = R.drawable.im_close_transparent;
            tn.p.k(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i10);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                tn.p.j(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                tn.p.j(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        L5 l5H = J5.h();
        Df dfA = Ef.a(J5.g());
        if (dfA == Df.f25325b || dfA == Df.f25327d) {
            int i11 = (int) (l5H.f25855a * p22.f26106a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i11 * l5H.f25857c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i11);
        } else {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (l5H.f25856b * p22.f26106a)) * l5H.f25857c), 2);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        Rh rh2 = (Rh) this.f26225i.get();
        if (rh2 != null) {
            InterfaceC3580m9 interfaceC3580m9 = rh2.f26262a.f26958i;
            if (interfaceC3580m9 != null) {
                String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                tn.p.j(str, "access$getTAG$cp(...)");
                ((C3605n9) interfaceC3580m9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = rh2.f26262a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", F3.a(i10));
            jSONObject2.put("top", F3.a(i11));
            jSONObject2.put("right", F3.a(i12));
            jSONObject2.put("bottom", F3.a(i13));
            jSONObject2.put("state", i14);
            bn.r rVar = bn.r.f5635a;
            jSONObject.put("layout", jSONObject2);
            gestureDetectorOnGestureListenerC3337ci.b(jSONObject);
        }
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession customTabsSessionNewSession;
        P2 p22 = this.f26218b;
        if (p22 != null) {
            try {
                builder = a(p22);
            } catch (Error e10) {
                e10.getMessage();
                C3375e5 c3375e5 = this.f26221e;
                CustomTabsSession customTabsSession = c3375e5.f27091d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = c3375e5.f27088a;
                    customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C3350d5(c3375e5)) : null;
                    c3375e5.f27091d = customTabsSessionNewSession;
                    customTabsSession = customTabsSessionNewSession;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            C3375e5 c3375e52 = this.f26221e;
            CustomTabsSession customTabsSession2 = c3375e52.f27091d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = c3375e52.f27088a;
                customTabsSessionNewSession = customTabsClient2 != null ? customTabsClient2.newSession(new C3350d5(c3375e52)) : null;
                c3375e52.f27091d = customTabsSessionNewSession;
                customTabsSession2 = customTabsSessionNewSession;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        Context context = this.f26222f;
        CustomTabsIntent customTabsIntentBuild = builder.build();
        tn.p.j(customTabsIntentBuild, "build(...)");
        Rh rh2 = (Rh) this.f26225i.get();
        Ya ya2 = this.f26219c;
        Object obj = this.f26226j.get();
        tn.p.h(obj);
        AbstractC3298b5.a(context, customTabsIntentBuild, uri, rh2, ya2, (InterfaceC3613nh) obj, this.f26220d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3375e5 c3375e5 = this.f26221e;
        Context context = this.f26222f;
        c3375e5.getClass();
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        C3324c5 c3324c5 = c3375e5.f27089b;
        if (c3324c5 != null) {
            context.unbindService(c3324c5);
            c3375e5.f27088a = null;
        }
        c3375e5.f27089b = null;
        c3375e5.f27090c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }
}
