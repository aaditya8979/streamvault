package xo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;
import yo.e1;
import yo.h1;
import yo.i1;
import yo.l1;
import yo.r0;
import yo.t0;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements so.w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1101a f87008d = new C1101a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f87009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final zo.c f87010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final yo.e0 f87011c;

    /* JADX INFO: renamed from: xo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Json.kt */
    public static final class C1101a extends a {
        public C1101a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), zo.d.a(), null);
        }

        public /* synthetic */ C1101a(tn.i iVar) {
            this();
        }
    }

    public a(f fVar, zo.c cVar) {
        this.f87009a = fVar;
        this.f87010b = cVar;
        this.f87011c = new yo.e0();
    }

    public /* synthetic */ a(f fVar, zo.c cVar, tn.i iVar) {
        this(fVar, cVar);
    }

    @Override // so.j
    @NotNull
    public zo.c a() {
        return this.f87010b;
    }

    @Override // so.w
    @NotNull
    public final <T> String b(@NotNull so.l<? super T> lVar, T t10) {
        tn.p.k(lVar, "serializer");
        t0 t0Var = new t0();
        try {
            r0.b(this, t0Var, lVar, t10);
            return t0Var.toString();
        } finally {
            t0Var.g();
        }
    }

    @Override // so.w
    public final <T> T c(@NotNull so.c<? extends T> cVar, @NotNull String str) {
        tn.p.k(cVar, "deserializer");
        tn.p.k(str, TypedValues.Custom.S_STRING);
        h1 h1VarA = i1.a(this, str);
        T t10 = (T) new e1(this, WriteMode.OBJ, h1VarA, cVar.getDescriptor(), null).A(cVar);
        h1VarA.x();
        return t10;
    }

    public final <T> T d(@NotNull so.c<? extends T> cVar, @NotNull JsonElement jsonElement) {
        tn.p.k(cVar, "deserializer");
        tn.p.k(jsonElement, "element");
        return (T) l1.a(this, jsonElement, cVar);
    }

    @NotNull
    public final f e() {
        return this.f87009a;
    }

    @NotNull
    public final yo.e0 f() {
        return this.f87011c;
    }
}
