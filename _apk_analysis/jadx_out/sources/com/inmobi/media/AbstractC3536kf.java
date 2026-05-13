package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3536kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27473a = 0;

    static {
        tn.p.j(AbstractC3536kf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context context) {
        tn.p.k(context, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            return Omid.isActive();
        } catch (Throwable th2) {
            th2.getStackTrace();
            return false;
        }
    }
}
