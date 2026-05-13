package xo;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements KSerializer<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f87019a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87020b = a.f87021b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f87021b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f87022c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f87023a = to.a.k(to.a.J(tn.x.f85368a), p.f87062a).getDescriptor();

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean b() {
            return this.f87023a.b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(@NotNull String str) {
            tn.p.k(str, "name");
            return this.f87023a.c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public SerialDescriptor d(int i10) {
            return this.f87023a.d(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return this.f87023a.e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public String f(int i10) {
            return this.f87023a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public List<Annotation> g(int i10) {
            return this.f87023a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public List<Annotation> getAnnotations() {
            return this.f87023a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public uo.k getKind() {
            return this.f87023a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public String h() {
            return f87022c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean i(int i10) {
            return this.f87023a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f87023a.isInline();
        }
    }

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        q.g(decoder);
        return new JsonObject((Map) to.a.k(to.a.J(tn.x.f85368a), p.f87062a).deserialize(decoder));
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonObject jsonObject) {
        tn.p.k(encoder, "encoder");
        tn.p.k(jsonObject, "value");
        q.h(encoder);
        to.a.k(to.a.J(tn.x.f85368a), p.f87062a).serialize(encoder, jsonObject);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f87020b;
    }
}
