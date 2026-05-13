package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Cg implements Rl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f65121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S4 f65122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bm f65123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qa f65124e;

    public Cg(@NotNull Context context, @NotNull R4 r42, @NotNull C5053q4 c5053q4, @NotNull Z4 z42) {
        this(context, r42, c5053q4, z42, new S4(), Il.a());
    }

    public Cg(@NotNull Context context, @NotNull R4 r42, @NotNull C5053q4 c5053q4, @NotNull Z4 z42, @NotNull S4 s42, @NotNull Il il2) {
        this.f65120a = context;
        this.f65121b = r42;
        this.f65122c = s42;
        Bm bmA = il2.a(context, r42, c5053q4.f67559a);
        this.f65123d = bmA;
        this.f65124e = z42.a(context, r42, c5053q4.f67560b, bmA);
        il2.a(r42, this);
    }

    @VisibleForTesting
    @NotNull
    public final R4 a() {
        return this.f65121b;
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NotNull Kl kl2, @Nullable C4817gm c4817gm) {
        ((Y4) this.f65124e).getClass();
    }

    public final void a(@NotNull Q5 q52, @NotNull C5053q4 c5053q4) {
        if (!AbstractC5232x9.f67935c.contains(EnumC4703cb.a(q52.f65791d))) {
            this.f65124e.a(c5053q4.f67560b);
        }
        ((Y4) this.f65124e).a(q52);
    }

    public final void a(@NotNull InterfaceC4799g4 interfaceC4799g4) {
        this.f65122c.f65864a.add(interfaceC4799g4);
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NotNull C4817gm c4817gm) {
        ((Y4) this.f65124e).a(c4817gm);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(@NotNull C5053q4 c5053q4) {
        this.f65123d.a(c5053q4.f67559a);
        this.f65124e.a(c5053q4.f67560b);
    }

    @VisibleForTesting
    @NotNull
    public final Context b() {
        return this.f65120a;
    }

    public final void b(@NotNull InterfaceC4799g4 interfaceC4799g4) {
        this.f65122c.f65864a.remove(interfaceC4799g4);
    }
}
