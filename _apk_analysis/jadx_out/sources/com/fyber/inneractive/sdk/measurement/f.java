package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f16764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f16765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaEvents f16766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16767d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16768e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f16769f;

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            try {
                if (hVar.f16772a != null) {
                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (TextUtils.isEmpty(hVar.f16776e) || TextUtils.isEmpty(hVar.f16775d)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f16772a) : VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.f16776e, hVar.f16772a, hVar.f16775d);
                }
            } catch (Throwable th2) {
                a(th2);
            }
            if (verificationScriptResourceCreateVerificationScriptResourceWithoutParameters != null) {
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
            }
        }
        return arrayList;
    }

    public final void a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th2.getMessage();
        t0 t0Var = this.f16769f;
        z.a(simpleName, str, t0Var != null ? t0Var.f16695a : null, t0Var != null ? t0Var.f16696b : null);
    }
}
