package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import com.facebook.FacebookException;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FacebookDialogBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 -*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0002\u0014\u0012J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J\b\u0010\u000b\u001a\u00020\nH$J!\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0010H\u0002R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R.\u0010\u001b\u001a\u001a\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010+R*\u0010/\u001a\u0018\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00108$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/facebook/internal/g;", "CONTENT", "RESULT", "", "Landroid/content/Intent;", "intent", "", "requestCode", "Lbn/r;", "startActivityForResult", "Lcom/facebook/internal/a;", "d", "content", C3978d4.a.f31224t, "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/a;", "", "Lcom/facebook/internal/g$b;", "b", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/facebook/internal/u;", "Lcom/facebook/internal/u;", "fragmentWrapper", "Ljava/util/List;", "modeHandlers", "I", "requestCodeField", "Lk2/h;", "e", "Lk2/h;", "getCallbackManager$facebook_common_release", "()Lk2/h;", "setCallbackManager$facebook_common_release", "(Lk2/h;)V", "callbackManager", "value", "g", "()I", "setRequestCode", "(I)V", "()Landroid/app/Activity;", "activityContext", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/util/List;", "orderedModeHandlers", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class g<CONTENT, RESULT> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Object f15356g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u fragmentWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<? extends g<CONTENT, RESULT>.b> modeHandlers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int requestCodeField;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public k2.h callbackManager;

    /* JADX INFO: compiled from: FacebookDialogBase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b¤\u0004\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/g$b;", "", "content", "", "isBestEffort", "a", "(Ljava/lang/Object;Z)Z", "Lcom/facebook/internal/a;", "b", "(Ljava/lang/Object;)Lcom/facebook/internal/a;", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", C3978d4.a.f31224t, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Object mode;

        public abstract boolean a(CONTENT content, boolean isBestEffort);

        @Nullable
        public abstract a b(CONTENT content);

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getMode() {
            return this.mode;
        }
    }

    public static final /* synthetic */ a a(g gVar, Object obj, Object obj2) {
        gVar.c(obj, obj2);
        return null;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "com.facebook");
        activity.startActivityForResult(intent, i10);
    }

    public static void safedk_u_startActivityForResult_5aab9be8fcf10930fe594d39dddaabfb(u uVar, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/u;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "com.facebook");
        uVar.startActivityForResult(intent, i10);
    }

    public final List<g<CONTENT, RESULT>.b> b() {
        if (this.modeHandlers == null) {
            this.modeHandlers = f();
        }
        List<? extends g<CONTENT, RESULT>.b> list = this.modeHandlers;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    public final a c(CONTENT content, Object mode) {
        boolean z10 = mode == f15356g;
        Iterator<g<CONTENT, RESULT>.b> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g<CONTENT, RESULT>.b next = it.next();
            if (!z10) {
                j0 j0Var = j0.f15387a;
                if (!j0.e(next.getMode(), mode)) {
                    continue;
                }
            }
            if (next.a(content, true)) {
                try {
                    next.b(content);
                    break;
                } catch (FacebookException e10) {
                    d();
                    DialogPresenter.d(null, e10);
                }
            }
        }
        d();
        DialogPresenter.b(null);
        return null;
    }

    @NotNull
    public abstract a d();

    @Nullable
    public final Activity e() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        u uVar = this.fragmentWrapper;
        if (uVar == null) {
            return null;
        }
        return uVar.getActivity();
    }

    @NotNull
    public abstract List<g<CONTENT, RESULT>.b> f();

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRequestCodeField() {
        return this.requestCodeField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startActivityForResult(@org.jetbrains.annotations.NotNull android.content.Intent r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "intent"
            tn.p.k(r5, r0)
            android.app.Activity r0 = r4.e()
            boolean r1 = r0 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r1 == 0) goto L20
            com.facebook.internal.DialogPresenter r1 = com.facebook.internal.DialogPresenter.f15276a
            androidx.activity.result.ActivityResultRegistryOwner r0 = (androidx.activity.result.ActivityResultRegistryOwner) r0
            androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
            java.lang.String r1 = "activity as ActivityResultRegistryOwner).activityResultRegistry"
            tn.p.j(r0, r1)
            k2.h r1 = r4.callbackManager
            com.facebook.internal.DialogPresenter.e(r0, r1, r5, r6)
            goto L2d
        L20:
            if (r0 == 0) goto L26
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(r0, r5, r6)
            goto L2d
        L26:
            com.facebook.internal.u r0 = r4.fragmentWrapper
            if (r0 == 0) goto L2f
            safedk_u_startActivityForResult_5aab9be8fcf10930fe594d39dddaabfb(r0, r5, r6)
        L2d:
            r5 = 0
            goto L31
        L2f:
            java.lang.String r5 = "Failed to find Activity or Fragment to startActivityForResult "
        L31:
            if (r5 == 0) goto L48
            com.facebook.internal.a0$a r6 = com.facebook.internal.a0.INSTANCE
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            r1 = 6
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "this.javaClass.name"
            tn.p.j(r2, r3)
            r6.a(r0, r1, r2, r5)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g.startActivityForResult(android.content.Intent, int):void");
    }
}
