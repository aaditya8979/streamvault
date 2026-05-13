package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f2419;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dn f2420;

    public static class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hr f2421;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f2422;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m6417(Method method) {
            if (this.f2421 == null || (method.getModifiers() & this.f2421.m6366()) != this.f2421.m6366() || (method.getModifiers() & this.f2421.m6367()) != 0 || this.f2421.m6392().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2421.m6387() != -1 && this.f2421.m6387() != parameterTypes.length) {
                return false;
            }
            List<Class> listM6388 = this.f2421.m6388();
            if (listM6388 != null) {
                if (listM6388.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM6388.size(); i10++) {
                    if (!listM6388.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2421.m6391() != null ? this.f2421.m6389() ? method.getReturnType().equals(this.f2421.m6391()) : this.f2421.m6391().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2422;
                if (i11 == 0) {
                    return true;
                }
                this.f2422 = i11 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m6418(hr hrVar) {
            this.f2421 = hrVar;
            this.f2422 = hrVar.m6390();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final hr m6419() {
            return this.f2421;
        }
    }

    public hs() {
    }

    public hs(dn dnVar, hs hsVar) {
        this.f2420 = dnVar;
        this.f2419 = hsVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m6406(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m6409(cls, hrVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6407(Class cls, a aVar, List<Method> list) {
        hr hrVarM6419 = aVar.m6419();
        for (Method method : (hrVarM6419 == null || !hrVarM6419.m6365()) ? Arrays.asList(cls.getDeclaredMethods()) : m6410(cls, hrVarM6419.m6365(), hrVarM6419.m6368())) {
            if (aVar.m6417(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m6408(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m6409(cls, hrVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6409(Class cls, hr hrVar, List<Method> list) {
        a aVar = new a((byte) 0);
        aVar.m6418(hrVar);
        m6407(cls, aVar, list);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Method> m6410(Class cls, boolean z10, int i10) {
        Method[] methodArrM6931 = new Method[0];
        if (cls != null) {
            methodArrM6931 = kb.m6931(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM6931);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM6931 = kb.m6931(kb.m6931(methodArrM6931, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM6931);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cdo> m6411() {
        ArrayList arrayList = new ArrayList(this.f2420.m6093());
        hs hsVar = this.f2419;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m6411());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m6412() {
        return this.f2419;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ds m6413(String str) {
        ds dsVar;
        hs hsVar = this;
        do {
            dsVar = hsVar.f2420.m6095().get(str);
            if (dsVar != null) {
                break;
            }
            hsVar = hsVar.f2419;
        } while (hsVar != null);
        return dsVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6414() {
        return this.f2420.m6097();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dl m6415(String str) {
        dl dlVar;
        hs hsVar = this;
        do {
            dlVar = hsVar.f2420.m6092().get(str);
            if (dlVar != null) {
                break;
            }
            hsVar = hsVar.f2419;
        } while (hsVar != null);
        return dlVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m6416() {
        ArrayList arrayList = new ArrayList(this.f2420.m6098());
        hs hsVar = this.f2419;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m6416());
        }
        return arrayList;
    }
}
