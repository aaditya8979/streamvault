package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3611nf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611nf(Context context, hn.c cVar) {
        super(2, cVar);
        this.f27695a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3611nf(this.f27695a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3611nf(this.f27695a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3661pf c3661pf = C3661pf.f27874a;
        Context context = this.f27695a;
        C3735sf c3735sf = C3661pf.f27876c;
        if (c3735sf == null) {
            c3735sf = new C3735sf(context);
            C3661pf.f27876c = c3735sf;
        }
        String strA = c3735sf.f28121a.a("omid_js_string");
        if (strA != null) {
            return strA;
        }
        Context context2 = this.f27695a;
        int i10 = R.raw.inmobi_omid_js;
        tn.p.k(context2, "<this>");
        try {
            InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i10);
            tn.p.j(inputStreamOpenRawResource, "openRawResource(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, bo.c.f5639b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strE = on.k.e(bufferedReader);
                on.b.a(bufferedReader, null);
                return strE;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
