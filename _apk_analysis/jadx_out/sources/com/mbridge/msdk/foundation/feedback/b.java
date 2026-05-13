package com.mbridge.msdk.foundation.feedback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.bean.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: FeedbackManager.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f37650d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f37651e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f37652f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f37653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.feedback.bean.a> f37654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f37655c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FeedbackManager.java */
    public static class C0442b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f37656a = new b();
    }

    private b() {
        this.f37653a = new RelativeLayout.LayoutParams(f37651e, f37650d);
        this.f37654b = new ConcurrentHashMap<>();
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityA = a(context);
        if (activityA == null || mBFeedBackDialog == null || activityA.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || activityA.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static b b() {
        return C0442b.f37656a;
    }

    private com.mbridge.msdk.foundation.feedback.bean.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f37654b.containsKey(str)) {
            return this.f37654b.get(str);
        }
        return null;
    }

    public Activity a(Context context) {
        Activity activity;
        Activity activity2;
        Context contextF = c.n().f();
        Activity activity3 = null;
        try {
            activity = contextF instanceof Activity ? (Activity) contextF : null;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            WeakReference<Activity> weakReferenceA = c.n().a();
            if (weakReferenceA != null && (activity2 = weakReferenceA.get()) != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                activity = activity2;
            }
            if (activity == null || activity.isFinishing()) {
                return null;
            }
            if (activity.isDestroyed()) {
                return null;
            }
            return activity;
        } catch (Exception e11) {
            e = e11;
            activity3 = activity;
            e.printStackTrace();
            return activity3;
        }
    }

    public FeedBackButton a(String str) {
        return b(str).i();
    }

    public void a(String str, int i10) {
        b(str).b(i10);
    }

    public void a(String str, int i10, int i11, int i12, float f10, float f11, float f12, String str2, String str3, float f13, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        Context contextD = c.n().d();
        aVarB.a(v0.a(contextD, f10), v0.a(contextD, f11), v0.a(contextD, i10), v0.a(contextD, i11), v0.a(contextD, i12), f12, str2, str3, f13, jSONArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[PHI: r2
      0x006e: PHI (r2v8 com.mbridge.msdk.foundation.feedback.bean.a) = 
      (r2v7 com.mbridge.msdk.foundation.feedback.bean.a)
      (r2v11 com.mbridge.msdk.foundation.feedback.bean.a)
      (r2v14 com.mbridge.msdk.foundation.feedback.bean.a)
     binds: [B:5:0x0035, B:7:0x004e, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r15, int r16, int r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r3 = "_"
            r2.append(r3)
            r4 = 1
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r2 = r14.c(r2)
            r4 = 0
            if (r2 != 0) goto L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r5 = 2
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r2 = r14.c(r2)
            if (r2 != 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r5 = 3
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r2 = r14.c(r2)
            if (r2 != 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r3 = 4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r2 = r14.c(r2)
            if (r2 != 0) goto L6e
            com.mbridge.msdk.foundation.feedback.bean.a r2 = r14.b(r15)
            goto L71
        L6e:
            r2.c(r4)
        L71:
            if (r2 == 0) goto La4
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r2.h()
            java.lang.String r1 = ""
            if (r5 == 0) goto L81
            java.lang.String r3 = r5.getCampaignUnitId()
            r6 = r3
            goto L82
        L81:
            r6 = r1
        L82:
            int r7 = r2.k()
            int r8 = r2.j()
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 != 0) goto L93
            r9 = r18
            goto L94
        L93:
            r9 = r1
        L94:
            if (r5 == 0) goto L9a
            int r4 = r5.getAdType()
        L9a:
            r11 = r4
            r10 = r16
            r12 = r17
            r13 = r19
            com.mbridge.msdk.foundation.same.report.j.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.feedback.b.a(java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }

    public void a(String str, int i10, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVarB.i() != null) {
            aVarB.d(i10);
            if (i10 == 0) {
                a(str, c.n().d(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.feedback.a) null);
            }
        }
    }

    public void a(String str, int i10, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        aVarB.a(new a.g(str, aVar));
        if (i10 == 1) {
            aVarB.g();
        } else {
            aVarB.p();
        }
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.feedback.a aVar) {
        if (a()) {
            com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
            if (aVar != null) {
                aVarB.a(new a.g(str, aVar));
            }
            FeedBackButton feedBackButtonI = aVarB.i();
            if (feedBackButtonI != null) {
                if (layoutParams == null) {
                    int iA = v0.a(c.n().d(), 10.0f);
                    this.f37653a.setMargins(iA, iA, iA, iA);
                    layoutParams = this.f37653a;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonI.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonI);
                }
                Activity activityA = a(context);
                if (activityA != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityA.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonI);
                    viewGroup.addView(feedBackButtonI, layoutParams);
                }
            }
        }
    }

    public void a(String str, CampaignEx campaignEx) {
        b(str).a(campaignEx);
    }

    public void a(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVar != null) {
            aVarB.a(new a.g(str, aVar));
        }
    }

    public void a(String str, FeedBackButton feedBackButton) {
        b(str).a(feedBackButton);
    }

    public void a(String str, String str2) {
        b(str).b(str2);
    }

    public boolean a() {
        g gVarD = h.b().d(c.n().b());
        this.f37655c = gVarD;
        if (gVarD != null) {
            return false;
        }
        this.f37655c = h.b().a();
        return false;
    }

    public boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog != null) {
            return a(context, mBFeedBackDialog);
        }
        q0.c("", "mbAlertDialog  is null");
        return false;
    }

    public com.mbridge.msdk.foundation.feedback.bean.a b(String str) {
        com.mbridge.msdk.foundation.feedback.bean.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f37654b.containsKey(str)) {
            aVar = this.f37654b.get(str);
        } else {
            aVar = new com.mbridge.msdk.foundation.feedback.bean.a(str);
            this.f37654b.put(str, aVar);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.feedback.bean.a aVar2 = new com.mbridge.msdk.foundation.feedback.bean.a(str);
        this.f37654b.put(str, aVar2);
        return aVar2;
    }

    public void b(String str, int i10) {
        b(str).c(i10);
    }

    public void d(String str) {
        try {
            com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(str);
            if (aVarC != null) {
                aVarC.f();
            }
            this.f37654b.remove(str);
            f37652f = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
