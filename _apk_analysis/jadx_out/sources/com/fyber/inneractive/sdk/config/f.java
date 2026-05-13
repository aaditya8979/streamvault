package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16009a = false;

    public static h0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z10;
        Iterator it;
        h0 h0Var;
        HashMap map;
        String str;
        HashMap map2;
        Iterator it2;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        int i10;
        Set set;
        Integer num;
        Boolean bool;
        UnitDisplayType unitDisplayType2;
        String strB;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        h0 h0Var2 = new h0();
        h0Var2.f16063c = eVar2.f16113c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f16111a;
        h0Var2.f16062b = aVar.f16101b;
        h0Var2.f16061a = aVar.f16100a;
        Iterator it3 = eVar2.f16112b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it3.next();
            HashMap map3 = h0Var2.f16064d;
            String str2 = hVar.f16115a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f16111a;
            HashMap map4 = h0Var2.f16065e;
            j0 j0Var = h0Var2.f16066f;
            q0 q0Var = new q0();
            int i11 = 2;
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = {aVar2, hVar};
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    z10 = true;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i12];
                if (cVar != null && (strB = cVar.b()) != null && strB.equals(com.ironsource.mediationsdk.metadata.a.f32683h)) {
                    z10 = false;
                    break;
                }
                i12++;
                i11 = 2;
            }
            q0Var.f16092b = z10;
            Iterator it4 = hVar.f16121g.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it4.next();
                r0 r0Var = new r0();
                String str3 = iVar.f16122a;
                if (str3 != null) {
                    String str4 = iVar.f16123b;
                    if (str4 != null) {
                        r0Var.f16093a = str3;
                        r0Var.f16094b = str4;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.f16124c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.f16117c;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.f16104e;
                            l0 l0Var = new l0();
                            it = it3;
                            UnitDisplayType unitDisplayType3 = bVar.f16107a;
                            it2 = it4;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                l0Var.f16080b = bVar.f16107a;
                                Integer num2 = bVar.f16109c;
                                Integer num3 = bVar2 != null ? bVar2.f16109c : null;
                                if (bVar3 != null) {
                                    h0Var = h0Var2;
                                    num = bVar3.f16109c;
                                    map = map3;
                                    str = str2;
                                } else {
                                    h0Var = h0Var2;
                                    map = map3;
                                    str = str2;
                                    num = null;
                                }
                                Integer num4 = (Integer) a((Object) null, num2, num3, num);
                                if (num4 != null && num4.intValue() >= 5 && num4.intValue() <= 60) {
                                    l0Var.f16079a = num4;
                                }
                                Boolean bool2 = Boolean.TRUE;
                                Boolean bool3 = bVar.f16108b;
                                Boolean bool4 = bVar2 != null ? bVar2.f16108b : null;
                                if (bVar3 != null) {
                                    bool = bVar3.f16108b;
                                    map2 = map4;
                                } else {
                                    map2 = map4;
                                    bool = null;
                                }
                                Boolean bool5 = (Boolean) a(bool2, bool3, bool4, bool);
                                bool5.getClass();
                                l0Var.f16081c = bool5;
                                Integer num5 = (Integer) a((Object) null, bVar.f16110d, bVar2 != null ? bVar2.f16110d : null, bVar3 != null ? bVar3.f16110d : null);
                                if (num5 != null && num5.intValue() >= 5 && num5.intValue() <= 60) {
                                    l0Var.f16082d = num5;
                                }
                                if (l0Var.f16082d == null && !l0Var.f16081c.booleanValue() && ((unitDisplayType2 = bVar.f16107a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    l0Var.f16081c = bool2;
                                }
                                r0Var.f16095c = l0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                            }
                        } else {
                            h0Var = h0Var2;
                            it = it3;
                            map = map3;
                            str = str2;
                            map2 = map4;
                            it2 = it4;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f16127f;
                        if (jVar != null || iVar.f16126e != null) {
                            if (jVar != null) {
                                UnitDisplayType unitDisplayType4 = jVar.f16138j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.f16124c == null) {
                                    l0 l0Var2 = new l0();
                                    r0Var.f16095c = l0Var2;
                                    l0Var2.f16081c = Boolean.FALSE;
                                    l0Var2.f16082d = -1;
                                    l0 l0Var3 = r0Var.f16095c;
                                    l0Var3.f16080b = unitDisplayType5;
                                    l0Var3.f16079a = -1;
                                }
                            }
                            t0 t0Var = new t0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f16127f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.f16119e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.f16103d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.f16138j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                t0Var.f16158j = unitDisplayType;
                            } else if (iVar.f16126e != null) {
                                t0Var.f16158j = UnitDisplayType.NATIVE;
                                r0Var.f16097e = new p0();
                            } else {
                                it3 = it;
                                it4 = it2;
                                h0Var2 = h0Var;
                                map3 = map;
                                str2 = str;
                                map4 = map2;
                            }
                            Object objA = a((Object) null, jVar2 != null ? jVar2.f16129a : null, jVar3 != null ? jVar3.f16129a : null, jVar4 != null ? jVar4.f16129a : null);
                            if (objA != null) {
                                t0Var.f16149a = (Boolean) objA;
                                t0Var.f16150b = (Integer) a((Object) 5000, jVar2 != null ? jVar2.f16130b : null, jVar3 != null ? jVar3.f16130b : null, jVar4 != null ? jVar4.f16130b : null);
                                Integer num6 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f16131c : null, jVar3 != null ? jVar3.f16131c : null, jVar4 != null ? jVar4.f16131c : null);
                                t0Var.f16151c = Integer.valueOf(num6.intValue() < 0 ? 0 : num6.intValue());
                                t0Var.f16152d = (Boolean) a(Boolean.TRUE, jVar2 != null ? jVar2.f16133e : null, jVar3 != null ? jVar3.f16133e : null, jVar4 != null ? jVar4.f16133e : null);
                                t0Var.f16153e = (Orientation) a(Orientation.USER, jVar2 != null ? jVar2.f16135g : null, jVar3 != null ? jVar3.f16135g : null, jVar4 != null ? jVar4.f16135g : null);
                                Integer num7 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f16137i : null, jVar3 != null ? jVar3.f16137i : null, jVar4 != null ? jVar4.f16137i : null);
                                t0Var.f16154f = Integer.valueOf(num7.intValue() < 0 ? 0 : num7.intValue());
                                Integer num8 = (Integer) a((Object) 2048, jVar2 != null ? jVar2.f16136h : null, jVar3 != null ? jVar3.f16136h : null, jVar4 != null ? jVar4.f16136h : null);
                                if (num8.intValue() > t0Var.f16150b.intValue()) {
                                    num8 = t0Var.f16150b;
                                }
                                t0Var.f16155g = num8;
                                t0Var.f16156h = (Skip) a(Skip._0, jVar2 != null ? jVar2.f16132d : null, jVar3 != null ? jVar3.f16132d : null, jVar4 != null ? jVar4.f16132d : null);
                                t0Var.f16157i = (TapAction) a(TapAction.DO_NOTHING, jVar2 != null ? jVar2.f16134f : null, jVar3 != null ? jVar3.f16134f : null, jVar4 != null ? jVar4.f16134f : null);
                                ArrayList arrayList2 = new ArrayList();
                                com.fyber.inneractive.sdk.config.remote.j jVarA = iVar.a();
                                if (jVarA != null && (arrayList = jVarA.f16139k) != null && arrayList.size() > 0) {
                                    arrayList2 = jVarA.f16139k;
                                }
                                t0Var.f16159k = arrayList2;
                                r0Var.f16098f = t0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                                h0Var2 = h0Var;
                                map3 = map;
                                str2 = str;
                                map4 = map2;
                            }
                        }
                        o0 o0Var = new o0();
                        HashSet hashSet = new HashSet();
                        com.fyber.inneractive.sdk.config.remote.f fVar = iVar.f16125d;
                        Set set2 = fVar != null ? fVar.f16114a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.f16118d;
                        Set set3 = fVar2 != null ? fVar2.f16114a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.f16102c;
                        o0Var.f16088a = (Set) a(hashSet, set2, set3, fVar3 != null ? fVar3.f16114a : null);
                        r0Var.f16096d = o0Var;
                        u0 u0Var = new u0();
                        com.fyber.inneractive.sdk.config.remote.k kVar = iVar.f16128g;
                        com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f16120f;
                        com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f16105f;
                        Integer num9 = (Integer) a((Object) 1, kVar != null ? kVar.f16140a : null, kVar2 != null ? kVar2.f16140a : null, kVar3 != null ? kVar3.f16140a : null);
                        if (num9.intValue() > 0 || num9.intValue() <= 100) {
                            u0Var.f16161a = num9;
                        } else {
                            u0Var.f16161a = 1;
                        }
                        Integer num10 = (Integer) a((Object) 0, kVar != null ? kVar.f16141b : null, kVar2 != null ? kVar2.f16141b : null, kVar3 != null ? kVar3.f16141b : null);
                        if (num10.intValue() >= 0 || num10.intValue() <= 100) {
                            u0Var.f16162b = num10;
                        } else {
                            u0Var.f16162b = 0;
                        }
                        HashSet hashSet2 = new HashSet();
                        Set set4 = kVar != null ? kVar.f16142c : null;
                        Set set5 = kVar2 != null ? kVar2.f16142c : null;
                        if (kVar3 != null) {
                            set = kVar3.f16142c;
                            i10 = 3;
                        } else {
                            i10 = 3;
                            set = null;
                        }
                        Object[] objArr = new Object[i10];
                        objArr[0] = set4;
                        objArr[1] = set5;
                        objArr[2] = set;
                        Set<Vendor> set6 = (Set) a(hashSet2, objArr);
                        u0Var.f16163c = set6;
                        r0Var.f16099g = u0Var;
                        if (j0Var != null && set6 != null) {
                            for (Vendor vendor : set6) {
                                if (vendor != null && !j0Var.f16069a.contains(vendor)) {
                                    j0Var.f16069a.add(vendor);
                                }
                            }
                        }
                        q0Var.f16091a.add(r0Var);
                        HashMap map5 = map2;
                        map5.put(r0Var.f16093a, r0Var);
                        it4 = it2;
                        h0Var2 = h0Var;
                        map3 = map;
                        str2 = str;
                        map4 = map5;
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
            map3.put(str2, q0Var);
            eVar2 = eVar;
        }
        return h0Var2;
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.D.f();
            com.fyber.inneractive.sdk.config.remote.e eVarA = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f15957c;
            if (eVarA != null && str2.equals(eVarA.f16111a.f16100a)) {
                return a(eVarA);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (eVarA != null && !str2.equals(eVarA.f16111a.f16100a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            a(str, th2);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.O.f15957c;
        StringBuilder sb2 = new StringBuilder("https://");
        int i10 = k.f16070a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb2.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append('/');
        sb2.append(str);
        sb2.append(".json");
        String string = sb2.toString();
        IAlog.d("%s: %s", "APP_CONFIG_REQUEST", string);
        return string;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        h0 h0Var = (h0) obj;
        if (h0Var == null || h0Var.f16061a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f19548a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f16061a).apply();
    }

    public final void a(String str, Throwable th2) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f16009a) {
            return;
        }
        this.f16009a = true;
        if (TextUtils.isEmpty(str)) {
            strSubstring = "Empty Json Data";
        } else {
            strSubstring = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th2 != null) {
            name = th2.getClass().getName();
            localizedMessage = th2.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str2 = IAConfigManager.O.f15957c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "EMPTY_APP_ID";
        }
        wVar.a("exception", name, "message", localizedMessage, "data", strSubstring, "appId", str2).a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f19548a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.O.f15957c);
    }
}
