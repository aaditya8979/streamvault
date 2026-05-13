package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Lg;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Lg extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25885a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg(Context context, hn.c cVar) {
        super(2, cVar);
        this.f25885a = context;
    }

    public static final boolean a(String str) {
        tn.p.h(str);
        return bo.a0.W(str, "auto_", false, 2, null);
    }

    public static final boolean b(String str) {
        return tn.p.f(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Lg(this.f25885a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Lg(this.f25885a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            Og og2 = Og.f26086a;
            Context context = this.f25885a;
            og2.getClass();
            if (Og.f26089d == null) {
                Og.f26089d = new C3911zg(context, "pub_signals_store");
            }
            C3911zg c3911zg = null;
            try {
                C3911zg c3911zg2 = Og.f26089d;
                if (c3911zg2 == null) {
                    tn.p.C("prefDao");
                    c3911zg2 = null;
                }
                String strA = c3911zg2.a("saved_signals");
                if (strA != null) {
                    JSONObject jSONObject = new JSONObject(strA);
                    Iterator<String> itKeys = jSONObject.keys();
                    tn.p.j(itKeys, "keys(...)");
                    Iterator it = SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.A(ao.r.g(itKeys), new sn.l() { // from class: n9.x2
                        @Override // sn.l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    C3911zg c3911zg3 = Og.f26089d;
                    if (c3911zg3 == null) {
                        tn.p.C("prefDao");
                        c3911zg3 = null;
                    }
                    String string = jSONObject.toString();
                    tn.p.j(string, "toString(...)");
                    c3911zg3.getClass();
                    tn.p.k("saved_signals", "key");
                    tn.p.k(string, "value");
                    c3911zg3.f28644a.a("saved_signals", string, true);
                }
            } catch (Exception e10) {
                C3911zg c3911zg4 = Og.f26089d;
                if (c3911zg4 == null) {
                    tn.p.C("prefDao");
                    c3911zg4 = null;
                }
                c3911zg4.getClass();
                tn.p.k("saved_signals", "key");
                c3911zg4.f28644a.a("saved_signals");
                Og.f26086a.getClass();
                Og.f26090e.a();
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                bn.g gVar = P9.f26117a;
                P9.a(new L2(e10));
            }
            try {
                C3911zg c3911zg5 = Og.f26089d;
                if (c3911zg5 == null) {
                    tn.p.C("prefDao");
                    c3911zg5 = null;
                }
                String strA2 = c3911zg5.a("imp_depth");
                if (strA2 != null) {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    tn.p.j(itKeys2, "keys(...)");
                    Iterator it2 = SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.A(ao.r.g(itKeys2), new sn.l() { // from class: n9.y2
                        @Override // sn.l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    C3911zg c3911zg6 = Og.f26089d;
                    if (c3911zg6 == null) {
                        tn.p.C("prefDao");
                        c3911zg6 = null;
                    }
                    String string2 = jSONObject2.toString();
                    tn.p.j(string2, "toString(...)");
                    c3911zg6.getClass();
                    tn.p.k("imp_depth", "key");
                    tn.p.k(string2, "value");
                    Ea ea2 = c3911zg6.f28644a;
                    ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                    ea2.a("imp_depth", string2, false);
                }
            } catch (Exception unused) {
                C3911zg c3911zg7 = Og.f26089d;
                if (c3911zg7 == null) {
                    tn.p.C("prefDao");
                } else {
                    c3911zg = c3911zg7;
                }
                c3911zg.getClass();
                tn.p.k("imp_depth", "key");
                c3911zg.f28644a.a("imp_depth");
            }
            Og.f26086a.getClass();
            I1 i12 = Og.f26090e;
            i12.f25632c = i12.f25630a.invoke();
            I1 i13 = Og.f26091f;
            i13.f25632c = i13.f25630a.invoke();
        } catch (Exception e11) {
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            bn.g gVar2 = P9.f26117a;
            AbstractC3481i9.a(e11);
        }
        Og.f26086a.getClass();
        I1 i14 = Og.f26090e;
        i14.f25632c = i14.f25630a.invoke();
        I1 i15 = Og.f26091f;
        i15.f25632c = i15.f25630a.invoke();
        return bn.r.f5635a;
    }
}
