package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16658b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16659c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16660d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16661e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16662f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f16663g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16664h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f16665i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f16666j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16667k = new ArrayList();

    public c(boolean z10) {
        this.f16657a = true;
        this.f16657a = z10;
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) {
        int iE = o.e();
        int iD = o.d();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar == null || fVar.f16852c == null) {
            IAlog.a("%sno inline found", "VastProcessor: ");
            throw new h("ErrorNoMediaFiles", "Empty inline ad found");
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.f16660d, iE, iD), new d(iE, iD));
        bVar.f16821a = str;
        ArrayList arrayList = fVar.f16852c.f16855c;
        if (arrayList != null) {
            List list2 = list;
            if (!arrayList.isEmpty()) {
                if (list == null) {
                    list2 = list;
                    if (fVar.f16851b != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(fVar);
                        list2 = arrayList2;
                    }
                }
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).f16851b;
                        if (a0Var != null) {
                            a(bVar, a0Var);
                        }
                    }
                }
                a(bVar, fVar.f16852c);
                if (bVar.f16824d.size() == 0) {
                    if (this.f16663g.isEmpty()) {
                        throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                    }
                    throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                }
                ArrayList<com.fyber.inneractive.sdk.model.vast.c> arrayList3 = new ArrayList(bVar.f16827g);
                Collections.sort(arrayList3, bVar.f16828h);
                if (!arrayList3.isEmpty()) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar : this.f16666j) {
                        if (!hVar.a()) {
                            for (com.fyber.inneractive.sdk.model.vast.c cVar : arrayList3) {
                                ArrayList arrayList4 = hVar.f16868h;
                                if (arrayList4 != null) {
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        cVar.a(x.EVENT_CLICK, (String) it2.next());
                                    }
                                }
                                String str2 = hVar.f16867g;
                                if (TextUtils.isEmpty(cVar.f16843g)) {
                                    cVar.f16843g = str2;
                                }
                                ArrayList<w> arrayList5 = hVar.f16870j;
                                if (arrayList5 != null) {
                                    for (w wVar : arrayList5) {
                                        x xVarA = x.a(wVar.f16904a);
                                        String str3 = wVar.f16905b;
                                        if (xVarA != null && str3 != null) {
                                            cVar.a(xVarA, str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (IAlog.f19500a == 2) {
                    IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                    Iterator it3 = new ArrayList(bVar.f16824d).iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i10), (r) it3.next());
                        i10++;
                    }
                }
                if (IAlog.f19500a == 2) {
                    IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                    ArrayList arrayList6 = new ArrayList(bVar.f16827g);
                    Collections.sort(arrayList6, bVar.f16828h);
                    if (arrayList6.size() > 0) {
                        Iterator it4 = arrayList6.iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i11), ((com.fyber.inneractive.sdk.model.vast.c) it4.next()).a());
                            i11++;
                        }
                    } else {
                        IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                    }
                }
                return bVar;
            }
        }
        throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r18, com.fyber.inneractive.sdk.model.vast.g r19) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.g):void");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i10) throws b {
        String str;
        List list;
        Integer num;
        Integer num2;
        String str2;
        ArrayList<String> arrayList = hVar.f16868h;
        if (arrayList.size() > 0) {
            for (String str3 : arrayList) {
                if (!h0.e(str3)) {
                    throw new b("Found non-secure click tracking url for companion. url: " + str3, 0);
                }
            }
            if (i10 > 0) {
                this.f16665i.add(hVar);
            }
        }
        String str4 = hVar.f16867g;
        if (!h0.e(str4)) {
            throw new b("Found non-secure click through url: " + str4, 0);
        }
        if (!hVar.a()) {
            if (this.f16666j.contains(hVar)) {
                return;
            }
            this.f16666j.add(hVar);
            return;
        }
        Integer num3 = hVar.f16861a;
        Integer num4 = hVar.f16862b;
        if (num3 == null || num4 == null || num3.intValue() < 100 || num4.intValue() < 100) {
            throw new b("Incompatible size: " + num3 + StringUtils.COMMA + num4, 16);
        }
        ArrayList<w> arrayList2 = hVar.f16870j;
        for (w wVar : arrayList2) {
            if (!h0.e(wVar.f16905b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str5 = hVar.f16863c;
        l lVar = hVar.f16864d;
        if (lVar != null) {
            k kVarA = k.a(lVar.f16872a);
            if (kVarA == null) {
                throw new b("Found invalid creative type: " + lVar.f16872a, 32);
            }
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i10, num3.intValue(), num4.intValue(), str5, str4, arrayList, list, lVar.f16873b, kVarA);
        } else {
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
        }
        String str6 = hVar.f16865e;
        if (!TextUtils.isEmpty(str6)) {
            if (!h0.e(str6)) {
                throw new b("Found non-secure iframe url: " + str6, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i10, num2.intValue(), num.intValue(), str, str2, arrayList, list, str6, null);
        }
        String str7 = hVar.f16866f;
        if (!TextUtils.isEmpty(str7)) {
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Html, i10, num2.intValue(), num.intValue(), str, str2, arrayList, list, str7, null);
        }
        bVar.f16827g.size();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r10, com.fyber.inneractive.sdk.model.vast.i r11, int r12, int r13, int r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, java.lang.String r19, com.fyber.inneractive.sdk.model.vast.k r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.i, int, int, int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.fyber.inneractive.sdk.model.vast.k):void");
    }
}
