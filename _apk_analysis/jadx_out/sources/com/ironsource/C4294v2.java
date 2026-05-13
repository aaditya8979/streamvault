package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4266t8;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4294v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C4294v2 f34241a;

    /* JADX INFO: renamed from: com.ironsource.v2$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34242a;

        static {
            int[] iArr = new int[C4266t8.a.values().length];
            f34242a = iArr;
            try {
                iArr[C4266t8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34242a[C4266t8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34242a[C4266t8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C4294v2 a() {
        C4294v2 c4294v2 = f34241a;
        return c4294v2 == null ? new C4294v2() : c4294v2;
    }

    public boolean a(Activity activity) {
        if (a.f34242a[C4038ga.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) S9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
