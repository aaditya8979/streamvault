package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: ConfigPropGetter.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f7510b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f7512a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.f7512a == null) {
                this.f7512a = Header.b(com.apm.insight.e.g());
            }
            return this.f7512a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f7511a;

    public e() {
        this(f7510b);
    }

    private e(e eVar) {
        this.f7511a = eVar;
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.f7511a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.f7511a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }
}
