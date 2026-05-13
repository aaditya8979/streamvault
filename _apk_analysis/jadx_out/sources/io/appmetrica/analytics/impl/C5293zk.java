package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5293zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4673b7 f68072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z6 f68073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T2 f68074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U2 f68075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5134tb f68076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5159ub f68077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5146tn f68078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5171un f68079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f68080i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f68081j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f68082k = new LinkedHashMap();

    public C5293zk(File file) {
        this.f68072a = new C4673b7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        T2 t22 = this.f68074c;
        if (t22 != null) {
            return t22;
        }
        T2 t23 = new T2(new C5094rl(f(context)), "binary_data");
        this.f68074c = t23;
        return t23;
    }

    public final synchronized IBinaryDataHelper a(Context context, R4 r42) {
        Object t22;
        String str = new I4(r42).f65351a;
        LinkedHashMap linkedHashMap = this.f68082k;
        t22 = linkedHashMap.get(str);
        if (t22 == null) {
            t22 = new T2(new C5094rl(c(context, r42)), "binary_data");
            linkedHashMap.put(str, t22);
        }
        return (IBinaryDataHelper) t22;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        U2 u22;
        u22 = this.f68075d;
        if (u22 == null) {
            u22 = new U2(a(context));
            this.f68075d = u22;
        }
        return u22;
    }

    public final synchronized Ia b(Context context, R4 r42) {
        Object c5134tb;
        String str = new I4(r42).f65351a;
        LinkedHashMap linkedHashMap = this.f68081j;
        c5134tb = linkedHashMap.get(str);
        if (c5134tb == null) {
            c5134tb = new C5134tb(new C5094rl(c(context, r42)));
            linkedHashMap.put(str, c5134tb);
        }
        return (Ia) c5134tb;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Z6 c(Context context, R4 r42) {
        Object z62;
        String str = new I4(r42).f65351a;
        LinkedHashMap linkedHashMap = this.f68080i;
        z62 = linkedHashMap.get(str);
        if (z62 == null) {
            C4673b7 c4673b7 = this.f68072a;
            String strA = new C4647a7(c4673b7.f66430a, c4673b7.f66431b, false).a(context, new I4(r42));
            N6 n62 = AbstractC5228x5.f67930c;
            n62.getClass();
            Object[] objArr = new Object[1];
            String str2 = r42.f65832b;
            if (str2 == null) {
                str2 = C3978d4.i.Z;
            }
            objArr[0] = str2;
            String str3 = String.format("component-%s", objArr);
            C4869in c4869in = n62.f65626c;
            X6 x62 = n62.f65624a;
            P6 p62 = x62.f66150a;
            Q6 q62 = x62.f66151b;
            C5059qa c5059qa = new C5059qa(false);
            c5059qa.a(112, new L4());
            C4947ln c4947ln = new C4947ln(str3, n62.f65625b.f67812a);
            c4869in.getClass();
            z62 = new Z6(context, strA, new C4895jn(p62, q62, c5059qa, c4947ln), PublicLogger.getAnonymousInstance());
            linkedHashMap.put(str, z62);
        }
        return (Z6) z62;
    }

    public final synchronized Ia d(Context context) {
        C5159ub c5159ub;
        c5159ub = this.f68077f;
        if (c5159ub == null) {
            C5134tb c5134tb = this.f68076e;
            if (c5134tb == null) {
                c5134tb = new C5134tb(new C5094rl(f(context)));
                this.f68076e = c5134tb;
            }
            c5159ub = new C5159ub(c5134tb);
            this.f68077f = c5159ub;
        }
        return c5159ub;
    }

    public final synchronized Ia e(Context context) {
        C5134tb c5134tb;
        c5134tb = this.f68076e;
        if (c5134tb == null) {
            c5134tb = new C5134tb(new C5094rl(f(context)));
            this.f68076e = c5134tb;
        }
        return c5134tb;
    }

    public final synchronized Z6 f(Context context) {
        Z6 z62;
        z62 = this.f68073b;
        if (z62 == null) {
            C4673b7 c4673b7 = this.f68072a;
            String strA = new C4647a7(c4673b7.f66430a, c4673b7.f66431b, true).a(context, new C4815gk());
            N6 n62 = AbstractC5228x5.f67930c;
            n62.getClass();
            HashMap map = new HashMap();
            map.put("preferences", InterfaceC5153u5.f67769a);
            map.put("binary_data", AbstractC5103s5.f67663a);
            map.put("temp_cache", AbstractC5221wn.f67914a);
            Iterator<ModuleServicesDatabase> it = C5009oa.I.p().b().iterator();
            while (it.hasNext()) {
                for (TableDescription tableDescription : it.next().getTables()) {
                    map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                }
            }
            C4869in c4869in = n62.f65626c;
            X6 x62 = n62.f65624a;
            V6 v62 = x62.f66154e;
            W6 w62 = x62.f66155f;
            C5059qa c5059qa = new C5059qa(false);
            c5059qa.a(114, new C4841hk());
            Iterator<ModuleServicesDatabase> it2 = C5009oa.I.p().b().iterator();
            while (it2.hasNext()) {
                Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                while (it3.hasNext()) {
                    for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                        c5059qa.a(entry.getKey(), entry.getValue());
                    }
                }
            }
            C4947ln c4947ln = new C4947ln("service database", map);
            c4869in.getClass();
            z62 = new Z6(context, strA, new C4895jn(v62, w62, c5059qa, c4947ln), PublicLogger.getAnonymousInstance());
            this.f68073b = z62;
        }
        return z62;
    }
}
