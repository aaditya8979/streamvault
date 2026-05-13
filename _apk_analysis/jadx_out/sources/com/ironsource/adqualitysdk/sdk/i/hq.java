package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ho;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class hq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2401;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<Field> f2402;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ho f2403;

    public class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2405;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ho f2406;

        private a() {
        }

        public /* synthetic */ a(hq hqVar) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m6379() {
            return this.f2406;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void m6380(ho hoVar) {
            this.f2406 = hoVar;
            this.f2405 = hoVar.m6350();
        }

        /* JADX INFO: renamed from: ｋ */
        public boolean mo6378(Field field) {
            if (this.f2406 == null || (field.getModifiers() & this.f2406.m6366()) != this.f2406.m6366() || (field.getModifiers() & this.f2406.m6367()) != 0 || this.f2406.m6352().contains(field.getType())) {
                return false;
            }
            if (this.f2406.m6349() ? field.getType().equals(this.f2406.m6351()) : this.f2406.m6351().isAssignableFrom(field.getType())) {
                int i10 = this.f2405;
                if (i10 == 0) {
                    return true;
                }
                this.f2405 = i10 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m6369(Class cls, ho hoVar) {
        if (hoVar != null && hoVar.m6365()) {
            return m6371(cls, hoVar.m6365(), hoVar.m6368(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6370(Class cls, ho hoVar, List<Field> list) {
        synchronized (hq.class) {
            if (this.f2401 == null) {
                this.f2401 = new a(this);
            }
            this.f2401.m6380(hoVar);
            m6373(cls, this.f2401, list);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m6371(Class cls, boolean z10, int i10, List<String> list) {
        while (cls != null && !kb.m6921(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM6923 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM6923 = kb.m6923(declaredFields, fields);
            if (!z10) {
                return fieldArrM6923;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM6923 = kb.m6923(fieldArrM6923, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM6923 = kb.m6923(fieldArrM6923, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM6923;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ho.a m6372() {
        return new ho.a();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6373(Class cls, a aVar, List<Field> list) {
        for (Field field : m6369(cls, aVar.m6379())) {
            if (aVar.mo6378(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Field m6374(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hq.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hq.a
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final boolean mo6378(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hq.class) {
            if (this.f2402 == null) {
                this.f2402 = new ArrayList();
            }
            this.f2402.clear();
            m6373(cls, aVar, this.f2402);
            if (this.f2402.isEmpty()) {
                return null;
            }
            return this.f2402.get(0);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m6375(Class cls, ho hoVar) {
        synchronized (jx.class) {
            if (this.f2402 == null) {
                this.f2402 = new ArrayList();
            }
            this.f2402.clear();
            m6370(cls, hoVar, this.f2402);
            if (this.f2402.isEmpty()) {
                return null;
            }
            return this.f2402.get(0);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m6376(Class cls, Class<T> cls2) {
        Field fieldM6375;
        synchronized (jx.class) {
            if (this.f2403 == null) {
                this.f2403 = new ho();
            }
            this.f2403.m6353(cls2);
            fieldM6375 = m6375(cls, this.f2403);
        }
        return fieldM6375;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<Field> m6377(Class cls, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        m6370(cls, hoVar, arrayList);
        return arrayList;
    }
}
