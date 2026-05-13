package io.appmetrica.analytics.impl;

import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4782fd implements Uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5194vl f66773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f66775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f66776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f66777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f66778f;

    public C4782fd(@NotNull InterfaceC5194vl interfaceC5194vl, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<C4705cd> list) {
        this.f66773a = interfaceC5194vl;
        this.f66774b = str;
        this.f66775c = systemTimeProvider;
        this.f66776d = list;
        this.f66777e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f66778f = TimeUnit.DAYS.toMillis(1L);
    }

    public /* synthetic */ C4782fd(InterfaceC5194vl interfaceC5194vl, String str, SystemTimeProvider systemTimeProvider, List list, int i10, tn.i iVar) {
        this(interfaceC5194vl, str, (i10 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }

    @Nullable
    public final Tj a() {
        C5161ud c5161ud;
        C4705cd c4705cd;
        if (this.f66776d.isEmpty()) {
            return null;
        }
        List listX0 = cn.f0.X0(this.f66776d, new C4756ed());
        String strC = ((AbstractC5286zd) this.f66773a).c(this.f66777e, (String) null);
        if (strC != null) {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                zn.i iVarV = zn.n.v(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(cn.x.x(iVarV, 10));
                Iterator<Integer> it = iVarV.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((cn.k0) it).nextInt());
                    try {
                        c4705cd = new C4705cd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean(C3978d4.i.f31359r));
                    } catch (Throwable unused) {
                        c4705cd = new C4705cd("", false);
                    }
                    arrayList.add(c4705cd);
                }
                c5161ud = new C5161ud(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                c5161ud = new C5161ud(cn.w.m(), 0L);
            }
        } else {
            c5161ud = null;
        }
        long jCurrentTimeMillis = this.f66775c.currentTimeMillis();
        if (c5161ud != null && jCurrentTimeMillis - c5161ud.f67782b <= this.f66778f && tn.p.f(listX0, c5161ud.f67781a)) {
            return null;
        }
        C5161ud c5161ud2 = new C5161ud(listX0, jCurrentTimeMillis);
        InterfaceC5194vl interfaceC5194vl = this.f66773a;
        AbstractC5286zd abstractC5286zd = (AbstractC5286zd) interfaceC5194vl;
        return new Tj(this.f66774b + "_status", c5161ud2.a());
    }
}
