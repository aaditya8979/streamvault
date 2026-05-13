package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3630o9 {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3680q9.f27953a.iterator();
            while (it.hasNext()) {
                Jb jb2 = (Jb) ((WeakReference) it.next()).get();
                if (jb2 != null && (context = (Context) jb2.f25718f.get()) != null) {
                    p000do.l0 l0Var = Sb.f26292a;
                    Rb.a(new Ib(jb2, context, null));
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }
}
