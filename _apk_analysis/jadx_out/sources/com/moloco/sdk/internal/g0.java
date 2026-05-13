package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 4)
public abstract class g0<R, E> {

    @StabilityInferred(parameters = 2)
    public static final class a<R, E> extends g0<R, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f46057a;

        public a(E e10) {
            super(null);
            this.f46057a = e10;
        }

        public final E a() {
            return this.f46057a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b<R, E> extends g0<R, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final R f46058a;

        public b(R r10) {
            super(null);
            this.f46058a = r10;
        }

        public final R a() {
            return this.f46058a;
        }
    }

    public g0() {
    }

    public /* synthetic */ g0(tn.i iVar) {
        this();
    }
}
