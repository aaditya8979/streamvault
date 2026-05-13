package com.ironsource.mediationsdk.demandOnly;

import cn.f0;
import com.ironsource.C4157n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0396a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<C4157n2> f32441a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0396a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public C0396a(@NotNull List<C4157n2> list) {
            tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
            this.f32441a = list;
        }

        public /* synthetic */ C0396a(List list, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4157n2 a(@NotNull String str) {
            Object next;
            tn.p.k(str, "instanceName");
            Iterator<T> it = this.f32441a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (tn.p.f(((C4157n2) next).c(), str)) {
                    break;
                }
            }
            return (C4157n2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public List<C4157n2> a() {
            return this.f32441a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public String b() {
            if (this.f32441a.isEmpty()) {
                return "";
            }
            return "1" + ((C4157n2) f0.t0(this.f32441a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4157n2 get(int i10) {
            if (i10 < 0 || i10 >= this.f32441a.size()) {
                return null;
            }
            return this.f32441a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f32441a.isEmpty();
        }
    }

    @Nullable
    C4157n2 a(@NotNull String str);

    @NotNull
    List<C4157n2> a();

    @NotNull
    String b();

    @Nullable
    C4157n2 get(int i10);

    boolean isEmpty();
}
