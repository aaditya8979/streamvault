package al;

import bn.r;
import com.ironsource.Q6;
import io.ktor.client.HttpClient;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: CreatePluginUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e<PluginConfigT> implements b<PluginConfigT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.a<PluginConfigT> f3990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<d<PluginConfigT>, r> f3991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kl.a<g<PluginConfigT>> f3992c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String str, @NotNull sn.a<? extends PluginConfigT> aVar, @NotNull sn.l<? super d<PluginConfigT>, r> lVar) {
        KType kTypeN;
        p.k(str, "name");
        p.k(aVar, "createConfiguration");
        p.k(lVar, "body");
        this.f3990a = aVar;
        this.f3991b = lVar;
        KClass kClassB = t.b(g.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.Companion;
            KTypeParameter kTypeParameterR = t.r(t.b(e.class), "PluginConfigT", KVariance.INVARIANT, false);
            t.l(kTypeParameterR, t.m(Object.class));
            kTypeN = t.n(g.class, companion.invariant(t.q(kTypeParameterR)));
        } catch (Throwable unused) {
            kTypeN = null;
        }
        this.f3992c = new kl.a<>(str, new rl.a(kClassB, kTypeN));
    }

    @Override // zk.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull g<PluginConfigT> gVar, @NotNull HttpClient httpClient) {
        p.k(gVar, Q6.L);
        p.k(httpClient, "scope");
        gVar.z(httpClient);
    }

    @Override // zk.l
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g<PluginConfigT> b(@NotNull sn.l<? super PluginConfigT, r> lVar) {
        p.k(lVar, "block");
        PluginConfigT pluginconfigtInvoke = this.f3990a.invoke();
        lVar.invoke(pluginconfigtInvoke);
        return new g<>(getKey(), pluginconfigtInvoke, this.f3991b);
    }

    @Override // zk.l
    @NotNull
    public kl.a<g<PluginConfigT>> getKey() {
        return this.f3992c;
    }
}
